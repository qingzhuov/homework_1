package mainn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreManageInterfaceIMPL implements ScoreManageInterface {


    //某科平均成绩
    @Override
    public double average_score(String[][] str, String course) {
        double sum = 0;
        double average_score;
        boolean f = false;
        ko:
        for (int i = 0; i < str[0].length; i++) {
            if (str[0][i].equals(course)){
                for (int j = 1; j <str.length ; j++) {
                    sum+=Double.parseDouble(str[j][i]);
                }
                f=true;
                break ko;
            }
        }
        if(!f)return -1.0;
        average_score=sum/(str.length-1);
        return average_score;
    }

    //某科最高成绩
    @Override
    public double max_score(String[][] str, String course) {
        List<Double> list = new ArrayList<>();
        boolean f = false;
        ko:
        for (int i = 0; i < str[0].length; i++) {
            if (str[0][i].equals(course)){
                for (int j = 1; j <str.length ; j++) {
                    list.add(Double.parseDouble(str[j][i]));
                }
                f=true;
                break ko;
            }
        }
        if(!f)return -1.0;
        Collections.sort(list);
        return  list.get(list.size() - 1);
    }
}
