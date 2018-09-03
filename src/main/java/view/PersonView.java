package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Person;

public class PersonView {
    private ObservableList<Person> personList = FXCollections.observableArrayList();

    public ObservableList<Person> getPersonList() {
        return personList;
    }

        public PersonView() {
            personList.add(new Person("Ann", "Beck", "27 Coral Av.", "", "", ""));
            personList.add(new Person("Beth", "Zack", "5698 Beauty St.", "", "", ""));
            personList.add(new Person("Chris", "Beck", "341 Tennis Lane", "", "", ""));
            personList.add(new Person("Danny", "Novak", "2 Main St.", "", "", ""));
            personList.add(new Person("Eve", "Collins-Beck", "55 Park Square", "", "", ""));
            personList.add(new Person("Frederic", "Kovalsky", "75 This St.", "", "", ""));
            personList.add(new Person("George", "Collins", "801 Great St.", "", "", ""));
            personList.add(new Person("Hans", "Zack", "38 Lavender Av.", "", "", ""));
        }

    }
