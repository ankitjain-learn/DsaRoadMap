# Design Tic Tac Toe

1. class diagram to code is the objective to this interview round
2. classes/objects are
    2.1 Board [getPlayer,makeMove,initialize,getWinner]
    2.2 Game [ players 1 , players 2 , Board]
    2.3 User [ getProfile]
    2.4 Stats linked to User

3. Game states can be 0=draw , 1= player win , 2 = players 2 win
4. Move states can be 1 for player one and -1 for player 2
5. to get winner you have to check diagonal , row, column, reverse diagonal
6. store the column count , row count , diagonal count and rev diagonal count for every moves ,
    this way if row[count]==3 then player one won in 0(1) time its calculated