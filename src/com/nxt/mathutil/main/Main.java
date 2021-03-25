/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nxt.mathutil.main;

import com.nxt.mathutil.MathUtility;

/**
 *
 * @author Win 10
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("1st upload from Local to GitHub");
//        System.out.println("Welcome to GitHub");
// Test trâu bò, tức là dùng mắt để nhìn đúng sai

        long expected = 120;//tui kì vòng hàm tính giai thừa trả về 120
        long actual; // nếu tui đưa vào 5
        int input = 5; // đầu vào 5
        actual=MathUtility.getFactorial(input); // xem ra bao nhieu
        System.out.println("5!:Expected :"+ expected+";Actual:"+actual);
        //một test case, 1 tình huống xài hàm, test hàm, dùng hàm
        //case 2: 0! thì sao???
        expected=1;
        input=0;
        actual=MathUtility.getFactorial(input);
        System.out.println("5!:Expected :"+ expected+";Actual:"+actual);
        //case 3 : 2! thi sao
        expected=2;
        input=2;
        actual=MathUtility.getFactorial(input);
        System.out.println("5!:Expected :"+ expected+";Actual:"+actual);
        //case 4 : -1! thi sao
        //expected=???; ngoai le
        input=-1;
        actual=MathUtility.getFactorial(input);
        //ko in duoc ngoai le,chi coi no xh hay ko
        // chúng ta phải nhìn để kết luận, nhìn nhiều cases
        //chơi trò thông minh hơn - TEST AUTOMATION DÙNG THƯ VIỆN
    }

}
