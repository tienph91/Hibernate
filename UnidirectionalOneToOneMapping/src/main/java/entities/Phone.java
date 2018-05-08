package entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private PhoneDetail phoneDetail;

    public Phone() {
        super();
    }

    public Phone(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Phone(String name) {
        super();
        this.name = name;
    }

    public Phone(String name, PhoneDetail phoneDetail) {
        super();
        this.name = name;
        this.phoneDetail = phoneDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PhoneDetail getPhoneDetail() {
        return phoneDetail;
    }

    public void setPhoneDetail(PhoneDetail phoneDetail) {
        this.phoneDetail = phoneDetail;
    }

}
