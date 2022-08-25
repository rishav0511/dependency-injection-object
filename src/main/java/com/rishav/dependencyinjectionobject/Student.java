package com.rishav.dependencyinjectionobject;

public class Student {
    private int roll;
    private MathCheat mathCheat;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void cheating() {
        mathCheat.cheat();
        System.out.println("ID: "+roll);
    }
}
