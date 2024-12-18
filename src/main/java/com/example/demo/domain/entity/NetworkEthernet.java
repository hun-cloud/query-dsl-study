package com.example.demo.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class NetworkEthernet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cid;
    private String name;
    private String desc;
    private Boolean enable;
    private int mtu;
    private int mss;
    private String zone;
    private String mode;
    private String duplex;
    private String speed;
    private Boolean multipath;
    private String ipv4;
    private String ipv6;
}
