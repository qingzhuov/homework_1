package mainn;
public class main {
    public static void main(String[] args) {
        ScoreManageInterface w =new ScoreManageInterfaceIMPL();
        SelectScoreInterface h=new SelectScoreInterfaceIMPL();
        SortInterface ws=new SortInterfaceIMPL();
        //socre.xlsx的地址，读取excel中的信息
        excel excel=new excel("D:\\Java_Project\\_\\score.xlsx", "sheet2");
        String[][] str = excel.readExcelData();
        System.out.println("（物理）平均成绩："+w.average_score(str,"物理成绩"));//查询平均成绩
        System.out.println("(物理)最高成绩："+w.max_score(str,"物理成绩"));//查询最大成绩
        System.out.println("根据姓名查询成绩（张一）:"+h.SelectScore_Name(str,"张一"));//根据姓名查询成绩等信息
        System.out.println("根据学号查询成绩（100001.0）："+h.SelectScore_xh(str,"100001.0"));//根据学号查询成绩等信息
        String[][] arrays = ws.Sort_bySum(str);
        System.out.println( arrays[0].length);




        System.out.println( str[0].length);

//        System.out.println(arrays.length+"--"+arrays[0].length);
        //遍历新的数组
        for(int i=arrays.length;i>=0;i--) {

            for(int j=0;j<arrays[i].length;j++) {
                System.out.print(arrays[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
