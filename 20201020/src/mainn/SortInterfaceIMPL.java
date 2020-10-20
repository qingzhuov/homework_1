package mainn;
import java.util.Arrays;
import java.util.Comparator;

public class SortInterfaceIMPL implements SortInterface {
    @Override
    public String[][] Sort_bySum(String[][] str) {
        String [][] newStr=new String[str.length][];
        for (int i = 0; i < str.length; i++) {
            newStr[i]=Arrays.copyOf(str[i],str[i].length+1);
        }
        newStr[0][newStr[0].length-1]="0";
        for (int i = 1; i < newStr.length; i++) {
            Double sum=0.0;
            for (int j = 2; j <newStr[i].length-1 ; j++) {
                sum+=Double.parseDouble(newStr[i][j]);
            }
            newStr[i][newStr[i].length-1]=sum.toString();
        }
        /**
         * 重写Arrays.sort按照最后一列增序排列
         */
        Arrays.sort(newStr, new Comparator<String[]>() {
            @Override
            public int compare(String[] strings, String[] t1) {
               return (int) (Double.parseDouble(strings[strings.length-1])-Double.parseDouble(t1[t1.length-1]));
            }
        });
        newStr[0][newStr[0].length-1]="总成绩";
        return newStr;
    }
}
