
public class MegaBytesConverter {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes = kiloBytes/1024;
        int remainKilo = kiloBytes % 1024;
        System.out.println(kiloBytes + "KB = " + megabytes + "MB and " + remainKilo + "KB");
        if (kiloBytes < 1000) {
            System.out.println("Invalid value");
        }
    }

}
