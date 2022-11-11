package Sprint3.InlämningsUppgift1;

import java.util.Random;

public class RandomNumber extends Main{

    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private int n6;
    private int n7;
    private int n8;
    private int n9;
    private int n10;
    private int n11;
    private int n12;
    private int n13;
    private int n14;
    private int n15;


    public RandomNumber() {

        Random random = new Random();

        this.n1 = random.nextInt(15) + 1;

        while(n1 == n2 || n2 == 0) {
            this.n2 = random.nextInt(15) + 1;
        }
        while(n1 == n3 || n2 == n3 || n3 == 0){
            this.n3 = random.nextInt(15) + 1;
        }
        while(n1 == n4 || n2 == n4 || n3 == n4 || n4 == 0){
            this.n4 = random.nextInt(15) + 1;
        }
        while(n1 == n5 || n2 == n5 || n3 == n5 || n4 == n5 || n5 == 0){
            this.n5 = random.nextInt(15) + 1;
        }
        while(n1 == n6 || n2 == n6 || n3 == n6 || n4 == n6 || n5 == n6 || n6 == 0){
            this.n6 = random.nextInt(15) + 1;
        }
        while(n1 == n7 || n2 == n7 || n3 == n7 || n4 == n7 || n5 == n7 || n6 == n7 || n7 == 0){
            this.n7 = random.nextInt(15) + 1;
        }
        while(n1 == n8 || n2 == n8 || n3 == n8 || n4 == n8 || n5 == n8 || n6 == n8 || n7 == n8 || n8 == 0){
            this.n8 = random.nextInt(15) + 1;
        }
        while(n1 == n9 || n2 == n9 || n3 == n9 || n4 == n9 || n5 == n9 || n6 == n9 || n7 == n9 || n8 == n9 || n9 == 0){
            this.n9 = random.nextInt(15) + 1;
        }
        while(n1 == n10 || n2 == n10 || n3 == n10 || n4 == n10 || n5 == n10 || n6 == n10 || n7 == n10 || n8 == n10 || n9 == n10 || n10 == 0){
            this.n10 = random.nextInt(15) + 1;
        }
        while(n1 == n11 || n2 == n11 || n3 == n11 || n4 == n11 || n5 == n11 || n6 == n11 || n7 == n11 || n8 == n11 || n9 == n11 || n10 == n11 || n11 == 0){
            this.n11 = random.nextInt(15) + 1;
        }
        while(n1 == n12 || n2 == n12 || n3 == n12 || n4 == n12 || n5 == n12 || n6 == n12 || n7 == n12 || n8 == n12 || n9 == n12 || n10 == n12 || n11 == n12 || n12 == 0){
            this.n12 = random.nextInt(15) + 1;
        }
        while(n1 == n13 || n2 == n13 || n3 == n13 || n4 == n13 || n5 == n13 || n6 == n13 || n7 == n13 || n8 == n13 || n9 == n13 || n10 == n13 || n11 == n13 || n12 == n13 || n13 == 0){
            this.n13 = random.nextInt(15) + 1;
        }
        while(n1 == n14 || n2 == n14 || n3 == n14 || n4 == n14 || n5 == n14 || n6 == n14 || n7 == n14 || n8 == n14 || n9 == n14 || n10 == n14 || n11 == n14 || n12 == n14 || n13 == n14 || n14 == 0){
            this.n14 = random.nextInt(15) + 1;
        }
        while(n1 == n15 || n2 == n15 || n3 == n15 || n4 == n15 || n5 == n15 || n6 == n15 || n7 == n15 || n8 == n15 || n9 == n15 || n10 == n15 || n11 == n15 || n12 == n15 || n13 == n15 || n14 == n15 || n15 == 0){
            this.n15 = random.nextInt(15) + 1;
        }


    }

    public void setN1 (int newN1) {
            this.n1 = newN1;
    }

    public int getN1(){
        return n1;
    }

    public void setN2 (int newN2) {
        this.n2 = newN2;
    }

    public int getN2(){
        return n2;
    }

    public void setN3 (int newN3) {
        this.n3 = newN3;
    }

    public int getN3(){
        return n3;
    }

    public void setN4 (int newN4) {
        this.n4 = newN4;
    }

    public int getN4(){
        return n4;
    }

    public void setN5 (int newN5) {
        this.n5 = newN5;
    }

    public int getN5(){
        return n5;
    }

    public void setN6 (int newN6) {
        this.n6 = newN6;
    }

    public int getN6(){
        return n6;
    }

    public void setN7 (int newN7) {
        this.n7 = newN7;
    }

    public int getN7(){
        return n7;
    }

    public void setN8 (int newN8) {
        this.n8 = newN8;
    }

    public int getN8(){
        return n8;
    }

    public void setN9 (int newN9) {
        this.n9 = newN9;
    }

    public int getN9(){
        return n9;
    }

    public void setN10 (int newN10) {
        this.n10 = newN10;
    }

    public int getN10(){
        return n10;
    }

    public void setN11 (int newN11) {
        this.n11 = newN11;
    }

    public int getN11(){
        return n11;
    }

    public void setN12 (int newN12) {
        this.n12 = newN12;
    }

    public int getN12(){
        return n12;
    }

    public void setN13 (int newN13) {
        this.n13 = newN13;
    }

    public int getN13(){
        return n13;
    }

    public void setN14 (int newN14) {
        this.n14 = newN14;
    }

    public int getN14(){
        return n14;
    }

    public void setN15 (int newN15) {
        this.n15 = newN15;
    }

    public int getN15(){
        return n15;
    }


}

