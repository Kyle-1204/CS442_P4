package assignment04;

public class ThermostatRemote {
	private Thermostat stat;
	public ThermostatRemote(Thermostat statIn) {
		stat = statIn;
		// TODO
		// make calls to stat.cooler() to set the temperature to the minimum
		// notice the test driver raises the temp before connecting the remote.
		while (stat.getTemperature() != 50){
			stat.cooler();
		}
	}

	public void setTemperature(int newTemp){
		// TODO
		// write this method using multiple calls to stat.warmer() or
		// stat.cooler() as appropriate
		while (stat.getTemperature() != newTemp){
			if (stat.getTemperature() < newTemp){
				stat.warmer();
			}
			if (stat.getTemperature() > newTemp){
				stat.cooler();
			}
			if (stat.getTemperature() == 50 || stat.getTemperature() == 90) break;
		}

	}
}

