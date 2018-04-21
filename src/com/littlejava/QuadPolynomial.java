package com.littlejava;
//code
public class QuadPolynomial {
    public int a;
    public int b;
    public int c;

    public int result(int x){
        int  res = a*(x*x)+b*x+c;
        System.out.println("x="+x+", 一元二次多项式的计算:"+ res);
        return res;
    }
}
