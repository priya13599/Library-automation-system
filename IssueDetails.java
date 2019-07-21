package Bean;

import java.util.Date;

public class IssueDetails {

	
	private String StudentId;
	private String StudentName;
	private String Branch;
	private String Section;
	private String Email;
	private String Rollno;
	private String Bookno;
	private String BookName;
	private Date IssueDate;
	private Date DueDate;
	
	public IssueDetails(String studentId, String studentName, String branch, String section, String email,
			String rollno, String bookno, String bookName, Date issueDate, Date dueDate) {
		super();
		this.StudentId = studentId;
		this.StudentName = studentName;
		this.Branch = branch;
		this.Section = section;
		this.Email = email;
		this.Rollno = rollno;
		this.Bookno = bookno;
		this.BookName = bookName;
		this.IssueDate = issueDate;
		this.DueDate = dueDate;
	}

	public String getStudentId() {
		return StudentId;
	}

	public void setStudentId(String studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getRollno() {
		return Rollno;
	}

	public void setRollno(String rollno) {
		Rollno = rollno;
	}

	public String getBookno() {
		return Bookno;
	}

	public void setBookno(String bookno) {
		Bookno = bookno;
	}

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public Date getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(Date issueDate) {
		IssueDate = issueDate;
	}

	public Date getDueDate() {
		return DueDate;
	}

	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}

	@Override
	public String toString() {
		return "IssueDetails [StudentId=" + StudentId + ", StudentName=" + StudentName + ", Branch=" + Branch
				+ ", Section=" + Section + ", Email=" + Email + ", Rollno=" + Rollno + ", Bookno=" + Bookno
				+ ", BookName=" + BookName + ", IssueDate=" + IssueDate + ", DueDate=" + DueDate + "]";
	}
	
	
	
	
}
