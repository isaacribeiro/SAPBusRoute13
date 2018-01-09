package self.study.pojo;

import java.time.LocalTime;

import javax.persistence.*;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int pickupSequence;
	private LocalTime pickupTime;
	
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
	public int getPickupSequence() {
		return pickupSequence;
	}
	public void setPickupSequence(int pickupSequence) {
		this.pickupSequence = pickupSequence;
	}
	public LocalTime getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(LocalTime pickupTime) {
		this.pickupTime = pickupTime;
	}
	
}
