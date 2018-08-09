package io.zipcoder.tc_spring_poll_application.domain;

import javax.persistence.*;

@Entity
@Table(name = "button")
public class Button {
    @Id
    @Column(name = "mac")
    private Long mac;

    //@ManyToOne( fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Long userId;

    public Button(Long mac, Long userId, String activity) {
        this.mac = mac;
        this.userId = userId;
        this.activity = activity;
    }

    public Button() {
    }

    @Column(name = "ACTIVITY_ID")
    private String activity;

    public Long getMac() {
        return mac;
    }

    public void setMac(Long mac) {
        this.mac = mac;
    }

    public Long getUser() {
        return userId;
    }

    public void setUser(long user) {
        this.userId = user;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
