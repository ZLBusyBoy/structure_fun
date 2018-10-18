package cn.zl.array;

/**
 * Create by ling.zhang on 2018/10/17.
 * 自定义一个集合的实现
 */
public class MyArray<E> {

    //集合中的元素用数组存储
    private Object[] elementsData;
    //集合中元素的长度
    private int size;

    private static int DEFAULT_ARRAY_SIZE = 16;


    private void init(int capacity){
        this.elementsData = new Object[capacity];
    }
    //初始化默认大小
    public MyArray(){
        init(DEFAULT_ARRAY_SIZE);
    }

    //初始化有大小参数
    public MyArray(int capacity){
        init(capacity);
    }

    //正常的添加，向尾部添加
    public void addLast(Object object){
        add(object,size);
    }

    //从头开始添加，这样做就需要把所有位置靠后的数据统一的向后挪
    public void addFirst(Object object){
        add(object,0);
    }

    //add
    private void add(Object object,int index){
        if (null == object)
            throw new IllegalArgumentException("ElementData is Null");

        if (size == elementsData.length)
            throw new IllegalArgumentException("ElementsData is Full");

        if (index < 0 && index > elementsData.length)
            throw new IllegalArgumentException("Data add fail! index < 0 && index > elementsData.length");


        for (int i=size-1; i>=index; i--){
            elementsData[i+1] = elementsData[i];
        }
        elementsData[index]= object;
        size++;
    }

    //delete

    //modify

    //get








}
