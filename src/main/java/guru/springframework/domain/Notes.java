package guru.springframework.domain;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;


/**
 * Created by jt on 6/13/17.
 */

public class Notes {

	@Id
    private String id;
    private String recipeNotes;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getRecipeNotes() {
		return recipeNotes;
	}
	public void setRecipeNotes(String recipeNotes) {
		this.recipeNotes = recipeNotes;
	}

}
