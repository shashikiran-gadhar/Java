package com.example.java;

public class Main {

    public static void main(String[] args) {
        String[][] states = new String[3][2];
        states[0][0] = "Califonia";
        states[0][1] = "Sacremento";
        states[1][0] = "Massachusetts";
        states[1][1] = "Boston";
        states[2][0] = "Oregon";
        states[2][1] = "Salem";

        for (int i = 0; i < states.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The capitol of ")
                    .append(states[i][0])
                    .append(" is ")
                    .append(states[i][1]);
            System.out.println(sb);
        }


    }

}
