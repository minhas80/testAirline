package application;

import javafx.beans.property.SimpleStringProperty;

public class Flight {
	private final SimpleStringProperty airline;
	private final SimpleStringProperty numr;
public Flight(String airline, String numr) {
	this.airline = new SimpleStringProperty(airline);
	this.numr = new SimpleStringProperty(numr);
	
	
}
public String getAirline() {
	return airline.get();
}
public String getNumr() {
	return numr.get();
}
public String toString()
{
	return airline+"with number "+numr;
}
}
