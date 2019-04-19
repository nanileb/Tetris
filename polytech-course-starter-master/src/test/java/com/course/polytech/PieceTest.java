package com.course.polytech;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PieceTest {

    @Test
    public void should_return_the_UP_orientation_of_T_piece(){
        Piece T = Piece.create_T(Orientation.UP);
        assertThat(T.getShape()).isEqualTo(new int[][]{{0,0,0},{1,1,1},{0,1,0}});
    }

    @Test
    public void should_return_the_LEFT_orientation_of_T_piece(){
        Piece T = Piece.create_T(Orientation.LEFT);
        assertThat(T.getShape()).isEqualTo(new int[][]{{0,1,0},{1,1,0}, {0,1,0}});
    }

    @Test
    public void should_return_the_DOWN_orientation_of_Z_piece(){
        Piece Z = Piece.create_Z(Orientation.DOWN);
        assertThat(Z.getShape()).isEqualTo(new int[][]{{0,0,0},{1,1,0},{0,1,1}});
    }

    @Test
    public void should_return_the_RIGHT_orientation_of_J_piece(){
        Piece J = Piece.create_J(Orientation.RIGHT);
        assertThat(J.getShape()).isEqualTo(new int[][]{{0,0,0},{1,1,1},{0,0,1}});
    }

    @Test
    public void should_return_the_DOWN_orientation_of_S_piece(){
        Piece S = Piece.create_S(Orientation.DOWN);
        assertThat(S.getShape()).isEqualTo(new int[][]{{1,0,0},{1,1,0},{0,1,0}});
    }


    @Test
    public void should_return_the_LEFT_orientation_of_L_piece(){
        Piece L = Piece.create_L(Orientation.LEFT);
        assertThat(L.getShape()).isEqualTo(new int[][]{{1,1,0},{0,1,0},{0,1,0}});
    }

    @Test
    public void should_return_the_UP_orientation_of_I_piece(){
        Piece I = Piece.create_I(Orientation.UP);
        assertThat(I.getShape()).isEqualTo(new int[][]{{0,1,0,0},{0,1,0,0},{0,1,0,0},{0,1,0,0}});
    }

    @Test
    public void should_return_the_RIGHT_orientation_of_O_piece(){
        Piece O = Piece.create_O(Orientation.RIGHT);
        assertThat(O.getShape()).isEqualTo(new int[][]{{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}});
    }

    //rotation test
    @Test
    public void should_return_the_RIGHT_orientation_of_T_piece_after_CLOCK_rotation_of_UP() throws Exception {
        Piece T = Piece.create_T(Orientation.UP);
        T.rotate(Rotation.CLOCK);
        assertThat(T.getShape()).isEqualTo(new int[][]{{0,1,0},{0,1,1},{0,1,0}});
    }
    @Test
    public void should_return_the_LEFT_orientation_of_T_piece_after_TRIGO_rotation_of_UP() throws Exception {
        Piece T = Piece.create_T(Orientation.UP);
        T.rotate(Rotation.TRIGO);
        assertThat(T.getShape()).isEqualTo(new int[][]{{0,1,0},{1,1,0},{0,1,0}});
    }

    @Test
    public void should_return_the_LEFT_orientation_of_L_piece_after_TRIGO_rotation_of_UP() throws Exception {
        Piece L = Piece.create_L(Orientation.UP);
        L.rotate(Rotation.TRIGO);
        assertThat(L.getShape()).isEqualTo(new int[][]{{1,1,0},{0,1,0},{0,1,0}});
    }
    @Test
    public void should_return_the_LEFT_orientation_of_J_piece_after_TRIGO_rotation_of_UP() throws Exception {
        Piece J = Piece.create_J(Orientation.UP);
        J.rotate(Rotation.TRIGO);
        assertThat(J.getShape()).isEqualTo(new int[][]{{0,1,1},{0,1,0},{0,1,0}});
    }
    @Test
    public void should_return_the_LEFT_orientation_of_S_piece_after_TRIGO_rotation_of_UP() throws Exception {
        Piece S = Piece.create_S(Orientation.UP);
        S.rotate(Rotation.TRIGO);
        assertThat(S.getShape()).isEqualTo(new int[][]{{0,0,0},{0,1,1},{1,1,0}});
    }
    @Test
    public void should_return_the_LEFT_orientation_of_Z_piece_after_TRIGO_rotation_of_UP() throws Exception {
        Piece Z = Piece.create_Z(Orientation.UP);
        Z.rotate(Rotation.TRIGO);
        assertThat(Z.getShape()).isEqualTo(new int[][]{{0,0,1},{0,1,1},{0,1,0}});
    }
    @Test
    public void should_return_the_LEFT_orientation_of_I_piece_after_TRIGO_rotation_of_UP() throws Exception {
        Piece I = Piece.create_I(Orientation.UP);
        I.rotate(Rotation.TRIGO);
        assertThat(I.getShape()).isEqualTo(new int[][]{{0,0,0,0},{1,1,1,1},{0,0,0,0},{0,0,0,0}});
    }
    @Test
    public void should_return_the_LEFT_orientation_of_O_piece_after_TRIGO_rotation_of_UP() throws Exception {
        Piece O = Piece.create_O(Orientation.UP);
        O.rotate(Rotation.TRIGO);
        assertThat(O.getShape()).isEqualTo(new int[][]{{0,0,0,0},{0,1,1,0},{0,1,1,0},{0,0,0,0}});
    }



}
