package com.lsautomacao.dslist.projections;
//usado para native query
public interface GameMinProjection {
	
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String GetShortDescription();
	Integer getPosition();
	String getShortDescription();
}
