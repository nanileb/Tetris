package com.course.polytech;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TetrisTest {

    @Test
    public void should_the_grid_be_full_BLACK_when_empty(){
        Tetris tetris = new Tetris();
        assertThat(tetris.tetrisGrid[3][5]).isEqualTo(tetris.EMPTY);

    }


    @Test
    public void should_the_grid_be_full_BLACK_when_empty_2(){
        Tetris tetris = new Tetris();
        assertThat(tetris.tetrisGrid[20][4]).isEqualTo(tetris.EMPTY);

    }

    @Test
    public void should_the_grid_be_full_BLACK_when_empty_3(){
        Tetris tetris = new Tetris();
        assertThat(tetris.tetrisGrid[7][9]).isEqualTo(tetris.EMPTY);
    }

    @Test
    public void should_the_grid_be_full_BLACK_when_empty_4(){
        Tetris tetris = new Tetris();
        assertThat(tetris.tetrisGrid[16][5]).isEqualTo(tetris.EMPTY);
    }
    @Test
    public void should_the_piece_go_to_the_left_when_it_is_WEST(){
        Tetris tetris = new Tetris();
        assertThat(tetris.tetrisGrid[16][5]).isEqualTo(tetris.EMPTY);
    }


    /*@Test
    public void should_be_false_if_its_black(){
        Tetris tetris = emptyGrid();
        boolean testtab [] = tetris.isLineComplete();
        assertThat(;
    }*/






    /*
    @Test
    public void should_be_true_if_line_egal_10() {
        Tetris tetris = new Tetris();
        assertThat(tetris.isLinecomplete(10)).isTrue();


    }
    @Test
    public void should_be_false_if_line_egal_8() {
        Tetris tetris = new Tetris();
        assertThat(tetris.isLinecomplete(8)).isFalse();
    }

    @Test
    public void should_be_false_if_line_egal_12() {
        Tetris tetris = new Tetris();
        assertThat(tetris.isLinecomplete(12)).isTrue();
    }
    */
/*

    @Test
    public void should_be_0_if_line_less_than_12() {
        assertThat(Tetris.line(7)).isEqualTo(0);
    }

    @Test
    public void should_be_0_if_line_more_than_12() {
        assertThat(Tetris.line(13)).isEqualTo(-1);
    }

    @Test
    public void should_be_1_if_in_of_pos() {
        assertThat(Tetris.pos(1,5)).isEqualTo(1);
    }

    @Test
    public void should_be_0_if_out_of_pos() {
        assertThat(Tetris.pos(-1,5)).isEqualTo(0);
    }

    @Test
    public void should_be_0_if_out_of_pos_2() {
        assertThat(Tetris.pos(1,13)).isEqualTo(0);
    }

*/


}




