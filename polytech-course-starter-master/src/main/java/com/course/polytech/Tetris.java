package com.course.polytech;

public class Tetris {


    public static int COLUMN_SIZE = 10;
    public static int LINE_SIZE = 24;
    public static int FULL = 1;
    public static int EMPTY = 0;
    public static int CURRENTPIECE = 2;
    public int[][] tetrisGrid = new int[LINE_SIZE][COLUMN_SIZE];
    int pieceColumn , pieceLine;
    Piece piece;

    public Tetris() {
        initGrid();
    }

    //Initialisation de la grille
    public void initGrid() {
        for (int line = 0; line < LINE_SIZE; line++) {
            for (int column = 0; column < COLUMN_SIZE; column++) {
                this.tetrisGrid[line][column] = EMPTY;
            }
        }
    }

    //Fonction qui nous permet de visualiser notre Tetris. (Print)
    public void printGrid() {
        for (int line = 0; line < LINE_SIZE; line++) {
            for (int column = 0; column < COLUMN_SIZE; column++) {
                if(tetrisGrid[line][column] == EMPTY) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    //Fonction qui permet de créer une pièce et donc de la positionner au centre sur la grille.
    public void addpiece(Piece piece){
        this.pieceColumn= COLUMN_SIZE/2 - ((piece.getShape().length + 1) / 2);
        this.pieceLine=0;
        this.piece = piece;
    }

    //Fonction qui permet de rendre la grille vide
    public void clearBoard() {
        for (int line = 0; line < LINE_SIZE; line++) {
            for (int column = 0; column < COLUMN_SIZE; column++) {
                if(tetrisGrid[line][column] == CURRENTPIECE) {
                    tetrisGrid[line][column] = EMPTY;
                }
            }
        }
    }

    //Fonction qui permet de dessiner une piece sur la grille
    public void drawPieceOnBoard() {
        for (int line = 0; line < piece.getShape().length; line++) {
            for (int column = 0; column < piece.getShape()[0].length; column++) {
                if(piece.getShape()[line][column] == 1) {
                    tetrisGrid[this.pieceLine + line][this.pieceColumn + column] = CURRENTPIECE;
                }
            }
        }
    }
    //Fonction qui permet d'effectuer une translation de notre pièce
    public void translation(Direction direction){
        int newY = pieceColumn,newX = pieceLine;


        if(direction == Direction.SOUTH) {
            newX++;

        }else if(direction == Direction.EST){
            newY++;

        }
        else if(direction == Direction.WEST){
            newY--;
        }

        if(isinside(piece,newY,newX)){
            pieceLine=newX;
            //System.out.println(pieceLine);

            pieceColumn=newY;
            //System.out.println(pieceColumn);
        }

    }

    //Fonction qui permet de savoir si la pièce est bien dans la grille.
    public boolean isinside(Piece piece, int PosX, int PosY){

        for (int i = 0; i < piece.getShape().length; i++) {
            for (int y = 0; y < piece.getShape().length; y++) {
                if (piece.getShape()[i][y] == 1) {
                    if ((PosX + i) >= 10 || (PosX + i) < 0 || (PosY + y) >= 24 || (PosY + y) < 0) {
                        //System.out.println(PosX+i);
                        //System.out.println(PosY+y);
                        return false;
                    }
                }
            }
        }
        return true;
    }


    //Fonction qui permet d'ajouter une pièce sur la grille (lorsque la pièce ne peux plus descendre, pour l'encrer sur la grille)
    public boolean addpieceongrid(Piece piece, int PosX, int PosY){
        for (int i = 0; i < piece.getShape().length; i++) {
            for (int y = 0; y < piece.getShape().length; y++) {

                if (piece.getShape()[i][y] == 1) {

                  int posxs = (PosX+i), posys = (PosY+y);
                    //System.out.println(y);
                    //System.out.println(PosX);
                  tetrisGrid[posxs][posys] = 1;
                }
            }
        }
        return true;
    }



    //Fonction qui permet de fixer une pièce sur la grille.
    public void fixpiece(){


        if (isinside(piece, pieceLine+1,pieceColumn+1)){
            addpieceongrid(piece,pieceLine,pieceColumn);
        }
    }


    public static void main(String[] args) throws Exception {
        Tetris Game = new Tetris();
        Game.printGrid();
        Piece pieceTest = Piece.create_J(Orientation.UP);
        Game.addpiece(pieceTest);


        Game.clearBoard();
        Game.translation(Direction.EST);
        Game.translation(Direction.EST);
        //System.out.println(Game.pieceColumn);
        Game.translation(Direction.EST);
        //System.out.println(Game.pieceColumn);
        Game.translation(Direction.WEST);
        //System.out.println(Game.pieceColumn);
        for( int i = 0;i<25;i++) {
            Game.translation(Direction.SOUTH);
            //System.out.println(Game.pieceLine);
            Game.translation(Direction.EST);
        }

        //pieceTest.rotate(Rotation.CLOCK);
        //pieceTest.rotate(Rotation.CLOCK);
        //pieceTest.rotate(Rotation.CLOCK);
        //pieceTest.rotate(Rotation.CLOCK);
        //System.out.println(Game.pieceLine);
        Game.fixpiece();


        Game.drawPieceOnBoard();

        Game.printGrid();
    }

}

   /*public Tetris(int NumberOfline, int NumberOfColon ){
        Nb_line=NumberOfline;
        Nb_colon=NumberOfColon;
    }
    */

   /*

    private Tetris(Tetris[][] grid) {this.grid = grid;}






    public boolean[] isLineComplete(){
        boolean checkLine[] = new boolean[24] ;
        for (int line = 0; line<24; line++){
            boolean filled = true;
           for(int column=0; column<10; column++){
               if(tetrisGrid[line][column] == BLACK){
                  filled=false;
               }
           }
            checkLine[line]=filled;
        }
        return checkLine;
    }

    public static int pos(int posX, int posY){
        if (posX>=0 && posY<=12) return 1;
        else return 0;
    }

*/

