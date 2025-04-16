public class EarthVolumeCalculator {

    public static void main(String[] args) {
               double radiusKm = 6371;

               double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

               double kmToMiles = 0.621371;

               double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

               System.out.println(&quot;Volume of Earth in cubic kilometers (km³): &quot; + volumeKm3);
        System.out.println(&quot;Volume of Earth in cubic miles (miles³): &quot; + volumeMiles3);
    }
}