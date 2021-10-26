```
x := 0;
y := 0;
z := 0;
x := y + 1;
z := z + 2;
while (y < 3)
do
{
    if (x < y) then
    {
        x := x + 1;
    }
    else
    {
        y := y + 1;
    }
    y := y + 2;
}
```

##### 几种结构需要处理

1. seq顺序结构

   ```
   p1=assign : statement
   p2=assign : seq
   ```

   这种情况打一个标签就行， （P标签下标，标签下标+1，P标签下标）

   ```
   p1=assign : statement
   p2=while/if : seq
   ```

   - 赋值语句后是if或者while语句，其实对于`z=z+2`的pc‘不应该再接着用label_seq了，而是使用while_seq

   ```
   p1=while/if : statement
   p2=assign : seq
   ```

   其实对于p1我们只应该考虑其后续的p2是什么语句，来定义pc’ 是在哪个`seq`的基础上来进行设置

   ```
   statement 
   seq
   的情况
   
   // output : {action,Same(?),pc,pc'}
   // (1) action 
   //     if nowP = ass then action = assign
   //     if nowP = while/if then action = judge
   // (2) Same
   //     if nowP ass then Same(var)
   //     if nowP while/if then Same(V)
   // (3) pc 
   //     只关心ass、while、if设置的几个标志位（getInPC）
   
   // (4) pc'
   //     需要结合考虑nowP与nextP的类型
   //     ass:ass 很好处理
   //     ass:while/if 也很好处理
   //     if : ass 需要到if节点中进行处理
   //     while : ass  可能是需要回到自己的
   // case 1   ass:ass
   // case 2   ass:while/if
   
   ```

   

   ##### 思想

   （1）对于一个seq结构而言，我们应该只处理第一个表达式，输出的结果也应该只对应也第一个表达式的结果

   （2）但是如果对应有statement：statement的情况，那么说明应该是程序结束或者是block里面结束的情况，而我们对于单一的statement是不好处理的

   其实就要考虑很多的情况了

2. while结构

3. if结构

4. 