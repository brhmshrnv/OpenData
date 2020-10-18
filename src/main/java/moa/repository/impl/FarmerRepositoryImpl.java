package moa.repository.impl;


import moa.db.DbConnection;
import moa.model.Farmer;
import moa.queries.MoaQueries;
import moa.repository.FarmerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FarmerRepositoryImpl implements FarmerRepository {

    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    @Override
    public Farmer saveFarmer(Farmer farmer) {

        connection = DbConnection.getConnection();

        try {
            //"INSERT into farmer(s_name,arpa,gargidali,cemi_ha,gunebaxan,pambiq,seker_cugunduru,
            // kartof,terevez,bostan,uzum,meyve,cay,diger,kend,ad_rayon,rayon) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
            preparedStatement = connection.prepareStatement(MoaQueries.save);
            preparedStatement.setString(1,farmer.getsName());
            preparedStatement.setDouble(2,farmer.getArpa());
            preparedStatement.setDouble(3,farmer.getGargidali());
            preparedStatement.setDouble(4,farmer.getCemiHa());
            preparedStatement.setDouble(5,farmer.getGunBax());
            preparedStatement.setDouble(6,farmer.getPambiq());
            preparedStatement.setDouble(7,farmer.getSekCug());
            preparedStatement.setDouble(8,farmer.getKartof());
            preparedStatement.setDouble(9,farmer.getTerevez());
            preparedStatement.setDouble(10,farmer.getBostan());
            preparedStatement.setDouble(11,farmer.getUzum());
            preparedStatement.setDouble(12,farmer.getMeyve());
            preparedStatement.setDouble(13,farmer.getCay());
            preparedStatement.setDouble(14,farmer.getDiger());
            preparedStatement.setString(15,farmer.getKend());
            preparedStatement.setString(16,farmer.getAdRayon());
            preparedStatement.setDouble(17,farmer.getRayon());
            preparedStatement.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DbConnection.closeConnection(connection, preparedStatement, null);
        }


        return farmer;
    }

    @Override
    public boolean saveBatchFarmers(List<Farmer> farmerList) {

        connection = DbConnection.getConnection();

        try {

            preparedStatement = connection.prepareStatement(MoaQueries.save);

            for (Farmer farmer : farmerList){

                preparedStatement.setString(1,farmer.getsName());
                preparedStatement.setDouble(2,farmer.getArpa());
                preparedStatement.setDouble(3,farmer.getGargidali());
                preparedStatement.setDouble(4,farmer.getCemiHa());
                preparedStatement.setDouble(5,farmer.getGunBax());
                preparedStatement.setDouble(6,farmer.getPambiq());
                preparedStatement.setDouble(7,farmer.getSekCug());
                preparedStatement.setDouble(8,farmer.getKartof());
                preparedStatement.setDouble(9,farmer.getTerevez());
                preparedStatement.setDouble(10,farmer.getBostan());
                preparedStatement.setDouble(11,farmer.getUzum());
                preparedStatement.setDouble(12,farmer.getMeyve());
                preparedStatement.setDouble(13,farmer.getCay());
                preparedStatement.setDouble(14,farmer.getDiger());
                preparedStatement.setString(15,farmer.getKend());
                preparedStatement.setString(16,farmer.getAdRayon());
                preparedStatement.setDouble(17,farmer.getRayon());
                preparedStatement.addBatch();
            }

            preparedStatement.executeBatch();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
           DbConnection.closeConnection(connection, preparedStatement, null);
        }


        return true;
    }

    @Override
    public Farmer updateFarmer(Farmer farmer) {

        connection = DbConnection.getConnection();

        try {

            //UPDATE farmer SET s_name=?,arpa=?,gargidali=?,cemi_ha=?,gunebaxan=?,pambiq=?,seker_cugunduru=?,kartof=?,terevez=?,bostan=?,uzum=?,meyve=?,cay=?,diger=?,kend=?,ad_rayon=?,rayon=? WHERE id=?
            preparedStatement = connection.prepareStatement(MoaQueries.update);

            preparedStatement.setString(1,farmer.getsName());
            preparedStatement.setDouble(2,farmer.getArpa());
            preparedStatement.setDouble(3,farmer.getGargidali());
            preparedStatement.setDouble(4,farmer.getCemiHa());
            preparedStatement.setDouble(5,farmer.getGunBax());
            preparedStatement.setDouble(6,farmer.getPambiq());
            preparedStatement.setDouble(7,farmer.getSekCug());
            preparedStatement.setDouble(8,farmer.getKartof());
            preparedStatement.setDouble(9,farmer.getTerevez());
            preparedStatement.setDouble(10,farmer.getBostan());
            preparedStatement.setDouble(11,farmer.getUzum());
            preparedStatement.setDouble(12,farmer.getMeyve());
            preparedStatement.setDouble(13,farmer.getCay());
            preparedStatement.setDouble(14,farmer.getDiger());
            preparedStatement.setString(15,farmer.getKend());
            preparedStatement.setString(16,farmer.getAdRayon());
            preparedStatement.setDouble(17,farmer.getRayon());
            preparedStatement.setDouble(18,farmer.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DbConnection.closeConnection(connection, preparedStatement, null);
        }


        return farmer;
    }

    @Override
    public boolean removeFarmer(int id) {


        connection = DbConnection.getConnection();


        try {
            //DELETE farmer WHERE id=?
            preparedStatement = connection.prepareStatement(MoaQueries.delete);
            preparedStatement.setDouble(1,id);
            preparedStatement.executeUpdate();



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
          DbConnection.closeConnection(connection, preparedStatement, null);
        }

        return true;
    }

    @Override
    public Farmer findById(int id) {

        connection = DbConnection.getConnection();
        Farmer farmer =null;


        try {
            //SELECT * from farmer WHERE id=?
            preparedStatement = connection.prepareStatement(MoaQueries.findById);
            preparedStatement.setDouble(1,id);
            resultSet = preparedStatement.executeQuery();


            if (resultSet.next()){

                //s_name,arpa,gargidali,cemi_ha,gunebaxan,pambiq,seker_cugunduru,
                //            // kartof,terevez,bostan,uzum,meyve,cay,diger,kend,ad_rayon,rayon
                String sName= resultSet.getString("s_name");
                double arpa = resultSet.getDouble("arpa");
                double gargidali = resultSet.getDouble("gargidali");
                double cemiHa = resultSet.getDouble("cemi_ha");
                double gunebaxan = resultSet.getDouble("gunebaxan");
                double pambiq = resultSet.getDouble("pambiq");
                double sekCug = resultSet.getDouble("seker_cugunduru");
                double kartof = resultSet.getDouble("kartof");
                double terevez = resultSet.getDouble("terevez");
                double bostan = resultSet.getDouble("bostan");
                double uzum = resultSet.getDouble("uzum");
                double meyve = resultSet.getDouble("meyve");
                double cay = resultSet.getDouble("cay");
                double diger = resultSet.getDouble("diger");
                String kend = resultSet.getString("kend");
                String adRayon= resultSet.getString("ad_rayon");
                double rayon = resultSet.getDouble("rayon");

                farmer = new Farmer(sName,arpa,gargidali,cemiHa,gunebaxan,pambiq,sekCug,kartof,terevez,bostan,uzum,meyve,cay,diger,kend,adRayon,rayon);

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DbConnection.closeConnection(connection, preparedStatement, resultSet);
        }

        return farmer;
    }

    @Override
    public List<Farmer> findFarmers() {


        connection = DbConnection.getConnection();
        Farmer farmer =null;
        List<Farmer> farmerList = new ArrayList<>();


        try {

            preparedStatement = connection.prepareStatement(MoaQueries.findAll);
            resultSet = preparedStatement.executeQuery();


            if (resultSet.next()){

                String sName= resultSet.getString("s_name");
                double arpa = resultSet.getDouble("arpa");
                double gargidali = resultSet.getDouble("gargidali");
                double cemiHa = resultSet.getDouble("cemi_ha");
                double gunebaxan = resultSet.getDouble("gunebaxan");
                double pambiq = resultSet.getDouble("pambiq");
                double sekCug = resultSet.getDouble("seker_cugunduru");
                double kartof = resultSet.getDouble("kartof");
                double terevez = resultSet.getDouble("terevez");
                double bostan = resultSet.getDouble("bostan");
                double uzum = resultSet.getDouble("uzum");
                double meyve = resultSet.getDouble("meyve");
                double cay = resultSet.getDouble("cay");
                double diger = resultSet.getDouble("diger");
                String kend = resultSet.getString("kend");
                String adRayon= resultSet.getString("ad_rayon");
                double rayon = resultSet.getDouble("rayon");

                farmer = new Farmer(sName,arpa,gargidali,cemiHa,gunebaxan,pambiq,sekCug,kartof,terevez,bostan,uzum,meyve,cay,diger,kend,adRayon,rayon);
                farmerList.add(farmer);
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            DbConnection.closeConnection(connection, preparedStatement, resultSet);
        }


        return farmerList;
    }
}
