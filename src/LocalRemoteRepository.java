
public class LocalRemoteRepository {

	public static void main(String[] args) {
		int weatherDegree1 = 30;
		int weatherDegree2 = 50;
		float sum = weatherDegree1 + weatherDegree2;
		
		String weatherCondition = "Merry Christmas and Happy new year";
		String unit = "Degrees";

		if (weatherDegree1 == weatherDegree2) 
		{
			System.out.println("its raining today: " + " " + weatherDegree1 + unit);
		} else if (weatherDegree1 > weatherDegree2)
		{
			System.out.println("its not raining: " + " " + weatherDegree2 + unit);
		}
		else
		{
			System.out.println(weatherCondition);
			System.out.println(sum);
		}
		
	}

}
