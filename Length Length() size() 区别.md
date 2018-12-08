# Length Length() size() 区别

+ length() 用于求 **String字符串对象** 的长度
+ 而 length 用于求 **String字符串数组** 的长度
+  length() 是求String字符串对象中字符的个数
+ 而 length 是求字符串数组中有多少个字符串

----

+ java中的 length 属性是针对 **数组** 
+ java中的 length() 方法是针对 **字符串String** 
+ java中的 size() 方法是针对 **泛型集合**

## 例如

> import java.util.ArrayList;
>
> import java.util.List;
>
> String[] str = {"hello", "world"};
>
> List<Double> arr = new ArrayList<Double>();
>
> arr.add(1.0) // 注意 1.0 
>
> System.out.println(str.length); // 结果为 2
>
> System.out.println(str[1].length()); // 结果为 5
>
> System.out.println(arr.size()); // 结果为 1





