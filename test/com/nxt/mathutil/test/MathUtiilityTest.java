/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nxt.mathutil.test;

import com.nxt.mathutil.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Win 10
 */
public class MathUtiilityTest {

    @Test // bien ham nay thanh main(), shift-f6 de chay
    //goi ham factorial nhu thuong le, hay hơn là tự động so sánh giùm
    //expected và actual coi có khớp nhau k??? có thảy màu xanh
    //k kớp nhau thảy màu đỏ. Tả chỉ nhìn màu mà ko cần mất công
    //so sánh nữa !!!
    public void testFactorialRighArgumentRunsWell() {
        long expected = 120; // em muốn biết 5! đúng là 120 k
        int n = 5; // em đưa 5 vào
        long actual = MathUtility.getFactorial(n);// tính thiệt coi
        // và so sánh dùm 
        assertEquals(expected, actual);// tớ chỉ thích đèn báo giao thông thôi
        //tui sẽ test các tình huống còn lại
        assertEquals(720, MathUtility.getFactorial(6)); // 6! có phải 720?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        //0! là 1 tính huống cần test
        //1! là 1 tính huống cần test
        //TÌNH HUỐNG : TEST CASE, NGHỀ TESTER/QC LÀ NGHỀ NGHĨ RA CÁC TEST
        //CASE, SAU ĐÓ THỬ NGHIỆM

        //assertEquals(0, MathUtility.getFactorial(0));
        // kì vọng sai, tính đúng--> 1 màu đỏ, không khớp nhau
        //kì vọng đúng,tính sai-->1 màu đỏ
        //kì vọng 5!=120, hàm tính ra mấy??
    }

    // ta test phần ngoại lệ -Exception    
    //Exception là tình huống bất thường xảy ra trong app, trong code, khi
    //app chạy, nó ko phải là 1 value để có thể so sánh
    //lỗi SQL trung key, sai khóa ngoại, null trên cột yêu cầu khác null
    //đều là lỗi liên quan SQL nhưng ko thể nói thằng nào bằng thằng nào?
    //Đối với exception , chỉ có thể đo nó = câu hỏi: mày có xuất hiện ko?
    // ko dùng asserEquals() so-sánh-coi-nó-có-bằng-nhau-không
    //trong thiết kế của hàm getFactorial() thì nếu đưa vào n<0 hoặc n>2
    //thì hàm ném ra, sẽ new một ngoại lệ
    // cứ đưa n vi phạm, nhận về ngoại lệ
    //vậy nếu có ngoại lệ xảy ra khi n đưa vào cà chớn <0 >21
    // có nghĩa rằng hàm chạy đúng, thấy ngoại lệ ta cần nó xuất hiện -> màu xanh
    //sẽ có test case, tình huống test: xem ngoại lệ có xh không, có-> xanh
    //                                              ko xh như dự kiến ->đỏ
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(-1);// phải xh Exception
//        MathUtility.getFactorial(-10);// phải xh Exception
//        MathUtility.getFactorial(21);// phải xh Exception
//        MathUtility.getFactorial(40);// phải xh Exception
        //nếu xh Exception như kì vọng, thì phải XANH
        //vì màu xanh here hàm ý rằng hàm chạy như thiết kế,
        //nên ngoại lệ khi đưa n cà chớn
        // ta cần kĩ thuật để bắt ngoại lệ, đúng ngoại lệ cần xuất hiện
        // ta có XANH
    }
}

//quy ước xanh : nếu tất cả các lời gọi hàm getFactorial()
// đều trả ra giá trị đúng như kì vọng, nói cách khác tất cả các 
//hàm asserEquals() đều so sánh khớp expected vs. actual
// thì có màu xanh
// XANH: KHI TẤT CẢ CÁC TÌNH HUỐNG TEST HÀM ĐỀU, ĐỀU CHẠY ĐÚNG
//ĐỎ : chỉ cần 1 trong đám này sai, coi như ĐỎ CHO TẤT CẢ
//Lí do phía sau: ĐÃ TEST HÀM THÌ HÀM PHẢI ĐÚNG CHO CÁC TÌNH HUỐNG TEST ĐƯỢC ĐƯA RA
//ĐÃ TEST THÌ PHẢI ĐÚNG CHO CÁC TRƯỜNG HỢP ĐƯỢC ĐƯA RA
//KO chơi trò: hầu hết 
