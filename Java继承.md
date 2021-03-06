# 继承

----

Tips：1）Java只支持单重继承，即每一个类有且仅有一个直接父类，一个父类可以产生多个子类

2）子类只能继承父类中非private的成员变量

3）子类的成员变量和父类的成员变量重名时，父类的成员变量将被覆盖，而不是被继承

4）子类只能继承父类中非private的成员方法

5）子类的成员方法和父类的成员方法重名时，父类的成员方法将被覆盖，而不是被继承

6）子类可以实现到父类的类型转换，这种转换称为“向上转型”。

Super关键字

Super关键字表示对某个类的父类的引用，一般而言，super有两种通用形式:第一种是用来访问被子类的成员隐藏的父类成员，如被覆盖了的父类成员，包括成员方法和成员变量。第二种是可以调用父类的构造函数

调用形式：super.成员变量名 ??super.成员方法名（参数列表）

Java中的继承关系实现对成员的访问是按照最近匹配原则进行的：

（1）?在子类中访问成员变量和方法时将优先查找是否在本类中已定义，如不在，按照继承层次的顺序往父类查找，如果未找到，继承逐层向上到其祖先类查找

（2）?This关键字是特指对本类的对象引用，因此，使用this访问成员则首先在本类中查找，如果没有，继续逐层向上到其祖先类查找

（3）?super关键字是特指访问父类的成员，使用super首先到父类查找匹配成员，如果未找到，在逐层向上到其祖先类查找

tips：若要避免子类继承父类某个方法，可以使用final关键字使继承终止，使此方法不会在子类中被覆盖（即子类中不能有和此方法同名的方法），如果要使某个类不能被继承，也可使用final关键字来声明类，使其他类无法使用extends来继承该类。

l构造方法的继承性（super调用父类构造函数）

可以用super调用父类中定义的构造函数：

格式：super（调用参数列表）

这里的调用参数列表必须和父类的某个构造函数的参数列表完全匹配，即调用参数列表的参数个数和参数类型都要和父类的某个构造函数里用到的参数一一对应。

子类与其直接父类之间的构造函数是存在约束关系的，构造函数的继承性体现主要有以下几条重要原则：

规则一:按继承关系，构造方法是从顶向下进行的

规则二：如果子类无构造函数，则它默认调用父类无参数的构造函数，如果父类中没有无参数的构造方法，将产生错误。

规则三：如果子类有构造方法，那么在创建子类对象时，则将先执行父类的构造函数，然后再执行子类的构造函数。

规则四：如果子类有构造方法，但子类的构造方法中没有使用super关键字，则系统默认执行该构造函数时会产生super（）代码，即该构造方法会调用父类无参数的构造方法。

规则五：对于父类中包含有参数的构造方法，子类可以通过自己的构造函数中使用super关键字来引用，而且必须是子类构造方法中的第一条语句，在构造方法中一次只能调用父类的一个构造函数。（这时就不会先调用父类无参构造函数，而是直接先调用super（参数列表）语句，即父类中对应的构造函数）

Tips：Java中，当一个类中含有一个或多个有参数的构造函数，系统不提供默认构造函数，所以当在父类中定义多个有参构造方法时，应考虑写一个不带参数的构造方法，以防止子类省略super关键字时出现错误。

问题：（1）针对规则二,若子类和父类均无构造方法，会不会产生错误？系统是否默认调用父类默认无参构造方法？

不会，只有在父类中有其他含参构造函数但无无参构造函数时出错

（2）针对规则四，是否有系统提供的默认无参构造函数，若父类中无构造函数，子类中有构造函数，生成子类对象时是否出错？

视情况而定，若父类中没有一个构造函数，那么系统会提供而不会出错，只有在父类中有其他含参构造函数但无无参构造函数时出错

（3）什么情况下才会调用系统提供的默认构造函数？

类中没有任何构造函数
