package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PhoneDetail {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "Provider")
    private String provider;

    @Column(name = "Fair")
    private long fair;

    public PhoneDetail(int id, String provider, long fair) {
        super();
        this.id = id;
        this.provider = provider;
        this.fair = fair;
    }

    public PhoneDetail() {
        super();
    }

    public PhoneDetail(String provider, long fair) {
        super();
        this.provider = provider;
        this.fair = fair;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public long getFair() {
        return fair;
    }

    public void setFair(long fair) {
        this.fair = fair;
    }

}
