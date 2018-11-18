package com.company.java;



public class Programmer extends Writer {
    public void write() {
        System.out.println("Writing code");
    }
    public static void main(String[] args) {
        // write your code here
        Writer w = new Programmer();
        w.write();
    }
}
