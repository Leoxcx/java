package com.leo.oop;

/**
 * @author : Leox
 * @date : 2021/11/14 22:50
 * @description : 类和对象
 */
public class Hero { //Hero 类
    //属性
    String name;    //姓名
    float hp;   //血量
    float armor;    //护甲
    int moveSpeed;  //移动速度
    float attackSpeed;  //攻击速度

    //方法
    void kill() {
        System.out.println("you have slain an enemy");  //你已经击杀一名敌方英雄
    }

    void deKill() {
        System.out.println("you have been slain");  //你已经被敌方英雄击杀
    }

    //返回float类型值的方法
    float getCurrentHp() {
        return armor;
    }

    //带int类型参数的方法
    void addMoveSpeed(int speed) {
        moveSpeed = moveSpeed + speed;
    }



    public static void main(String[] args) {
        Hero garen = new Hero();    //garen 对象
        garen.name = "盖伦";
        garen.hp = 680.77f;
        garen.armor = 32.53f;
        garen.moveSpeed = 350;
        garen.attackSpeed = 0.65f;
        System.out.println(garen.getCurrentHp());
        garen.deKill();


        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 535.41f;
        teemo.armor = 28.53f;
        teemo.moveSpeed = 330;
        teemo.attackSpeed = 0.61f;
        teemo.addMoveSpeed(30);
        System.out.println(teemo.moveSpeed);
        teemo.kill();

    }
}
