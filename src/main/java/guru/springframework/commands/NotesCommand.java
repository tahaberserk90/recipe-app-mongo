package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by jt on 6/21/17.
 */

@NoArgsConstructor
public class NotesCommand {
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
	private String id;
    private String recipeNotes;

}
