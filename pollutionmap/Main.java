package pollutionmap;
//
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        System.out.println("Hello, World!");
//
//        System.out.println(Math.floorMod(-5, 360));
//
//        HeatMap map = new HeatMap(10);
//        for (int x = 0; x < 360; x += 30) {
//            for (int y = 0; y < 360; y += 30) {
//                map.setValueAt(x, y, 0.05F * PollutionApi.getPM25((x - 180) / 2F, y - 180));
//            }
//        }
//        map.setValueAt(10.0f, 10.0f, 1.0f);
//        map.setValueAt(180.0f, 10.0f, 1.0f);
//        map.setValueAt(270.0f, 80.0f, 1.0f);
//        map.setValueAt(400.0f, 270.0f, 1.0f);
//        map.asBlurred().exportPng();
//    }
//}