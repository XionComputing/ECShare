/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecshare;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
/**
 *
 * @author B00Z
 */
public class ECShare {
    private static final String osName = System.getProperty("os.name");
    private static final String dataModel = System.getProperty("sun.arch.data.model");
    private static final String vmVersion = System.getProperty("java.vm.version");
    private static final String osArch = System.getProperty("os.arch");
    private static final String userDir = System.getProperty("user.dir");
    private static final String userName = System.getProperty("user.name");
    private static final String sunCpu = System.getProperty("sun.cpu.endian");
    private static final String userLang = System.getProperty("user.language");
    private static final String extDir = System.getProperty("java.ext.dirs");
    private static final String userCountry = System.getProperty("user.country");
    private static final String vmName = System.getProperty("java.vm.name");
    private static final String fileEncoding = System.getProperty("file.encoding");
    private static final String sunOs = System.getProperty("sun.os.patch.level");
   
    public static void main(String[] args) {
         InetAddress ip;
        System.out.println("osName =" + osName);
        System.out.println("dataModel =" + dataModel);
        System.out.println("vmVersion =" + vmVersion);
        System.out.println("osArch =" + osArch);
        System.out.println("userDir =" + userDir);
        System.out.println("sunCpu =" + sunCpu);
        System.out.println("userLang =" + userLang);
        System.out.println("userCountry =" + userCountry);
        System.out.println("vmName =" + vmName);
        System.out.println("fileEncoding =" + fileEncoding);
        System.out.println("sunOs =" + sunOs);

         try {

        ip = InetAddress.getLocalHost();
        System.out.println("Current IP address : " + ip.getHostAddress());

        NetworkInterface network = NetworkInterface.getByInetAddress(ip);

        byte[] mac = network.getHardwareAddress();

        System.out.print("Current MAC address : ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));        
        }
        System.out.println(sb.toString());

    } catch (UnknownHostException e) {

        e.printStackTrace();

    } catch (SocketException e){

        e.printStackTrace();

    }

    }
    
}
