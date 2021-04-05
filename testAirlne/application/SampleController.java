package application;

import javafx.collections.FXCollections;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;



import java.net.URL;

import java.util.ResourceBundle;

public class SampleController implements Initializable{
   
    private ObservableList<Book> bookData;

    @FXML
    private TableView<Book> tv;
    @FXML
    private TableColumn<Book, Integer> first;
    @FXML
    private TableColumn<Book, String> second;
    
    
   
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
    
        bookData = FXCollections.observableArrayList(new Book(44,"gg"));
    
        first.setCellValueFactory(cellData -> cellData.getValue().numberProperty().asObject());
        second.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        
        bookData.add(new Book(22,"ddd"));
       tv.setItems(bookData);
    	
       
       
        
    }

    
}