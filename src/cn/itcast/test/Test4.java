package cn.itcast.test;  
  
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;  
import java.util.List;  
  
public class Test4 {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
          
       /* List<String> l1 = new ArrayList<String>();  
        l1.add("a");  
        l1.add("b");  
        l1.add("c");  
        l1.add("e");  
        l1.add("e");  
        l1.add("e");  
        l1.add("e");  
        l1.add("a");  
        List<String> listWithoutDup = new ArrayList<String>(new HashSet<String>(l1));  
          
        for(String str : listWithoutDup){  
            System.out.println(str);  
        }  */
    	/** 
         * @param args 
         */  
            List<Integer> l1 = new ArrayList<Integer>();  
            l1.add(-8);  
            l1.add(10);  
            l1.add(6);  
            l1.add(10);  
              
            List<Integer> l2 = new ArrayList<Integer>();  
            l2.add(9);  
            l2.add(-3);  
            l2.add(0);  
            l2.add(6);  
              
           //l1.removeAll(l2);//�˴�ָ���ǽ���l2�ظ���ɾ��  
            l1.addAll(l2);//�˴�ָ����l2  
           
            //�����֤l1,��l2  2�����Ե�LIST �����ظ������д��벻��д���������ֺϲ���LIST�ظ������⣬���忴ҵ����Ҫ  
            l1 = new ArrayList<Integer>(new HashSet<>(l1));  
           // System.out.println(Collections.sort(l1));
            for(Integer in : l1){  
                System.out.print(in + " , ");  
            }  
              
        }  
}  