package com.nav.dp;

public class NumbersToStrings {

    static char letter= 'A';
    public static void main(String[] args)
    {
        new NumbersToStrings().getWords(new int[]{1,1,2,3},0,new StringBuilder());


    }

    private void getWords(int []a,int index,StringBuilder sb) {
//        StringBuilder sb = new StringBuilder();

        if(index>=a.length) {
            System.out.println(sb);
        }
        if(index+1<=a.length) {
            sb = sb.append((char) (letter+(a[index]-1)));
            getWords(a, ++index,sb);
          // System.out.println(sb.toString());
        }

        if(index+2<=a.length) {
            int firChar = a[index];
            int secchar = a[index+1];
            int no = firChar+secchar-1;
            sb = sb.append((char) (letter+no));
            index = index+2;
            getWords(a,index,sb);
            // System.out.println(sb.toString());
        }

/*
        if(index<a.length) {
            int firstChar =;
            int seconChar=
            sb = sb.append((char) (letter+(a[index]+a[index+1]-1))).append(getWords(a, index));
            System.out.println(sb.toString());
        }
*/

    }
}
