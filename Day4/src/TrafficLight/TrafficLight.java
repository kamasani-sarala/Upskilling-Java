package TrafficLight;

public class TrafficLight {

	enum TrafficLights{
		Red("Stop"),
		Green("Go"),
		Yellow("slow down and wait ");
		
		 private String value;

		private TrafficLights(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
		
		 
	}
	}

