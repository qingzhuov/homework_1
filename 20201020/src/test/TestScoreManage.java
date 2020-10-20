package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import mainn.ScoreManageInterface;
import mainn.ScoreManageInterfaceIMPL;

class TestScoreManage {

	@Test
	public void Test_01(){
        //虚假学生数据
        //3

        String [][] str=new String[][]{
                {"学号","姓名","语文成绩","数学成绩","英语成绩"},
                {"100001","学生1","50","60","70"},
                {"100002","学生2","60","66","7"},
                {"100003","学生3","50","60","80"},
                {"100004","学生4","80","40","70"},
                {"100005","学生5","50","30","70"}};
        ScoreManageInterface w=new ScoreManageInterfaceIMPL();
        double arrays = w.max_score(str, "语文成绩");
        Assert.assertEquals(arrays,60,0);
        Assert.assertEquals(w.average_score(str,"语文成绩"),52,0);
    }

}
