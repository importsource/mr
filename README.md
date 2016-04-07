# mr
一个基于内存的分布式计算框架。

###下面是一个典型的wordcount的例子：

```log
Spark provides programmers with an application programming interface centered on a data structure called the resilient distributed dataset (RDD), a read-only multiset of data items distributed over a cluster of machines, that is maintained in a fault-tolerant way.[1] It was developed in response to limitations in the MapReduce cluster computing paradigm, which forces a particular linear dataflow structure on distributed programs: MapReduce programs read input data from disk, map a function across the data, reduce the results of the map, and store reduction results on disk. Spark's RDDs function as a working set for distributed programs that offers a (deliberately) restricted form of distributed shared memory.[2]

The availability of RDDs facilitates the implementation of both iterative algorithms, that visit their dataset multiple times in a loop, and interactive/exploratory data analysis, i.e., the repeated database-style querying of data. The latency of such applications (compared to Apache Hadoop, a popular MapReduce implementation) may be reduced by several orders of magnitude.[1][3] Among the class of iterative algorithms are the training algorithms for machine learning systems, which formed the initial impetus for developing Spark.[4]

Spark requires a cluster manager and a distributed storage system. For cluster management, Spark supports standalone (native Spark cluster), Hadoop YARN, or Apache Mesos.[5] For distributed storage, Spark can interface with a wide variety, including Hadoop Distributed File System (HDFS),[6] MapR File System (MapR-FS),[7] Cassandra,[8] OpenStack Swift, Amazon S3, Kudu, or a custom solution can be implemented. Spark also supports a pseudo-distributed local mode, usually used only for development or testing purposes, where distributed storage is not required and the local file system can be used instead; in such a scenario, Spark is run on a single machine with one executor per CPU core.

Spark Core is the foundation of the overall project. It provides distributed task dispatching, scheduling, and basic I/O functionalities, exposed through an application programming interface (for Java, Python, Scala, and R) centered on the RDD abstraction. This interface mirrors a functional/higher-order model of programming: a "driver" program invokes parallel operations such as map, filter or reduce on an RDD by passing a function to Spark, which then schedules the function's execution in parallel on the cluster.[1] These operations, and additional ones such as joins, take RDDs as input and produce new RDDs. RDDs are immutable and their operations are lazy; fault-tolerance is achieved by keeping track of the "lineage" of each RDD, the sequence of operations produced it, so that it can be reconstructed in the case of data loss. RDDs can contain any type of Python, Java, or Scala objects.

Aside from the RDD-oriented functional style of programming, Spark provides two restricted forms of shared variables: broadcast variables reference read-only data that needs to be available on all nodes, while accumulators can be used to program reductions in an imperative style.[1]

A typical example of RDD-centric functional programming is the following Scala program that computes the frequencies of all words occurring in a set of text files and prints the most common ones. Each map, flatMap (a variant of map) and reduceByKey takes an anonymous function that performs a simple operation on a single data item (or a pair of items), and applies its argument to transform an RDD into a new RDD.
```

###主方法：
```java

Application wordCount = new Application();
Mapper mapper = new WordMap();
wordCount.setMapper(mapper);
Reducer reducer = new WordReducer();
wordCount.setReducer(reducer);
ApplicationManager.start(wordCount);

```

