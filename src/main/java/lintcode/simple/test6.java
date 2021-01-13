package lintcode.simple;

/**
 * @Description 合并两个有序升序的整数数组A和B变成一个新的数组。新数组也要有序。
 * @Date 2020/6/11  18:09
 **/
public class test6 {
    public static void main(String[] args) {
        int[] a={1,2,4,5,66};
        int[] b={1,66,78};
        int[] c=merge(a,b);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
    public static int[] merge(int[] a,int[] b){
        //数组为空的时候直接返回空
        if(a==null || b==null){
            return null;
        }
        //合并后的数组，长度为两个数组长度之和
        int[] result= new int[a.length+b.length];

        int i=0,j=0,index=0;
        while (i<a.length&&j<b.length){
            if (a[i]<b[j]){
                result[index++]=a[i++];
            }else {
                result[index++]=b[j++];
            }
        }
        //当出现只有一个数组的时候，将里面的数据全部放到合并的数组里面
        while (i < a.length) {
            result[index++] = a[i++];
        }
        while (j < b.length) {
            result[index++] = b[j++];
        }

        return result;
    }
}
