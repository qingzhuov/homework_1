package mainn;
public interface ScoreManageInterface {
   /**
    * 返回平均成绩，最大值
    * @param str 所有相关信息
    * @param course 课程名称
    * @return
    */
   public abstract double average_score(String [][] str,String course) ;
   public abstract double max_score(String [][] str,String course) ;

}
