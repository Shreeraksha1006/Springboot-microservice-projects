package com.springcloud.organizationservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String organizationName;
    private String organizationDescription;
    private String organizationCode;
    @CreationTimestamp
    private LocalDateTime createdTime;


    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", organizationName='" + organizationName + '\'' +
                ", organizationDescription='" + organizationDescription + '\'' +
                ", organizationCode='" + organizationCode + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}
