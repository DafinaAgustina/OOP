/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author LENOVO
 */
public class studikasusCRUD {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/restoran";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());

            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insertmenu_makanan();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updatemenu_makanan();
                    break;
                case 4:
                    deletemenu_makanan();
                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showData() {
        String sql = "SELECT * FROM menu_makanan";

        try {
            rs = stmt.executeQuery(sql);
            
            System.out.println("+--------------------------------+");
            System.out.println("|    DATA MENU DI RESTORAN  |");
            System.out.println("+--------------------------------+");

            while (rs.next()) {
                int kode_menu = rs.getInt("kode_menu");
                String jenis_makanan = rs.getString("jenis_makanan");
                String jenis_minuman = rs.getString("jenis_minuman");
                String total = rs.getString("total");
                 String nama_kasir = rs.getString("nama_kasir");
                
                System.out.println(String.format("%d. %s -- (%s)(%s)(%s)", kode_menu, jenis_makanan, jenis_minuman,total,nama_kasir));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void insertmenu_makanan() {
        try {
            // ambil input dari user
            System.out.print("kode_menu: ");
            int kode_menu =Integer.parseInt(input.readLine());
            System.out.print("jenis_makanan: ");
            String jenis_makanan = input.readLine().trim();
            System.out.print("jenis_minuman: ");
            String jenis_minuman = input.readLine().trim();
            System.out.print("total: ");
            String total = input.readLine().trim();
            System.out.print("nama_kasir: ");
            String nama_kasir = input.readLine().trim();
 
            // query simpan
            String sql = "INSERT INTO menu_makanan (kode_menu,jenis_makanan, jenis_minuman, total,nama_kasir) VALUE('%d','%s','%s','%s','%s')";
            sql = String.format(sql,kode_menu, jenis_makanan, jenis_minuman,total,nama_kasir);

            // simpan menu makanan
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void updatemenu_makanan() {
        try {
            
            // ambil input dari user
            System.out.print("kode_menu : ");
            int kode_menu = Integer.parseInt(input.readLine());
            System.out.print("Jenis_Makanan: ");
            String  jenis_makanan= input.readLine().trim();
            System.out.print("Jenis_minuman: ");
            String jenis_minuman = input.readLine().trim();
            System.out.print("Total: ");
            String total = input.readLine().trim();
             System.out.print("nama_kasir: ");
            String nama_kasir = input.readLine().trim();

            // query update
            String sql = "UPDATE menu_makanan SET jenis_makanan='%s',jenis_minuman='%s',total='%s',nama_kasir='%s' WHERE kode_menu=%d";
            sql = String.format(sql, jenis_makanan, jenis_minuman,total,nama_kasir, kode_menu);

            // update data menu makanan
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deletemenu_makanan() {
        try {
            
            // ambil input dari user
            System.out.print("Kode_menu: ");
            int kode_menu = Integer.parseInt(input.readLine());
            
            // buat query hapus
            String sql = String.format("DELETE FROM menu_makanan WHERE kode_menu=%d", kode_menu);

            // hapus data
            stmt.execute(sql);
            
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
