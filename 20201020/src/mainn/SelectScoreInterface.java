package mainn;
public interface SelectScoreInterface {
    /**
     * 按姓名查找成绩
     * @param str 所有的信息
     * @param name 姓名
     * @return
     */
    public abstract String SelectScore_Name(String [][] str, String name);

    /**
     * 按姓名查找信息
     * @param str 所有的信息
     * @param xh 学号
     * @return
     */
    public abstract String SelectScore_xh(String [][] str, String xh);
}
