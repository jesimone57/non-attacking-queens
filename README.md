# Solution to the Eight Queen Problem/Puzzle

### Description
>Is it possible to place 8 queens on a standard chess board without any queen being able to 
attack any other queen?  If so, how many solutions are possible?

>See [Wikipedia description of the problem](https://en.wikipedia.org/wiki/Eight_queens_puzzle)

### To execute the code
1. git clone the repo to your local machine
2. mvn clean compile test
3. cd target/classes
3. java NonAttackingQueens

### Sample Output

<pre>
java NonAttackingQueens
There are 92 solutions.
[04752613, 05726314, 06357142, 06471352, 13572064, 14602753, 14630752, 15063724, 15720364, 16257403, 16470352, 17502463, 20647135, 24170635, 24175360, 24603175, 24730615, 25147063, 25160374, 25164073, 25307461, 25317460, 25703641, 25704613, 25713064, 26174035, 26175304, 27360514, 30471625, 30475261, 31475026, 31625704, 31625740, 31640752, 31746025, 31750246, 35041726, 35716024, 35720641, 36074152, 36271405, 36415027, 36420571, 37025164, 37046152, 37420615, 40357162, 40731625, 40752613, 41357206, 41362750, 41506372, 41703625, 42057136, 42061753, 42736051, 46027531, 46031752, 46137025, 46152037, 46152073, 46302751, 47302516, 47306152, 50417263, 51602473, 51603742, 52064713, 52073164, 52074136, 52460317, 52470316, 52613704, 52617403, 52630714, 53047162, 53174602, 53602417, 53607142, 57130642, 60275314, 61307425, 61520374, 62057413, 62714053, 63147025, 63175024, 64205713, 71306425, 71420635, 72051463, 73025164]
<br/>
There are 12 unique solutions by taking into account all possible rotations and reflections of the board.
<br/>
Unique Solution 1:  04752613  other rotations and refliections: [06471352, 25317460, 31625740, 46152037, 52460317, 71306425, 73025164]
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|

<br/>
Unique Solution 2:  25147063  other rotations and refliections: [25704613, 31640752, 36074152, 41703625, 46137025, 52073164, 52630714]
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|

<br/>
Unique Solution 3:  15720364  other rotations and refliections: [26175304, 31475026, 37420615, 40357162, 46302751, 51602473, 62057413]
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|

<br/>
Unique Solution 4:  13572064  other rotations and refliections: [27360514, 31750246, 36271405, 41506372, 46027531, 50417263, 64205713]
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|

<br/>
Unique Solution 5:  24730615  other rotations and refliections: [25713064, 26174035, 31746025, 46031752, 51603742, 52064713, 53047162]
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|

<br/>
Unique Solution 6:  05726314  other rotations and refliections: [06357142, 24175360, 36415027, 41362750, 53602417, 71420635, 72051463]
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|

<br/>
Unique Solution 7:  16257403  other rotations and refliections: [17502463, 30475261, 36420571, 41357206, 47302516, 60275314, 61520374]
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|

<br/>
Unique Solution 8:  24170635  other rotations and refliections: [24170635, 35716024, 42061753, 53607142]
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|

<br/>
Unique Solution 9:  16470352  other rotations and refliections: [25307461, 31625704, 37025164, 40752613, 46152073, 52470316, 61307425]
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|

<br/>
Unique Solution 10:  14630752  other rotations and refliections: [25164073, 25703641, 37046152, 40731625, 52074136, 52613704, 63147025]
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|

<br/>
Unique Solution 11:  15063724  other rotations and refliections: [20647135, 24603175, 35041726, 42736051, 53174602, 57130642, 62714053]
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|

<br/>
Unique Solution 12:  14602753  other rotations and refliections: [25160374, 30471625, 35720641, 42057136, 47306152, 52617403, 63175024]
|---|---|---|---|---|---|---|---|
|   | Q |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   | Q |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   | Q |   |
|---|---|---|---|---|---|---|---|
| Q |   |   |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   | Q |   |   |   |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   |   |   | Q |
|---|---|---|---|---|---|---|---|
|   |   |   |   |   | Q |   |   |
|---|---|---|---|---|---|---|---|
|   |   |   | Q |   |   |   |   |
|---|---|---|---|---|---|---|---|
</pre>