###示例
```
"driver":1
"lineage":1
(HDFS),[6]:1
(MapR-FS),[7]:1
(RDD),:1
(a:1
(compared:1
(deliberately):1
(for:1
(native:1
(or:1
Amazon:1
Among:1
Apache:2
CPU:1
Cassandra,[8]:1
Core:1
Distributed:1
Each:1
File:2
For:2
Hadoop:2
Hadoop,:1
I/O:1
It:2
Java,:2
Kudu,:1
MapR:1
MapReduce:3
Mesos.[5]:1
OpenStack:1
Python,:2
R):1
RDD:3
RDD,:1
RDD-centric:1
RDD-oriented:1
RDD.:1
RDDs:5
RDDs.:1
S3,:1
Scala:2
Scala,:1
Spark:7
Spark's:1
Spark,:1
Spark.[4]Spark:1
Swift,:1
System:2
The:1
These:1
This:1
YARN,:1
a:25
abstraction.:1
accumulators:1
achieved:1
across:1
additional:1
algorithms:2
algorithms,:1
all:2
also:1
an:6
analysis,:1
and:12
anonymous:1
any:1
application:2
applications:1
applies:1
are:3
argument:1
as:4
availability:1
available:1
basic:1
be:6
both:1
broadcast:1
by:3
called:1
can:6
case:1
centered:2
class:1
cluster:4
cluster),:1
cluster.[1]:1
common:1
computes:1
computing:1
contain:1
core.Spark:1
custom:1
data:7
data,:1
data.:1
database-style:1
dataflow:1
dataset:2
developed:1
developing:1
development:1
disk,:1
disk.:1
dispatching,:1
distributed:9
each:1
example:1
execution:1
executor:1
exposed:1
facilitates:1
fault-tolerance:1
fault-tolerant:1
file:1
files:1
filter:1
flatMap:1
following:1
for:4
forces:1
form:1
formed:1
forms:1
foundation:1
frequencies:1
from:2
function:4
function's:1
functional:2
functional/higher-order:1
functionalities,:1
i.e.,:1
immutable:1
imperative:1
impetus:1
implementation:1
implementation):1
implemented.:1
in:9
including:1
initial:1
input:2
instead;:1
interactive/exploratory:1
interface:4
into:1
invokes:1
is:6
it:1
it,:1
item:1
items:1
items),:1
iterative:2
its:1
joins,:1
keeping:1
latency:1
lazy;:1
learning:1
limitations:1
linear:1
local:2
loop,:1
loss.:1
machine:2
machines,:1
magnitude.[1][3]:1
maintained:1
management,:1
manager:1
map:1
map):1
map,:3
may:1
memory.[2]The:1
mirrors:1
mode,:1
model:1
most:1
multiple:1
multiset:1
needs:1
new:2
nodes,:1
not:1
objects.Aside:1
occurring:1
of:24
offers:1
on:9
one:1
ones:1
ones.:1
only:1
operation:1
operations:3
operations,:1
or:5
orders:1
over:1
overall:1
pair:1
paradigm,:1
parallel:2
particular:1
passing:1
per:1
performs:1
popular:1
prints:1
produce:1
produced:1
program:3
programmers:1
programming:3
programming,:1
programming::1
programs:2
programs::1
project.:1
provides:3
pseudo-distributed:1
purposes,:1
querying:1
read:1
read-only:2
reconstructed:1
reduce:2
reduceByKey:1
reduced:1
reduction:1
reductions:1
reference:1
repeated:1
required:1
requires:1
resilient:1
response:1
restricted:2
results:2
run:1
scenario,:1
schedules:1
scheduling,:1
sequence:1
set:2
several:1
shared:2
simple:1
single:2
so:1
solution:1
standalone:1
storage:2
storage,:1
store:1
structure:2
style:1
style.[1]A:1
such:4
supports:2
system:1
system.:1
systems,:1
take:1
takes:1
task:1
testing:1
text:1
that:7
the:23
their:2
then:1
through:1
times:1
to:6
track:1
training:1
transform:1
two:1
type:1
typical:1
used:3
usually:1
variables:1
variables::1
variant:1
variety,:1
visit:1
was:1
way.[1]:1
where:1
which:3
while:1
wide:1
with:3
words:1
working:1

```

###下面是个计算平均分的例子

输入数据：
```log
zhangsan 20,
lisi 80,
wangwu 100,
zhangsan 84,
lisi 200,
wangwu 100,
zhangsan 20,
lisi 400,
wangwu 45,
zhangsan 20,
lisi 400,
wangwu 45,
zhangsan 22,
lisi 400,
wangwu 435,
zhangsan 230,
lisi 4003,
wangwu 453,
zhangsan 230,
lisi 4003,
wangwu 453
```

java启动实现
```java

		Application avg = new Application();
		Mapper mapper = new AvgMapper();
		avg.setMapper(mapper);
		Reducer reducer = new AvgReducer();
		avg.setReducer(reducer);
		ApplicationManager.start(avg);

```

输出结果：
```
lisi:1355
wangwu:233
zhangsan:89
```


###下面是个计算权重的例子

输入数据：
```tab
1	做旧的效果很好，穿上去很有范，，皮子特别软，不卡脚，质感超级好！软软的！比我在三叶草里面看到的任何一双小白鞋都更好看！心动的赶紧下手下手！很少写评论的！这次真的是太满意吖～我要去臭美去了
2	鞋子样式好看，做工不错，缺陷是皮子很硬，鞋头硌脚，那个胶水味道大的头晕，已经在阳台晒了很久还是臭的要死，不知道透气性如何,
3	简直是喜欢炸了好吗！一开始看了好多好多最后决定买这个，！收到货真的是感觉超值得，以后买鞋一定要在这里买！美疯了！货比三家的亲一定要在这家买呢！,
4	简直是喜欢炸了好吗！一开始看了好多好多最后决定买这个，！收到货真的是感觉超值得，以后买鞋一定要在这里买！美疯了！货比三家的亲一定要在这家买呢！,
5	鞋子很好 比想象中要软 舒服 ?脚感很好 鞋底很软很舒服 下次还会再来的,
6	外出踏青首选。鞋子是全 头层牛皮穿着很舒服 ，走一天都不累，不打脚 。，
7	好穿，皮又软，穿着舒服！！,
8	呵呵,
9	晕,
10	沃日
```

java启动实现：
```java
public class CommentTest {
	public static void main(String[] args) {
		Application avg = new Application();
		Mapper mapper = new CommentMapper();
		avg.setMapper(mapper);
		Reducer reducer = new CommentReducer();
		avg.setReducer(reducer);
		ApplicationManager.start(avg);
	}
}
```

输出结果：
```log
1:20
10:5
3:20
4:20
5:20
6:20
8:5
9:5

```
