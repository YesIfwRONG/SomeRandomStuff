package com.example.guilessonnum2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    public TextField textFieldFirstName;
    public TextField textFieldLastName;
    public TextField textFieldAge;
    public TextField textFieldJob;
    public ListView<Friend>listFriendList;
    public Label labelName;
    public Label labelAge;
    public Label labelJob;

    public void addFriend(){
        String firstName = textFieldFirstName.getText();
        String lastName = textFieldLastName.getText();
        int age = Integer.parseInt(textFieldAge.getText());
        String job = textFieldJob.getText();
        listFriendList.getItems().add(new Friend(firstName,lastName,age,job));
    }

    public void displayFriend() {
        Friend f = listFriendList.getSelectionModel().getSelectedItem();
        labelName.setText(f.getName());
        labelAge.setText(f.getAge()+"");
        labelJob.setText(f.getJob());
    }
}