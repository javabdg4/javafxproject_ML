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
            personList.add(new Person("Ann", "Beck", "27 Coral Av.", "Seattle", "89 500", "22"));
            personList.add(new Person("Beth", "Zack", "5698 Beauty St.", "Old York", "90 070", "47"));
            personList.add(new Person("Chris", "Beck", "341 Tennis Lane", "Old York", "98 030", "87"));
            personList.add(new Person("Danny", "Novak", "2 Main St.", "Warsaw", "00 010", "89"));
            personList.add(new Person("Eve", "Collins-Beck", "55 Park Square", "Seattle", "89 500", "38"));
            personList.add(new Person("Frederic", "Kovalsky", "75 This St.", "Paris", "69 077", "09"));
            personList.add(new Person("George", "Collins", "801 Great St.", "Small Old York", "99 400", "18"));
            personList.add(new Person("Hans", "Zack", "38 Lavender Av.", "Old York", "98 020", "55"));
        }

    }
