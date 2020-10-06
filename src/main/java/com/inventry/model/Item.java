package com.inventry.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item")
public class Item {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String itemName;
	private String description;
 	private String date;
 	
 	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "item_fkd",referencedColumnName = "id")
	List<Brand> brand;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "cat_fkd",referencedColumnName = "id")
	List<ItemCategory> itemCategory;


	
	
}
