# GenericDemo

# 1.泛型类
        //没有明确泛型类型时，泛型的类型默认是object
        GenericType g1 = new GenericType();
        g1.setT("aaa");
        Object ob = g1.getT();
        //明确了泛型的类型后，泛型的类型是<>内的类型
        GenericType<String> g = new GenericType<>();
        g.setT("aaaa");
        String str = g.getT();

        GenericType<Integer> gg = new GenericType<>();
        gg.setT(1);
        int num = gg.getT();

# 2.泛型接口
        DemoInter2<String,String> d = new DemoInter2<>();
        DemoInter3 d2 = new DemoInter3();

# 3.泛型方法
        GenericMethod gm = new GenericMethod();
        gm.method("haha");
        gm.method(1);

        /**
         * -----------------------------------------------
         * **/
# 泛型通配符
        //泛型通配符不是定义在对象上的
        //用在方法的形参上
//        ArrayList<?> list = new ArrayList<>();
//        ArrayList<? extends Person> list1 = new ArrayList<>();//向下限定
//        ArrayList<? super Student> list2 = new ArrayList<>();//向上限定
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student());
        method(list);
        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(new Person());
        method(list2);
        //为什么要有泛型通配符？因为集合没有协变
        //单数数组可以协变
        Person[] ps = new  Person[2];
        ps[0]=new Person();
        ps[1]=new Person();
        method2(ps);
        Student[] ss = new  Student[2];
        ss[0]=new Student();
        ss[1]=new Student();
        method2(ss);

        //集合不可以协变
        ArrayList<Student> ls_s = new ArrayList<>();
        ArrayList<Person> ls_p = new ArrayList<>();
        method3(ls_p);
        //method3(ls_s);//error 不可协变 一一对应
        //向下限定
        method4(ls_p);
        method4(ls_s);
        ArrayList<Object> ls_o = new ArrayList<>();
        method5(ls_o);
        method5(ls_p);
        //method5(ls_s);//error 被限定了 不可是Person的子类
