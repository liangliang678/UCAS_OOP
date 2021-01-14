# JUnit4 Runner模块源码分析报告


## 目录结构
1. JUnit-src  
    本报告分析的源码，来自[JUnit4仓库](https://github.com/junit-team/junit4/tree/main/src/main/java/org/junit/runner)
2. JUnit-example  
    展示JUnit使用方法的一个例子，读者可以在命令行中进入这个文件夹，输入以下命令来运行这个例子
    
    `javac -cp ".;lib\*" TestRunner.java TestJunit.java  MessageUtil.java`

    `java TestRunner`
3. image  
    本报告使用的图片
4. 课堂研讨.pptx  
    研讨课汇报使用的PPT



## JUnit介绍
JUnit是一个Java编程语言的单元测试框架。单元测试是一个对单一实体（类或方法）的测试。单元测试是每个软件公司提高产品质量、满足客户需求的重要环节。JUnit在测试驱动的开发方面有很重要的发展，是起源于JUnit的一个统称为xUnit的单元测试框架之一。JUnit促进了“先测试后编码”的理念，强调建立测试数据的一段代码，可以先测试，然后再应用。这个方法就好比“测试一点，编码一点，测试一点，编码一点...”，增加了程序员的产量和程序的稳定性，可以减少程序员的压力和花费在排错上的时间。


## JUnit Runner
本报告主要关注JUnit4中的Runner模块。Runner模块封装在包`org.junit.runner`中，开发者对该包功能的描述是“Provides classes used to describe, collect, run and analyze multiple tests”。Runner模块中最主要的类是JUnitCore，读者可以参考JUnitCore.java。下面是JUnitCore的UML类图。
![JUnitCore的UML类图](https://gitee.com/liangliang678/OOP/raw/master/Assignment2/image/JunitCore.png)
可以看到JUnitCore类中唯一的成员变量是`RunNotifier`类的对象`notifier`，成员方法中包括了`addListner`和`removeListener`用于增加和移除`RUnListner`类的对象`listener`。很显然这运用了设计模式中的“观察者模式”。


## JUnit Runner中的观察者模式
### 观察者模式
观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态上发生变化时，会通知所有观察者对象，使它们能够自动更新自己。


### RunListener类


### RunNotifier类


## 参考资料
1. [JUnit仓库](https://github.com/junit-team/junit4/)
2. [JUnit入门教程](https://wiki.jikexueyuan.com/project/junit/)
3. [JUnit源代码分析-RunNotifier与RunListener](https://blog.csdn.net/yqj2065/article/details/39927927)
4. [UML类图](https://www.jianshu.com/p/57620b762160)
