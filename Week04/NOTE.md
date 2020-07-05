#学习笔记

##深度优先搜索、广度优先搜索的实现和特性

深度优先搜索（dfs）

它的思想是从一个顶点开始，沿着一条路一直走到底，如果发现不能到达目标解，那就返回到上一个节点，然后从另一条路开始走到底，这种尽量往深处走的概念即是深度优先的概念。

深度优先搜索包括树的前序、中序、后续遍历。

深度优先搜索模板：

递归写法

visited = set() 

def dfs(node, visited):

​    if node in visited: # terminator

​            \# already visited 

​            return 

visited.add(node) 

\# process current node here. 

...

for next_node in node.children(): 

if next_node not in visited: 

dfs(next_node, visited)

非递归写法

def DFS(self, tree): 

if tree.root is None: 

return [] 

visited, stack = [], [tree.root]

while stack: 

node = stack.pop() 

visited.add(node)

process (node) 

nodes = generate_related_nodes(node) 

stack.push(nodes) 

\# other processing work 

...



 广度优先搜索（bfs）

也称为宽度优先搜索，它是一种先生成的结点先扩展的策略。

\# Python

def BFS(graph, start, end):

​    visited = set()

queue = [] 

queue.append([start]) 

while queue: 

node = queue.pop() 

visited.add(node)

process(node) 

nodes = generate_related_nodes(node) 

queue.push(nodes)

\# other processing work 

...

## 贪心算法

贪心算法是一种在每一步选择中都采取在当**前状态下最好或最优**（即最有

利）的选择，从而希望导致结果是全局最好或最优的算法。

贪心算法与动态规划的不同在于它对每个子问题的解决方案都做出选择，不

能**回退**。动态规划则会保存以前的运算结果，并根据以前的结果对当前进行

选择，有**回退**功能。

 

贪心法可以解决一些最优化问题，如：求图中的最小生成树、求哈夫曼编码

等。然而对于工程和生活中的问题，贪心法一般不能得到我们所要求的答

案。

一旦一个问题可以通过贪心法来解决，那么贪心法一般是解决这个问题的最

好办法。由于贪心法的高效性以及其所求得的答案比较接近最优结果，贪心

法也可以用作辅助算法或者直接解决一些要求结果不特别精确的问题。

 

需要注意的地方

1 贪心算法在一些情况下不能得到最优解，当你使用贪心算法是必须能证明你的解是最优的

2 有时候贪心算法需要从一个特殊的角度切入，比如从后往前，比如从局部切入。

 

适用贪心算法的场景

简单地说，问题能够分解成子问题来解决，子问题的最优解能递推到最终

问题的最优解。这种子问题最优解称为最优子结构。

贪心算法与动态规划的不同在于它对每个子问题的解决方案都做出选择，

不能回退。动态规划则会保存以前的运算结果，并根据以前的结果对当前

进行选择，有回退功能。

## 二分查找

二分查找的前提

1. 目标函数单调性（单调递增或者递减）

2. 存在上下界（bounded）

3. 能够通过索引访问（index accessible)