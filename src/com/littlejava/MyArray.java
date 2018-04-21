package com.littlejava;
//import java.util.ArrayList;
//code
public class MyArray {

    int [] array = new int[100];
    int i = 0;
    //定义一个有限大的数组【无限大的有点难】，将元素插入空数组中

    //1. 添加一个整数到数组中
    public int[] add(int x){
        array[i] = x;
        i++;
        return array;
    }

    // 2. 从小到大排序
    public int[] sort() {
        int[] ascSort = new int[i];
        System.out.print("2. 从小到大排序:");
        for(int n=0;n<i;n++)
        {
            for(int k=n+1;k<i;k++)
            {
                if(array[k]>array[n])
                {
                    int number=array[n];
                    array[n]=array[k];
                    array[k]=number;
                }
            }
            ascSort[n] = array[n];
            System.out.print(ascSort[n]);
            if(n < i-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        return ascSort;
    }

    // 3. 获取数组最大值
    public int max(){
        int max_num = array[0];
        for (int n = 1; n < i; n++) {
            if (array[n] > max_num) max_num = array[n];
        }
        System.out.println("3. 获取数组最大值:"+ max_num);
        return max_num;
    }

    // 4. 获取数组长度
    public int length(){
        return i;
    }


    //5. 获取内部的数组, 返回一个数组
    public int[] output(){
        int [] arr = new int[i];
        for (int n = 0; n < i; n++) {
            arr[n] = array[n];
        }
        System.out.print("5. 获取内部的数组, 返回一个数组:");
        return arr;
    }

}
