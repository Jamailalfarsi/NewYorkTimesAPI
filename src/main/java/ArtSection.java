
public class ArtSection {

	private String status;
	private String copyright;
	private String section;
	private String  last_updated;
	private String  num_results;
	Results[] results;
	Response response;
	
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
	public String getNum_results() {
		return num_results;
	}
	public void setNum_results(String num_results) {
		this.num_results = num_results;
	}
	public Results[] getResults() {
		return results;
	}
	public void setResults(Results[] results) {
		this.results = results;
	}
	
	

}
