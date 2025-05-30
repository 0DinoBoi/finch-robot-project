package com.r6champs;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args) {
        Finch bird = new Finch();

        bird.setMove("F",100,100);
        bird.setTurn("R",30,200);
        bird.stop();
        bird.disconnect();
        bird.stop();

    }
}