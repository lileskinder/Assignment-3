# Assignment-3
Write a program that calculates the cost to send packages within the US. There are 3 different ways to send a package:
1.	with UPS.
The cost to send a package with UPS is specified as follows:
Rate = $0.45 * number of pounds.
2.	with US Mail.
The cost to send a package with US Mail is specified as follows:
If the weight is less than 3 pound, then the cost is $1.00.
If the weight is larger than 3 pounds, then the cost is $0.55 per pound.
3.	with FedEx.
The cost to send a package with FedEx Mail depends on the zone where you send the package to and is specified as follows:
Total cost in dollars = zone * number of pounds where zone is specified as follows:
Zone = 0.35 for IA, MT, OR and CA
Zone = 0.30 for TX, and UT
Zone = 0.55 for FL, MA and OH
Zone = 0.43 for all others

The program should ask the user for a number of packages. For every package the user enters the package description, the weight and the zone. The program then calculates for every package the lowest price, and prints this to the screen together with the carrier name.
Example output:

Baby stroller		$20.00		FedEx
Computer monitor	$23.80		US Mail
Modem		$5.60		US Mail

Make sure you program is open for extension, but closed for change. 
You succeeded in this lab when you can add a new carrier (for example DHL) without much code change, only code extension.
Also make sure you program to interfaces, rather than implementation. 

Before you start, first create a class diagram of your design on paper.   



Use the following data as input to your program :

1)	 Book  -  2 pounds  -  IA is the zone
2)	 Phone  -  4 pounds  -  MA is the zone
3)	 Boots  -   6 pounds  -  NY is the zone

The output for the above input is :

   Book    $0.70    Fedex
   Phone   $1.80    UPS
   Boots    $2.58    Fedex


To read double values from the input, you can make use of the following method:

public static double getDouble() throws IOException // reads an double from the keyboard input
      {
      String s = getString();
      return (Double.valueOf(s)).doubleValue();
      }



To convert doubles to strings you can use the Double.toString() function:
Example:
double totalcost = 22.06;
putText(Double.toString(totalcost));
