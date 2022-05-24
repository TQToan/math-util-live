/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Thai Quoc Toan <toantqse151272@fpt.edu.vn>
 */
//Viết Class để cung cấp tiện ích cho nơi khác sài
// khi ta cung cấp tiện ích cho nơi khác xài đó là lúc ta không cần nhớ 
// cái gì cho riêng ta, hàm static giúp làm điều này
public class MathUtil {
    
    //n! = 1.2.3.4.5....n
    //0! = 1! = 1
    // không tính giai thừa cho số âm
    // 20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    // nếu đưa vào âm hay 21! ta không tính.
    public static long getFactorial(int n) {
        if (n  < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be between 0...20");
        } 
        
        if (n == 1 || n == 0) {
            return 1;
        }
        
         long product = 1;
         for (int i = 2; i <= n; i++) {
            product = product * i;
        }
        return product;
    }
}
