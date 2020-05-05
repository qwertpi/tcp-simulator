# tcp-simulator
I was trying to get my head around how TCP works so I wrote some pseudo-code and then I realized I might as well write some actual code that I can run to check if I am correct.  
Thanks to https://packetlife.net/blog/2010/jun/7/understanding-tcp-sequence-acknowledgment-numbers/ for providing a source which I could reference when figuring out exactly how TCP works and also for being a source of test data.  
The code uses one variable for both the seq of a and the ack of b which is obviously not how real TCP works but it still provides an accurate simulation, the fancy version of the code that runs as two seperate processes will have seperate variables.

Feedback and pull requests are welcome
## Copyright
Copyright © 2019  Rory Sharp All rights reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

You should have received a copy of the GNU General Public License
along with this program.  If you have not received this, see <http://www.gnu.org/licenses/gpl-3.0.html>.

For a summary of the license go to https://tldrlegal.com/license/gnu-general-public-license-v3-(gpl-3)
## Installation
### Prerequisites
* Scala
* Scalac (optional)
## Process
0\. Download this repo (`git clone https://github.com/qwertpi/tcp-simulator.git`)  
1\. Either run as a script (`scala DESIREDPROGRAM.scala`) or compile (`scalac DESIREDPROGRAM.scala`) then run the compiled code (`scala DESIREDPROGRAM`)
## Basic.scala
This is the simple simulation which I originaly wrote, simply press enter to advance the code when neccacry
To run this either do `scala basic.scala` or `scalac basic.scala && scala basictcp`
## A.scala and B.scala
COMING SOON!  
If I ever get around to writing this, this will be two separate programs which can be ran as two separate process on either the same computer or two different computers. This will probably stick all the TCP transmissions in a text file in a location where it can be read by both programs
