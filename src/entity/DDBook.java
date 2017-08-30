package entity;

import java.io.Serializable;

public class DDBook implements Serializable {
    private Integer id;

    private String author;

    private String publishing;

    private Long publishTime;

    private String wordNumber;

    private String whichEdtion;

    private String totalPage;

    private Long printTime;

    private String isbn;

    private String authorSummary;

    private String catalogue;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing == null ? null : publishing.trim();
    }

    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public String getWordNumber() {
        return wordNumber;
    }

    public void setWordNumber(String wordNumber) {
        this.wordNumber = wordNumber == null ? null : wordNumber.trim();
    }

    public String getWhichEdtion() {
        return whichEdtion;
    }

    public void setWhichEdtion(String whichEdtion) {
        this.whichEdtion = whichEdtion == null ? null : whichEdtion.trim();
    }

    public String getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(String totalPage) {
        this.totalPage = totalPage == null ? null : totalPage.trim();
    }

    public Long getPrintTime() {
        return printTime;
    }

    public void setPrintTime(Long printTime) {
        this.printTime = printTime;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getAuthorSummary() {
        return authorSummary;
    }

    public void setAuthorSummary(String authorSummary) {
        this.authorSummary = authorSummary == null ? null : authorSummary.trim();
    }

    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue == null ? null : catalogue.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", author=").append(author);
        sb.append(", publishing=").append(publishing);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", wordNumber=").append(wordNumber);
        sb.append(", whichEdtion=").append(whichEdtion);
        sb.append(", totalPage=").append(totalPage);
        sb.append(", printTime=").append(printTime);
        sb.append(", isbn=").append(isbn);
        sb.append(", authorSummary=").append(authorSummary);
        sb.append(", catalogue=").append(catalogue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}