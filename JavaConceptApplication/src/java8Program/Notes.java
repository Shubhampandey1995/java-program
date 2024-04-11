package java8Program;

public class Notes {
	
	 Integer id ;
	 String TagName ;
	 Integer tagValue;
	
	 public Notes(Integer id, String tagName, Integer tagValue) {
		super();
		this.id = id;
		TagName = tagName;
		this.tagValue = tagValue;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTagName() {
		return TagName;
	}

	public void setTagName(String tagName) {
		TagName = tagName;
	}

	public Integer getTagValue() {
		return tagValue;
	}

	public void setTagValue(Integer tagValue) {
		this.tagValue = tagValue;
	}

	@Override
	public String toString() {
		return "Notes [id=" + id + ", TagName=" + TagName + ", tagValue=" + tagValue + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((TagName == null) ? 0 : TagName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tagValue == null) ? 0 : tagValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notes other = (Notes) obj;
		if (TagName == null) {
			if (other.TagName != null)
				return false;
		} else if (!TagName.equals(other.TagName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tagValue == null) {
			if (other.tagValue != null)
				return false;
		} else if (!tagValue.equals(other.tagValue))
			return false;
		return true;
	}
	
	
	 
}
