package com.example;

class StudentTrialAttempts {
	int firstAttemptGrade;
	int secondAttemptGrade;

	StudentTrialAttempts(int firstAttemptGrade, int secondAttemptGrade) {
		this.firstAttemptGrade = firstAttemptGrade;
		this.secondAttemptGrade = secondAttemptGrade;
	}

}

public class StudentCloneUsingDeepCopy implements Cloneable {
	StudentTrialAttempts studentTialAttempts;
	int finalGrade;

	StudentCloneUsingDeepCopy(int finalGrade, StudentTrialAttempts studentTialAttempts) {
		this.finalGrade = finalGrade;
		this.studentTialAttempts = studentTialAttempts;

	}

	public Object clone() throws CloneNotSupportedException {
		return new StudentCloneUsingDeepCopy(this.finalGrade, new StudentTrialAttempts(this.studentTialAttempts.firstAttemptGrade, this.studentTialAttempts.firstAttemptGrade));
	}

	public static void main(String[] args) {

		StudentCloneUsingDeepCopy student = new StudentCloneUsingDeepCopy(95, new StudentTrialAttempts(98, 98));
		StudentCloneUsingDeepCopy deepClonedCopyStudent = null;

		try {
			deepClonedCopyStudent = (StudentCloneUsingDeepCopy) student.clone();

		} catch (CloneNotSupportedException e) {
			System.out.println("Exception.." + e.getMessage());
		}
		System.out.println("firstAttemptGrade of student1.." + student.studentTialAttempts.firstAttemptGrade);
		System.out.println("firstAttemptGrade of cloned copy.." + deepClonedCopyStudent.studentTialAttempts.firstAttemptGrade);

		student.studentTialAttempts.firstAttemptGrade = 99;
		System.out.println("After modification, firstAttemptGrade of student1.." + student.studentTialAttempts.firstAttemptGrade);
		System.out.println("After modification, firstAttemptGrade of cloned copy.." + deepClonedCopyStudent.studentTialAttempts.firstAttemptGrade);
	}

}
