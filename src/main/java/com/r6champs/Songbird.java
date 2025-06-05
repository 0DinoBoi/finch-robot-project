package com.r6champs;

import com.birdbrain.Finch;

public class Songbird extends Finch {

    public Songbird(String device) {
        super(device);
    }
    
    public void playNoteAndPause(int note, double beats) {
        playNote(note, beats);
        pause(beats + 0.1);
    }

    public void dance() {
        setMove("F",10,100);
        setTurn("R",90,70);
        setMove("F",10,100);
        setMove("B",10,100);
        setTurn("L",90,70);
        setTurn("L",90,70);
        setMove("F",10,100);
        setMove("B",10,70);
        setTurn("R",90,70);
       setMotors(360,0);
       pause(1);
       setTurn("R",150,70);
       setMotors(0,90);
       pause(1);
       setMotors(90,0);
       pause(1);
       setTurn("R",18,100);
       setMove("F",40,70);
       setTurn("R",360,100);
       setTurn("L",360,100);
       setMove("B",40,70);
       setMove("F",40,70);
       setTurn("R",90,100);
       setMove("F",5,70);
       setTurn("L",90,100);
      stop();
    }

    public void playSong() {
        playNoteAndPause(78, 0.6); //F#
        playNoteAndPause(76, 0.6); //E
        playNoteAndPause(81, 1.1); //A
        pause(0.1);
        playNoteAndPause(78, 0.2); //F#
        playNoteAndPause(76, 0.5); //E
        playNoteAndPause(69, 0.5); //A
        playNoteAndPause(76, 0.6); //E
        playNoteAndPause(74, 0.2); //D 
        playNoteAndPause(73, 0.5); //C#
        playNoteAndPause(74, 0.2); //D
        playNoteAndPause(78, 0.55); //F#
        playNoteAndPause(74, 0.2); //D
        playNoteAndPause(73, 0.5); //C#
        playNoteAndPause(71, 0.5); //B
        pause(0.7);
        //2nd line
        
        playNoteAndPause(71, 0.2); //B
        playNoteAndPause(79, 0.2); //G
        playNoteAndPause(78, 0.2); //F#
        playNoteAndPause(76, 0.2); //E
        playNoteAndPause(73, 0.4); //C#
        playNoteAndPause(69, 0.5); //A
        playNoteAndPause(73, 0.5); //C#
        playNoteAndPause(76, 0.5); //E
        playNoteAndPause(78, 0.6);//F#
        pause(0.5); // eighth rest
        playNoteAndPause(69, 0.2); //A
        playNoteAndPause(78, 0.2); //F#
        playNoteAndPause(76, 0.2); //E
        playNoteAndPause(74, 0.2); //D
        playNoteAndPause(73, 0.4); //C#
        playNoteAndPause(69, 0.5); //A
        playNoteAndPause(71, 0.5); //B
        playNoteAndPause(69, 0.4); //A
        playNoteAndPause(67, 0.4); //G
        //3rd line
        pause(0.7);
        playNoteAndPause(67, 0.2); //G
        playNoteAndPause(79, 0.2); //G
        playNoteAndPause(78, 0.2); //F#
        playNoteAndPause(76, 0.2); //E
        playNoteAndPause(73, 0.4); //C#
        playNoteAndPause(69, 0.4); //A
        playNoteAndPause(73, 0.5); //C#
        playNoteAndPause(81, 0.5); //A
        playNoteAndPause(78, 2.0); //F#
       
        pause(0.8);
        playNoteAndPause(78, 0.22); //F#
        playNoteAndPause(78, 0.22); //F#
        playNoteAndPause(79, 0.22); //G
        //4th line
        playNoteAndPause(81, 0.5); //A
        playNoteAndPause(78, 0.4); //F#
        pause(0.3);
        playNoteAndPause(78, 0.2); //F#
        playNoteAndPause(79, 0.2); //G
        playNoteAndPause(81, 0.2); //A
        playNoteAndPause(81, 0.2); //A
        playNoteAndPause(79, 0.2); //G
        playNoteAndPause(79, 0.2); //G
        playNoteAndPause(78, 0.2); //F#
        playNoteAndPause(78, 0.2); //F#
        playNoteAndPause(78, 0.2); //F#
        playNoteAndPause(83, 0.2); //B
        playNoteAndPause(81, 0.5); //A
        playNoteAndPause(78, 0.5); //F# 
      pause(0.5);
        playNoteAndPause(78, 0.2);//F#
        playNoteAndPause(79, 0.2);//G
        playNoteAndPause(81, 0.2);//A
        playNoteAndPause(81, 0.2);//A
        playNoteAndPause(78, 0.2);//F#
        playNoteAndPause(78, 0.2);//F#
        playNoteAndPause(76, 0.6);//E
    
  
        //5th line
        playNoteAndPause(78, 0.2);//F#
        playNoteAndPause(76, 0.3);//E
        playNoteAndPause(81, 0.2);//A
        playNoteAndPause(78, 0.5);//F#
        playNoteAndPause(76, 0.5);//E
        pause(0.6);
        playNoteAndPause(69, 0.2);//A
        playNoteAndPause(69, 0.2);//A
        playNoteAndPause(71, 0.2);//B
        playNoteAndPause(74, 0.2);//D
        playNoteAndPause(76, 0.2);//E
        playNoteAndPause(78, 0.6);//F#
        playNoteAndPause(76, 0.6);//E
        playNoteAndPause(78, 0.5);//F#
    }
}
