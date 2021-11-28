package com.leo.bmi;

import java.util.Scanner;

/**
 * @author : Leox
 * @date : 2021/11/28 16:39
 * @description : BMI 求肥胖指数
 */
public class Bmi {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("请输入身高（m）：");
        float height = sca.nextFloat();
        System.out.println("请输入体重（kg）：");
        float weight = sca.nextFloat();
        Bmi bmi = new Bmi();
        float comput = bmi.comput(height, weight);
        System.out.println(comput);
        bmi.BMI(comput);

    }

    public float comput(float height, float weight) {
        return weight/(height*height);
    }

    public void BMI(float bmi) {
        if(bmi < 18.5) {
            System.out.println("体重过轻");
        }else if(bmi < 24) {
            System.out.println("正常范围");
        }else if(bmi < 27) {
            System.out.println("体重过重");
        }else if(bmi < 30) {
            System.out.println("轻度肥胖");
        }else if(bmi < 35) {
            System.out.println("中度肥胖");
        }else{
            System.out.println("重度肥胖");
        }
    }
}
