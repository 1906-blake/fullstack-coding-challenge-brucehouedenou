package com.grocerylist.repos;


@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "gro_item")



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private int groceryItemId;

	@Column(name = "item_name")
	private String groceryItemName;

	@ManyToOne
	@JoinColumn(name = "item_type")
	private GroceryType groceryItemType;

	@ManyToOne
	@JoinColumn(name = "list")
	private GroceryList groceryItemList;

}
