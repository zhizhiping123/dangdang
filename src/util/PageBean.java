package util;

public class PageBean {
	
	private int currentPage;
	public static int perPageNum=3;
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

}
