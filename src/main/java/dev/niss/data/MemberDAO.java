package dev.niss.data;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;

import dev.niss.App;
import dev.niss.models.hr.Member;
import dev.sol.db.DBParam;
import dev.sol.db.DBService;
import dev.sol.db.DBType;

public class MemberDAO {
    public static final String TABLE = "member";
    public static final DBService DB = App.DB_COOP;

    

    private static Member data(CachedRowSet crs) {
        try {
            Integer memberId = crs.getInt("memberID");
            String Fname = crs.getString("Fname");
            String Mname = crs.getString("Mname");
            String Lname = crs.getString("Lname");
            String DateofBirth = crs.getString("DateofBirth");
            String PlaceofBirth = crs.getString("PlaceofBirth");
            // CivilStatus Status = CivilStatus.values()[crs.getInt("Status")];
            int status = crs.getInt("Status");
            String CurrentAddress = crs.getString("CurrentAddress");
            String Occupation = crs.getString("Occupation");
            Integer Office = crs.getInt("OfficeID");
            double Salary = crs.getDouble("Salary");
            String Sourceofincome = crs.getString("SourceofIncome");
            String Nearestrelative = crs.getString("NearestRelative");
            String RelationShip = crs.getString("Relationship");
            String Dependent = crs.getString("Dependent");
            Integer Stockshare = crs.getInt("StockShare");
            long StockAmount = crs.getLong("StockAmount");
            Integer StockPaid = crs.getInt("StockPaid");
            long amountpaid = crs.getLong("AmountPaid");

            return new Member(memberId, Fname, Mname, Lname, DateofBirth, PlaceofBirth, status, CurrentAddress,
                    Occupation, Office, Salary, Sourceofincome, Nearestrelative, RelationShip, Dependent, Stockshare,
                    StockAmount, StockPaid, amountpaid);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static DBParam[] paramlist(Member member) {
        List<DBParam> paramlist = new LinkedList<>();
        paramlist.add(new DBParam(DBType.NUMERIC, "memberID", member.getMemberID()));
        paramlist.add(new DBParam(DBType.TEXT, "Fname", member.getFname()));
        paramlist.add(new DBParam(DBType.TEXT, "Lname", member.getLname()));
        paramlist.add(new DBParam(DBType.TEXT, "DateofBirth", member.getDateofBirth()));
        paramlist.add(new DBParam(DBType.TEXT, "PlaceofBirth", member.getPlaceofBirth()));
        paramlist.add(new DBParam(DBType.TEXT, "Status", member.getStatus()));
        paramlist.add(new DBParam(DBType.TEXT, "CurrentAddress", member.getCurrentAddress()));
        paramlist.add(new DBParam(DBType.TEXT, "Occupation", member.getOccupation()));
        paramlist.add(new DBParam(DBType.NUMERIC, "OfficeID", member.getOffice()));
        paramlist.add(new DBParam(DBType.MONEY, "Salary", member.getSalary()));
        paramlist.add(new DBParam(DBType.TEXT, "SourceofIncome", member.getSourceofincome()));
        paramlist.add(new DBParam(DBType.TEXT, "NearestRelative", member.getNearestRelative()));
        paramlist.add(new DBParam(DBType.TEXT, "Relationship", member.getRelationShip()));
        paramlist.add(new DBParam(DBType.TEXT, "Dependent", member.getDependent()));
        paramlist.add(new DBParam(DBType.NUMERIC, "StockShare", member.getStockshare()));
        paramlist.add(new DBParam(DBType.DECIMAL, "StockAmount", member.getStockAmount()));
        paramlist.add(new DBParam(DBType.NUMERIC, "StockPaid", member.getStockPaid()));
        paramlist.add(new DBParam(DBType.DECIMAL, "AmountPaid", member.getAmountPaid()));
        return paramlist.toArray(new DBParam[0]);
    }

    public static List<Member> getMemberList() {
        CachedRowSet crs = DB.select_all(TABLE);
        List<Member> list = new LinkedList<>();

        try {
            while (crs.next()) {
                Member member = data(crs);
                if (member != null)
                    list.add(member);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void insert(Member member) {
        DB.insert(TABLE, paramlist(member));
    }

    public static void delete(Member member) {
        DB.delete(TABLE, new DBParam(DBType.NUMERIC, "memberID", member.getMemberID()));
    }

}