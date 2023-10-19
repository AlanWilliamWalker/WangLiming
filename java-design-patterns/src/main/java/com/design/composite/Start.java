package com.design.composite;

import com.alibaba.fastjson.JSON;

public class Start {
    public static void main(String[] args) {
        TreeNode A = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        A.add(B);
        System.out.println(JSON.toJSONString(A));
    }
}
