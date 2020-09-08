学习笔记

本周课程学习了递归、分治、回溯等三种解题方式

分治和回溯类似于递归

分治是将一个大的计算拆分成若干个小的计算，最后将结果进行合并

回溯是在递归的时候对每一步的结果进行校验，对于不符合的步骤向上一层进行返回。

Java 递归代码模板

~~~java
public void recursion(int level, int param) {
    // recursion terminator
    if (level > MAX_LEVEL) {
        // process result
        return;
    }
    
    // process current logic
    process(level, param);
    
    // drill down
    recursion(level: level + 1, newParam);
    
    // restore current status
}
~~~

