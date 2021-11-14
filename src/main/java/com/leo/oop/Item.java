package com.leo.oop;

/**
 * @author : Leox
 * @date : 2021/11/14 22:59
 * @description :
 */
public class Item {
    String name;    //名称
    int price;  //价格
    String effect;  //效果

    public static void main(String[] args) {
        Item bloodVial = new Item();
        bloodVial.name = "血瓶";
        bloodVial.price = 50;
        bloodVial.effect = "加100点血";

        Item shoe = new Item();
        shoe.name = "草鞋";
        shoe.price = 300;
        shoe.effect = "加60点移速";

        Item sword = new Item();
        sword.name = "长剑";
        sword.price = 350;
        sword.effect = "加10点攻击力";
    }
}
