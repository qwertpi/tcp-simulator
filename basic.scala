import scala.io.StdIn.readLine
import util.Random
import math.abs

object basictcp extends App {
    def seq_gen(): Int ={
        return abs(Random.nextInt())
    }

    def WaitForUser() ={
        print("...")
        readLine()
        println("")
        println("")
    }

    println("Starting TCP Handshake")
    println("Computer A is generating a random sequence number  ")
    var a_seq: Int = seq_gen()
    
    println(s"A sends SYN, seq=$a_seq, len=0")
    WaitForUser()
    
    println("Computer B receives the packet from A and will increment the received sequence number by one as part of the ACK process")
    println("Computer B also needs to pick it's own random sequence number and ensure this reaches A")
    var b_seq: Int = seq_gen()
    a_seq += 1
    println(s"B sends SYN/ACK, seq=$b_seq, ack=$a_seq, len=0")
    WaitForUser()
    
    println("Computer A receives B's ACK and B's sequence number")
    b_seq += 1
    println("Computer A will now increment and ACK B's sequence number")
    println(s"A sends ACK, seq=$a_seq, ack=$b_seq, len=0")
    
    println("TCP handshake complete, both devices are now standing by for data transmission")
    var data_size: Int = 0
    var device: Char = 'C'
    var not_done: Boolean = true
    while (not_done) {
        print("Enter the device to send data to. Enter X to exit. A/B/X?  ")
        //.charAt is required to convert string to char
        device = readLine().toUpperCase().charAt(0)
        println("")
        if ((device == 'A') || (device == 'B')){
            print(s"Enter size of data to send to $device. Enter 0 to exit.  ")
            data_size = readLine().toInt
            if (data_size == 0) {
                not_done = false
            }
            else {
                if (device == 'A') {
                    println("")
                    println(s"B sends ACK, seq=$b_seq, ack=$a_seq, len=$data_size")
                    println(s"B increments its internal seq by $data_size ready for the next packet it sends")
                    b_seq += data_size
                    WaitForUser()
                    
                    println("A measures the size of the data it receives and increments its ACK accordingly")
                    println(s"A sends ACK, seq=$a_seq, ack=$b_seq, len=0")
                }
                else {
                    println("")
                    println(s"A sends ACK, seq=$a_seq, ack=$b_seq, len=$data_size")
                    println(s"A increments its internal seq by $data_size ready for the next packet it sends")
                    a_seq += data_size
                    WaitForUser()
                    
                    println("B measures the size of the data it receives and increments its ACK accordingly")
                    println(s"B sends ACK, seq=$b_seq, ack=$a_seq, len=0")
                }
            }
        }
        else {
            not_done = false
        }
        
    }
    println("TCP tear-down")
    println(s"A sends FIN, seq=$a_seq, ack=$b_seq")
    WaitForUser()
    
    a_seq += 1
    println("B increments A's seq by 1 as part of ACKing  the FIN, and confirms it is OK to FIN by sending its own FIN request")
    println(s"B sends FIN/ACK, seq=$b_seq, ack=$a_seq")
    WaitForUser()
    
    b_seq += 1
    println("A increments B's seq by 1 as part of ACKing the FIN")
    println(s"A sends FIN, seq=$a_seq, ack=$b_seq")
}
