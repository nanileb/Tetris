package com.course.polytech;

import java.util.ArrayList;
import java.util.HashMap;

public class Piece {




    final  HashMap<Orientation , Integer [][]> formepiece = new HashMap<>();


    public Piece(Orientation orientation,Integer[][] forme_UP,Integer[][] forme_DOWN,Integer[][] forme_LEFT,Integer[][] forme_RIGHT){
        this.orientation = orientation;
        formepiece.put(Orientation.UP,forme_UP);
        formepiece.put(Orientation.DOWN,forme_DOWN);
        formepiece.put(Orientation.LEFT,forme_LEFT);
        formepiece.put(Orientation.RIGHT,forme_RIGHT);
    }

    Orientation orientation;


    public void rotate(Rotation rotation) throws Exception{

        ArrayList<Orientation> sequence_orientation = new ArrayList<>();

        sequence_orientation.add(Orientation.UP);
        sequence_orientation.add(Orientation.LEFT);
        sequence_orientation.add(Orientation.DOWN);
        sequence_orientation.add(Orientation.RIGHT);

        int orientation_idx = sequence_orientation.indexOf(orientation);

        if(orientation_idx == -1){
            throw new Exception("Cannot found the Orientation" + orientation);
        }

        if(rotation == Rotation.TRIGO){
            if(orientation_idx == sequence_orientation.size()-1){
                orientation = sequence_orientation.get(0);
            }else {
                orientation = sequence_orientation.get(1+orientation_idx);
            }
        }else if(rotation == Rotation.CLOCK){
            if(orientation_idx == 0){
                orientation = sequence_orientation.get(sequence_orientation.size()-1);
            }else {
                orientation = sequence_orientation.get(orientation_idx-1);
            }
        }
    }

    //fonction qui permet de créer une pièce random
    public static Piece random_piece(){
        int random= (int) (1+(Math.random()*(6)));
        if(random==1){
            return create_T(Orientation.UP);
        }
        else if(random==2){
            return create_O(Orientation.UP);
        }else if(random==3){
            return create_I(Orientation.UP);
        }else if(random==4){
            return create_J(Orientation.UP);
        }else if(random==5){
            return create_Z(Orientation.UP);
        }else if(random==6){
            return create_L(Orientation.UP);
        }else if(random==7){
            return create_S(Orientation.UP);
        }
        return null;
    }

    public static Piece create_T (Orientation orientation){
        final Integer[][] T_UP = {
                {0,0,0},
                {1,1,1},
                {0,1,0}
        };

        final Integer[][] T_DOWN= {
                {0,0,0},
                {0,1,1},
                {1,1,1}

        };

        final Integer[][] T_LEFT = {
                {0,1,0},
                {1,1,0},
                {0,1,0}
        };

        final Integer[][] T_RIGHT = {
                {0,1,0},
                {0,1,1},
                {0,1,0}
        };
        return new Piece(orientation,T_UP,T_DOWN,T_LEFT,T_RIGHT);
    }

    public static Piece create_Z (Orientation orientation){

        final  Integer[][] Z_UP = {
                {0,0,0},
                {1,1,0},
                {0,1,1}
        };

        final  Integer[][] Z_DOWN= {
                {0,0,0},
                {1,1,0},
                {0,1,1}

        };

        final  Integer[][] Z_LEFT = {
                {0,0,1},
                {0,1,1},
                {0,1,0}
        };

        final  Integer[][] Z_RIGHT = {
                {0,0,1},
                {0,1,1},
                {0,1,0}
        };
        return new Piece(orientation,Z_UP,Z_DOWN,Z_LEFT,Z_RIGHT);
    }

    public static Piece create_J (Orientation orientation){
        final  Integer[][] J_UP = {
                {0,0,1},
                {0,0,1},
                {0,1,1}
        };

        final  Integer[][] J_DOWN= {
                {0,0,0},
                {1,0,0},
                {1,1,1}

        };

        final  Integer[][] J_LEFT = {
                {0,1,1},
                {0,1,0},
                {0,1,0}
        };

        final  Integer[][] J_RIGHT = {
                {1,1,1},
                {0,0,1},
                {0,0,0}
        };
        return new Piece(orientation,J_UP,J_DOWN,J_LEFT,J_RIGHT);
    }
    public static Piece create_S (Orientation orientation){
        final Integer[][] S_UP = {
                {0,0,0},
                {0,1,1},
                {1,1,0}
        };

        final Integer[][] S_DOWN= {
                {1,0,0},
                {1,1,0},
                {0,1,0}

        };

        final Integer[][] S_LEFT = {
                {0,0,0},
                {0,1,1},
                {1,1,0}
        };

        final Integer[][] S_RIGHT = {
                {0,1,0},
                {0,1,1},
                {0,0,1}
        };
        return new Piece(orientation,S_UP,S_DOWN,S_LEFT,S_RIGHT);
    }

    public static Piece create_L (Orientation orientation){
        final Integer[][] L_UP = {
                {0,1,0},
                {0,1,0},
                {0,1,1}
        };

        final Integer[][] L_DOWN= {
                {1,1,0},
                {0,1,0},
                {0,1,0}
        };

        final Integer[][] L_LEFT = {
                {0,0,0},
                {0,0,1},
                {1,1,1}
        };

        final Integer[][] L_RIGHT = {
                {0,0,0},
                {1,1,1},
                {1,0,0}
        };
        return new Piece(orientation,L_UP,L_DOWN,L_LEFT,L_RIGHT);
    }
    public static Piece create_I (Orientation orientation){
        final Integer[][] I_UP = {
                {1,0,0,0},
                {1,0,0,0},
                {1,0,0,0},
                {1,0,0,0}
        };

        final Integer[][] I_DOWN= {
                {0,0,0,1},
                {0,0,0,1},
                {0,0,0,1},
                {0,0,0,1}
        };

        final Integer[][] I_LEFT = {
                {0,0,0,0},
                {1,1,1,1},
                {0,0,0,0},
                {0,0,0,0}
        };

        final Integer[][] I_RIGHT = {
                {0,0,0,0},
                {1,1,1,1},
                {0,0,0,0},
                {0,0,0,0}
        };
        return new Piece(orientation,I_UP,I_DOWN,I_LEFT,I_RIGHT);
    }

    public static Piece create_O (Orientation orientation){
        final Integer[][] O_UP = {
                {1,1},
                {1,1}
        };

        final Integer[][] O_DOWN= {
                {1,1},
                {1,1}
        };

        final Integer[][] O_LEFT = {
                {1,1},
                {1,1}
        };

        final Integer[][] O_RIGHT = {
                {1,1},
                {1,1}
        };
        return new Piece(orientation,O_UP,O_DOWN,O_LEFT,O_RIGHT);
    }


    public Integer[][] getShape() {
        return formepiece.get(orientation);
    }

    public static void main() throws Exception {
        Piece T = Piece.create_T(Orientation.UP);
        T.rotate(Rotation.CLOCK);
        T.getShape();
    }
}
