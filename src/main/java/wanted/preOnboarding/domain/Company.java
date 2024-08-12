package wanted.preOnboarding.domain;

import jakarta.persistence.*;

@Entity
public class Company {

    @Id @GeneratedValue
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Nation nation;

    @Enumerated(EnumType.STRING)
    private Location location;

}
