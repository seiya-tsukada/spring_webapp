package my_app.webapp.dto;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ZipCodeDto {
	
	/** ステータス */
	int status;
	
	/** メッセージ */
	String message;
	
	/** 郵便番号情報リスト */
	List<ZipCodeDataDto> results = new ArrayList<>();

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ZipCodeDataDto> getResults() {

    // System.out.println(ToStringBuilder.reflectionToString(results.getPrefcode()));
    System.out.println("aaaaa");
    System.out.println(ToStringBuilder.reflectionToString(results));
		return results;
	}

	public void setResults(List<ZipCodeDataDto> results) {
		this.results = results;
	}

}