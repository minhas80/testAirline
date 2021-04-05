package application;
import javafx.beans.property.SimpleStringProperty;

public class Person {
private final SimpleStringProperty firstName;
private final SimpleStringProperty lastName;
private final SimpleStringProperty email;


 Person(String firstName, String lastName, String email) {
	this.firstName = new SimpleStringProperty(firstName);
	this.lastName = new SimpleStringProperty(lastName);
	this.email = new SimpleStringProperty(email);
	
}
public String firstNameProperty() {
	return firstName.get();
}
public String lastNameProperty() {
	return lastName.get();
}
public String emailProperty() {
	return email.get();
}
public String toString()
{
	return firstNameProperty()+lastNameProperty()+emailProperty();
}
}
