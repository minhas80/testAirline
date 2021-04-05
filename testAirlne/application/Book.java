package application;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Created by Andy on 6/21/2016.
 */
public class Book {
    private IntegerProperty number;
    private StringProperty name;
    
  
    public Book(int number, String name) {
        this.number = new SimpleIntegerProperty(number);
        
    	this.name = new SimpleStringProperty(name);
        
      }

   

	public int getNumber() {
        return number.get();
    }

    public IntegerProperty numberProperty() {
        return number;
    }

    public void setNumber(int number) {
        this.number.set(number);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

   public String toString()
   {
	   return "";
   }
     }
