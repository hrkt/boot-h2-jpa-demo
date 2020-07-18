package info.beambitious.sandbox.booth2jpademo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`POSTAL_CODES`")
@Data
public class PostalCodeInfo {
    @Id
    private long id;
    private String code7;
    private String address1;
    private String address2;
    private String address3;
}
