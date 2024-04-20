package day08.final_.quiz1;

public enum WeatherConstants {
   MAX_TEMPERATURE_ALERT(40.0),
   MIN_TEMPERATURE_ALERT(-10.0),
   PRECIPITATION_ALERT(50.0);

   private double numericData;

   WeatherConstants(double numericData) {
      this.numericData = numericData;
   }

   public double getNumericData() {
      return numericData;
   }


}

//public class WeatherConstants {
//
//   public static final double MAX_TEMPERATURE_ALERT = 40.0;
//   public static final double MIN_TEMPERATURE_ALERT = -10.0;
//   public static final double PRECIPITATION_ALERT = 50.0;
//
//   private WeatherConstants() {} // 객체 생성 방지
//}