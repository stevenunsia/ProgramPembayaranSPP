/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pembayaranapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/spp_smp_jakenan"; // Sesuaikan dengan database
                String user = "root"; // Username default XAMPP
                String pass = ""; // Kosong jika tidak ada password

                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi ke database berhasil!");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return conn;
    }

    public static void main(String[] args) {
        // Test koneksi
        Connection testConn = getConnection();
        if (testConn != null) {
            System.out.println("Test: Koneksi berhasil!");
        } else {
            System.out.println("Test: Koneksi gagal!");
        }
    }
}

