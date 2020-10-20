package test;
import org.junit.Test;

import mainn.SortInterface;
import mainn.SortInterfaceIMPL;

public class TestSort {
    //测试根据总成绩进行排序
    @Test
    public void Test_01(){
        //虚假学生数据
        String [][] str=new String[][]{
                {"学号","姓名","语文成绩","数学成绩","英语成绩"},
                {"100001","学生1","50","60","70"},
                {"100002","学生2","60","66","7"},
                {"100003","学生3","50","60","80"},
                {"100004","学生4","50","40","70"},
                {"100005","学生5","50","30","70"}};
        SortInterface w=new SortInterfaceIMPL();
        String[][] arrays = w.Sort_bySum(str);
        for(int i=0;i<arrays.length;i++){
            for(int j=0;j<arrays[i].length;j++){
                System.out.print("["+i+"]["+j+"]:"+arrays[i][j]+"\t\t");
            }
            System.out.println();
        }
    }
}
