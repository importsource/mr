# mr
一个基于内存的分布式计算框架。


```java
Application wordCount = new Application();
Mapper mapper = new WordMap();
wordCount.setMapper(mapper);
Reducer reducer = new WordReducer();
wordCount.setReducer(reducer);
ApplicationManager.start(wordCount);
```

