# 第一节 栈和队列的基本实现和特性

## 1、特点

|   1   |         特点         | 添加、删除 | 查询 |
| :---: | :------------------: | :--------: | :--: |
| Stack | First in - Last out  |    O(1)    | O(n) |
| Queue | First in - First out |    O(1)    | O(n) |

栈和队列中的数据是无序的，如果要查找其中的某个元素，必须一个个的去遍历，所以在最坏的情况下必须将所有元素遍历一遍，其时间复杂为O(n)



## 2、Deque：Double-End Queue

可以理解为Queue和Stack的结合体

![](https://s1.ax1x.com/2020/08/16/dV5IeA.png)

前后都可以添加或者删除

插入和删除依然是O(1)，查找是O(n)



## 3、Stack、Queue、Deque的工程实现

* Java、Python、C++等已有基础实现

* 如何查询接口信息？如何适用？（Demo）

  直接在Google上进行搜索 stack java 8即可