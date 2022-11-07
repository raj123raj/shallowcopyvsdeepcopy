package com.example;

class StudentTrials {
	int firstAttemptGrade;
	int secondAttemptGrade;

	StudentTrials(int firstAttemptGrade, int secondAttemptGrade) {
		this.firstAttemptGrade = firstAttemptGrade;
		this.secondAttemptGrade = secondAttemptGrade;
	}

}

public class StudentCloneUsingShallowCopy implements Cloneable {
	StudentTrials studentTialAttempts;
	int finalGrade;

	StudentCloneUsingShallowCopy(int finalGrade, StudentTrials studentTialAttempts) {
		this.finalGrade = finalGrade;
		this.studentTialAttempts = studentTialAttempts;

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {

		StudentCloneUsingShallowCopy student = new StudentCloneUsingShallowCopy(95, new StudentTrials(98, 98));
		StudentCloneUsingShallowCopy shallowClonedCopyStudent = null;

		try {
			shallowClonedCopyStudent = (StudentCloneUsingShallowCopy) student.clone();

		} catch (CloneNotSupportedException e) {
			System.out.println("Exception.." + e.getMessage());
		}
		System.out.println("firstAttemptGrade of student1.." + student.studentTialAttempts.firstAttemptGrade);
		System.out.println("firstAttemptGrade of cloned copy.." + shallowClonedCopyStudent.studentTialAttempts.firstAttemptGrade);

		student.studentTialAttempts.firstAttemptGrade = 99;
		System.out.println("After modification, firstAttemptGrade of student1.." + student.studentTialAttempts.firstAttemptGrade);
		System.out.println("After modification, firstAttemptGrade of cloned copy.." + shallowClonedCopyStudent.studentTialAttempts.firstAttemptGrade);
	}

}
