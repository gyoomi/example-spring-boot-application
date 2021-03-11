- singletonObjects: 一级缓存，存储的是所有创建好了的单例Bean
- earlySingletonObjects: 完成实例化，但是还未进行属性注入及初始化的对象
- singletonFactories: 提前暴露的一个单例工厂，二级缓存中存储的就是从这个工厂中获取到的对象

全流程图

![](./asserts/0001.png)


全流程图2

![](./asserts/0002.png)

