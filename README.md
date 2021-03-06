# Solution to the Eight Queen Problem/Puzzle

### Description of Problem
>Is it possible to place 8 queens on a standard chess board without any queen being able to 
attack any other queen?  If so, how many solutions are possible?

>What about solutions possible if we change the board size? What happens if we have a 5 x 5 board or 10 x 10?  

>See Full Details here [Wikipedia Article on the 8 Queen Puzzle](https://en.wikipedia.org/wiki/Eight_queens_puzzle)

### Plan for Solution
> The first thing we need is a good representation for the state of the queens on the board.  The representation
used here is a string of integers, based on index origin 0, which represents the position of the queens.
>This has several nice advantages:
<ol>
<li>If the length of the string matches the board length and width, then we are guaranteed there is only 1
queen per rank (or row) and file (or column).
<li>If we generate a set of integers with no duplicates (say 01234567 instead of 01102233) then we are guaranteed
also that there is only 1 queen per rank/row and file/column.
<li>The combination of the two above will guarantee non-attacking in every rank and file.
<li>We will be able to address diagonal attacks by creating a method which will tell us whether the paricular
combination of ordinal integers is non-attacking or not.
</ol>

>The next thing we need is a way to permute a set of integers to come up with every possible permutation
of those integers.  We'll use a recursive method for this and there are many examples available on how this
can be implemented.

>We will need a method to tell us if the queens are attacked on the diagonal or not.

>We wil need a way to determine which solutions are unique and which solutions are just a rotation or mirror
of the board and therefore duplicates or already found solutions.

>Lastly we will need a way to appropriately display the solution such that it is easy to read and can be verified against the known
solutions.  Printing out the chess board with the queen positions labeled will do the job nicely.

### Prerequisites
* java 1.8+
* git
* gradle 

### To execute the code
1. git clone https://github.com/jesimone57/non-attacking-queens.git
2. gradle clean build test
<pre>
> Task :test

NonAttackingQueensTest > testIsNonAttackingOnDiagonalStandardBoard PASSED

NonAttackingQueensTest > testIsNonAttackingOnDiagonalOnly2Queens PASSED

NonAttackingQueensTest > testIsNonAttackingOnDiagonalOnly3Queens PASSED

PermutationTest > testPermutationTest1 PASSED

PermutationTest > testPermutationTest2 PASSED

PermutationTest > testPermutationTest3 PASSED

PermutationTest > testPermutationTest4 PASSED

PermutationTest > testPermutationTest5 PASSED

PermutationTest > testPermutationTest6 PASSED


BUILD SUCCESSFUL in 1s
5 actionable tasks: 5 executed
</pre>
3. gradle run
4. gradle -Pqueens=4 run
5. gradle -Pqueens=5 run
6. gradle -Pqueens=6 run
7. gradle -Pqueens=10 run


### Sample Output for a Standard 8 by 8 Chess Board (board size n defaults to 8)

java NonAttackingQueens
<pre>
For a 8 x 8 board ...
Ordinal Encoding of Queen Positions: 01234567
There are 92 solutions.
<br/>
NOTES:  Using an index origin of 0 labels the leftmost file/column of the chess board as 0.  
	Each solution has its board labled on the left with the ordinal encoding.
	Solutions encoded by the file/column ordinal of the Queen's position on the board:
[04752613, 05726314, 06357142, 06471352, 13572064, 14602753, 14630752, 15063724, 15720364, 16257403, 16470352, 17502463, 20647135, 24170635, 24175360, 24603175, 24730615, 25147063, 25160374, 25164073, 25307461, 25317460, 25703641, 25704613, 25713064, 26174035, 26175304, 27360514, 30471625, 30475261, 31475026, 31625704, 31625740, 31640752, 31746025, 31750246, 35041726, 35716024, 35720641, 36074152, 36271405, 36415027, 36420571, 37025164, 37046152, 37420615, 40357162, 40731625, 40752613, 41357206, 41362750, 41506372, 41703625, 42057136, 42061753, 42736051, 46027531, 46031752, 46137025, 46152037, 46152073, 46302751, 47302516, 47306152, 50417263, 51602473, 51603742, 52064713, 52073164, 52074136, 52460317, 52470316, 52613704, 52617403, 52630714, 53047162, 53174602, 53602417, 53607142, 57130642, 60275314, 61307425, 61520374, 62057413, 62714053, 63147025, 63175024, 64205713, 71306425, 71420635, 72051463, 73025164]
<br/>
There are 12 unique solutions by taking into account all possible rotations and reflections of the board.
<br/>
Unique Solution 1:  04752613  All possible rotations and refliections/mirrors give: [04752613, 06471352, 25317460, 31625740, 46152037, 52460317, 71306425, 73025164]
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
<br/>
Unique Solution 2:  25147063  All possible rotations and refliections/mirrors give: [25147063, 25704613, 31640752, 36074152, 41703625, 46137025, 52073164, 52630714]
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
<br/>
Unique Solution 3:  15720364  All possible rotations and refliections/mirrors give: [15720364, 26175304, 31475026, 37420615, 40357162, 46302751, 51602473, 62057413]
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
<br/>
Unique Solution 4:  13572064  All possible rotations and refliections/mirrors give: [13572064, 27360514, 31750246, 36271405, 41506372, 46027531, 50417263, 64205713]
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
<br/>
Unique Solution 5:  24730615  All possible rotations and refliections/mirrors give: [24730615, 25713064, 26174035, 31746025, 46031752, 51603742, 52064713, 53047162]
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
<br/>
Unique Solution 6:  05726314  All possible rotations and refliections/mirrors give: [05726314, 06357142, 24175360, 36415027, 41362750, 53602417, 71420635, 72051463]
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
<br/>
Unique Solution 7:  16257403  All possible rotations and refliections/mirrors give: [16257403, 17502463, 30475261, 36420571, 41357206, 47302516, 60275314, 61520374]
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
<br/>
Unique Solution 8:  24170635  All possible rotations and refliections/mirrors give: [24170635, 35716024, 42061753, 53607142]
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
<br/>
Unique Solution 9:  16470352  All possible rotations and refliections/mirrors give: [16470352, 25307461, 31625704, 37025164, 40752613, 46152073, 52470316, 61307425]
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
<br/>
Unique Solution 10:  14630752  All possible rotations and refliections/mirrors give: [14630752, 25164073, 25703641, 37046152, 40731625, 52074136, 52613704, 63147025]
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
<br/>
Unique Solution 11:  15063724  All possible rotations and refliections/mirrors give: [15063724, 20647135, 24603175, 35041726, 42736051, 53174602, 57130642, 62714053]
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
<br/>
Unique Solution 12:  14602753  All possible rotations and refliections/mirrors give: [14602753, 25160374, 30471625, 35720641, 42057136, 47306152, 52617403, 63175024]
   |---|---|---|---|---|---|---|---|
 1 |   | Q |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 4 |   |   |   |   | Q |   |   |   |
   |---|---|---|---|---|---|---|---|
 6 |   |   |   |   |   |   | Q |   |
   |---|---|---|---|---|---|---|---|
 0 | Q |   |   |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 2 |   |   | Q |   |   |   |   |   |
   |---|---|---|---|---|---|---|---|
 7 |   |   |   |   |   |   |   | Q |
   |---|---|---|---|---|---|---|---|
 5 |   |   |   |   |   | Q |   |   |
   |---|---|---|---|---|---|---|---|
 3 |   |   |   | Q |   |   |   |   |
   |---|---|---|---|---|---|---|---|
</pre>

### Sample Output for a 5 by 5 Chess Board

Other board sizes are possible by executing the program with the parameter 5.
Here is sample output for a board size of 5:

java NonAttackingQueens 5
<pre>
For a 5 x 5 board ...
Ordinal Encoding of Queen Positions: 01234
There are 10 solutions.
<br/>
NOTES:  Using an index origin of 0 labels the leftmost file/column of the chess board as 0.  
	Each solution has its board labled on the left with the ordinal encoding.
	Solutions encoded by the file/column ordinal of the Queen's position on the board:
[02413, 03142, 13024, 14203, 20314, 24130, 30241, 31420, 41302, 42031]
<br/>
There are 2 unique solutions by taking into account all possible rotations and reflections/mirrors of the board.
<br/>
Unique Solution 1:  14203  All possible rotations and refliections/mirrors give: [14203, 30241]
   |---|---|---|---|---|
 1 |   | Q |   |   |   |
   |---|---|---|---|---|
 4 |   |   |   |   | Q |
   |---|---|---|---|---|
 2 |   |   | Q |   |   |
   |---|---|---|---|---|
 0 | Q |   |   |   |   |
   |---|---|---|---|---|
 3 |   |   |   | Q |   |
   |---|---|---|---|---|
<br/>
Unique Solution 2:  02413  All possible rotations and refliections/mirrors give: [02413, 03142, 13024, 20314, 24130, 31420, 41302, 42031]
   |---|---|---|---|---|
 0 | Q |   |   |   |   |
   |---|---|---|---|---|
 2 |   |   | Q |   |   |
   |---|---|---|---|---|
 4 |   |   |   |   | Q |
   |---|---|---|---|---|
 1 |   | Q |   |   |   |
   |---|---|---|---|---|
 3 |   |   |   | Q |   |
   |---|---|---|---|---|
</pre>
