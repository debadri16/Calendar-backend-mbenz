package com.example.calendar.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plans")
public class Plan {
    @Id
	@GeneratedValue()
	@Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="date")
    private Long date;

    @Column(name="starttimestamp")
    private Long starttimestamp;

    @Column(name="endtimestamp")
    private Long endtimestamp;

    @Column(name="frequency")
    private String frequency;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public Long getStarttimestamp() {
		return starttimestamp;
	}

	public void setStarttimestamp(Long starttimestamp) {
		this.starttimestamp = starttimestamp;
	}

    public Long getEndtimestamp() {
		return endtimestamp;
	}

	public void setEndtimestamp(Long endtimestamp) {
		this.endtimestamp = endtimestamp;
	}

    public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

    public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

}
