package org.jboss.demo;

import javax.persistence.*;

@Entity
@Table(name = "smsrecord")
public class SMSRecord {
    @Id // @Id indicates that this it a unique primary key
    @GeneratedValue // @GeneratedValue indicates that value is automatically generated by the server
    private Long id;

    @Column
    private Long processInstanceId;

    @Column
    private String userName;

    public SMSRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(Long processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "SMSRecord{" +
                "id=" + id +
                ", processInstanceId=" + processInstanceId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
