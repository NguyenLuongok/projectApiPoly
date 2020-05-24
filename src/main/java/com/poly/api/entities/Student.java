package com.poly.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
/**
 * @author Tong Duy Hai on 05/24/2020.
 * @created 24/05/2020
 * @project PolyProjectApi
 */
@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    private int studentId;
    private String name;
    private String birthday;
    private Boolean sex;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nationId")
    private Nation nation;

    private Integer identityId;
    private String dateCreate;
    private String issuedBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schoolId")
    private School school;
    private String graduating;
    private String graduatingDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "specializedId")
    private Specialized specialized;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "facilityId")
    private Facility facility;

    private String email;
    private String address;
    private String postalAddress;
    private String parentsName;
    private String parentsPhoneNumberTow;
    private String studentPhoneNumberOne;
    private String studentPhoneNumberTow;
    private String parentsPhoneNumberOne;
    private String country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "districtId")
    private District district;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provinceId")
    private Province province;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trainingSystemId")
    private Trainingsystem trainingsystem;

    private Integer folderId;
    private String nameImageCardIdOne;
    private String nameImageCardIdTow;
    private String nameImageCertificateOfGraduation;
    private String nameImageCertificate;
    private String nameImagebirthCertificate;
    private String nameImageRegistrationForm;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private Set<Desiciondetail> desiciondetailSet = new HashSet<Desiciondetail>();

    public Student() {
    }
}
