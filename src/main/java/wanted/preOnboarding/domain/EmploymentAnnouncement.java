package wanted.preOnboarding.domain;

import jakarta.persistence.*;

@Entity
public class EmploymentAnnouncement {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String employmentPosition;

    private int employmentCompensation;

    @Enumerated(EnumType.STRING)
    private TechnologyStack technologyStack;

    @ManyToOne @JoinColumn(name = "company_id")
    private Company company;
}
