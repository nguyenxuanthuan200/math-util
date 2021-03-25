/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nxt.mathutil;

/**
 *
 * @author Win 10
 */
public class MathUtility {

    //đây là class mô phỏng lại class Math,chứa các hàm xài chung
    //hàm xài chung không lưu lại điều gì -> static
    public static final double Pi = 3.1415;

    //hàm tính n!
    //n! tăng rất nhanh về giá trị.
    //21! tràn kiểu long, hơn 18 số 0
    //bài này ta tính từ 0->20! .Âm ko tính được,0! =1! =1
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be between 0..20");
        }
        //
        // sống sót đến đây thì n=0,1,...20
        //--------sửa code , sửa hàm giai thừa cho gọn, dùng đệ quy
        if (n == 0 || n == 1) {
            return 1;
        }
        return n*getFactorial(n-1);
        //n!= n*(n-1)!
        //Đệ quy, vòng lại chính mình với quy mô khác
        //recursion, Làm khéo nếu ko nó đi mãi mãi
        //SRACKOVERFLOW.COM
        
        
                
//        long result = 1; // giả bộ =0
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//
//        return result;
    }
}
