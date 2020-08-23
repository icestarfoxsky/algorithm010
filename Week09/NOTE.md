# 高级动态规划
递归、分治、回溯、动态规划复习

递归 - 函数自己调用自己

分治 - 分而治之

感触

1. 人肉递归低效、很累

2. 找到最近最简方法，将其拆解成可重复解决的问题

3. 数学归纳法思维

本质：寻找重复性  —> 计算机指令集

动态规划

1. “Simplifying a complicated problem by breaking it down into

simpler sub-problems”

(in a recursive manner)

2. Divide & Conquer + Optimal substructure

分治 + 最优子结构

3. 顺推形式： 动态递推

关键点

动态规划 和 递归或者分治 没有根本上的区别（关键看有无最优的子结构）

拥有共性：找到重复子问题

差异性：最优子结构、中途可以淘汰次优解

常见的 DP 题目

爬楼梯

不同路径

打家劫舍

最小路径和

股票买卖

高阶的 DP 问题

复杂度来源

1. 状态拥有更多维度（二维、三维、或者更多、甚至需要压缩）

2. 状态方程更加复杂

本质：内功、逻辑思维、数学

# 字符串算法
字符串基础知识

java，c#，python，javascript and python的字符串都是不可变的（immutabale），换句话说，添加或者删除字符都会新创建一个字符串，也就是线程安全的。

ruby和php是可变的.

c只有char；c++则有自己的string类，是可变的。

swift是可变的。

c++和swift可以通过关键字使得string为不可变的。

字符串比较

Java:

String x = “abb”;

String y = “abb”;

x == y —-> false

x.equals(y) —-> true

x.equalsIgnoreCase(y) —-> true

高级字符串算法

最长子串、子序列

字符串 + 递归 or DP

字符串匹配算法

1. 暴力法（brute force） - O(mn)

2. Rabin-Karp 算法

3. KMP 算法
