package com.at.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fyd
 * @date 2022/6/15 - 10:37
 */
public class TemplatesTest {
//    模板6 prsf
    private static final Customer CUST = new Customer();
//    psfi
    public static final int NUM = 1;
//    psfs
    public static final String NATION = "CHINA";


    //    模板1 main
    public static void main(String[] args) {

//    模板2 sout soutv soutp soutm xxx.sout
//        System.out.println();
//        System.out.println("args = " + Arrays.deepToString(args));
//        System.out.println("TemplatesTest.main");
//        int num = 1;
//        System.out.println("num = " + num);
//        int num1 = 2;
//        System.out.println("num1 = " + num1);
//        System.out.println(num1);
//
//        模板3 fori iter itar
        String[] arr =new String[]{"tom","jerry"};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
//        iter
        for (String s : arr) {
            System.out.println(s);
        }
//       itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }

//        模版4 list.for
        List<Character> list = new ArrayList();
        list.add('1');
        list.add('2');
        list.add('3');

        list.forEach(item-> System.out.println("item = " + item));

        for (Character character : list) {
            System.out.println("character = " + character.charValue());
        }

//        list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        list.forr  倒序
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }


    }

    public void method(){
        List<Character> list = new ArrayList();
        list.add('1');
        list.add('2');
        list.add('3');
//        模板5 ifn
        if (list == null) {
            
        }

//        ifnn
        if (list != null) {

        }

//        xxx.nn /  xxx.null
        if (list == null) {

        }

        if (list != null) {

        }
    }

}
