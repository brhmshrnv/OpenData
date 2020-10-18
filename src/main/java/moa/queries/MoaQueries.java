package moa.queries;

public class MoaQueries {

    public static final String save = "INSERT into farmer(s_name,arpa,gargidali,cemi_ha,gunebaxan,pambiq,seker_cugunduru,kartof,terevez,bostan,uzum,meyve,cay,diger,kend,ad_rayon,rayon) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public static final String update = "UPDATE farmer SET s_name=?,arpa=?,gargidali=?,cemi_ha=?,gunebaxan=?,pambiq=?,seker_cugunduru=?,kartof=?,terevez=?,bostan=?,uzum=?,meyve=?,cay=?,diger=?,kend=?,ad_rayon=?,rayon=? WHERE id=?";
    public static final String delete = "DELETE farmer WHERE id=?";
    public static final String findById = "SELECT * from farmer WHERE id=?";
    public static final String findAll = "SELECT * from farmer";
}
