package assignment04;

public class Person2 implements ApptsForMonth {
	private String name;
	public Person2(String name) {
		this.name = name;
	}
	@Override
	public String getDescription() {
		return "none";
	}
	@Override
	public double getPrice() {
		return 0;
	}
	@Override
	public int getDayOfMonth() {
		return 0;
	}
	@Override
	public int getTimeSlot() {
		return 0;
	}
	@Override
	public double getTotalPayments() {
		return 0;
	}
	@Override
	public void printAppointments() {
		System.out.println("Appointments for " + name + ":");
		
	}
	@Override
	public void printAppointments(int day) {
		System.out.println("Appointments for " + name + " On Day " + day + ":");
	}
	@Override
	public int dayTimeCount(int day, int slot) {
		return 0;
	}
	@Override
	public String timeConlict() {
		return "no (other) conflicts";
	}
}
