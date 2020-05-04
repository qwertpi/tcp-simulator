# tcp-simulator
I was trying to get my head around how TCP works so I wrote some pseudocode and then I relalised I might aswell write some actual code that I can run to check if I am correct
## Copyright
Copyright © 2019  Rory Sharp All rights reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

You should have received a copy of the GNU General Public License
along with this program.  If you have not received this, see <http://www.gnu.org/licenses/gpl-3.0.html>.

For a summary of the licence go to https://tldrlegal.com/license/gnu-general-public-license-v3-(gpl-3)
## Installation
### Prerequites
* Scala
* Scalac (optional)
## Process
0\. Download this repo (`git clone https://github.com/qwertpi/tcp-simulator.git`)  
1\. Either run as a script (`scala DESIREDPROGRAM.scala`) or compile (`scalac DESIREDPROGRAM.scala`) then run the compiled code (`scalac DESIREDPROGRAM`)
## Basic.scala
This is the simple simulation which I originaly wrote, simply press enter to advance the code when necacry
To run this either do `scala basic.scala` or `scalac basic.scala && scala basictcp`
## A.scala and B.scala
COMING SOON!  
If I ever get around to writing this, this will be two seperate programs which can be ran as two seprarte process on either the same computer or two different computers. This will probably stick all the TCP transimitions in a text file in a location where it can be read by both programs
