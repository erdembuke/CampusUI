package StepDefinitions;

import Pages.DialogContents;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CalendarCourses {

    DialogContents dc = new DialogContents();

    static int countFizikCourseTeach;
    static int countFizikCourseStud;
    static int countFileIconTeach;
    static int countFileIconStud;


    @Then("Count of Fizik courses on the teacher's Calendar")
    public void countOfFizikCoursesOnTheTeacherSCalendar() {

        countFizikCourseTeach = dc.courseFizikCount.size();

    }

    @Then("Count of Fizik courses on the student's Calendar")
    public void countOfFizikCoursesOnTheStudentSCalendar() {

        countFizikCourseStud = dc.courseFizikCount.size();

    }

    @Then("Verify count of the courses the teacher and the student")
    public void verifyCountOfTheCoursesTheTeacherAndTheStudent() {

//        System.out.println("countFizikCourseTeach = " + countFizikCourseTeach);
//        System.out.println("countFizikCourseStud = " + countFizikCourseStud);
        Assert.assertEquals(countFizikCourseTeach, countFizikCourseStud, "Test Failed");

    }

    @Then("Count of files attachment on the teacher's Course Meeting")
    public void countOfFilesAttachmentOnTheTeacherSCourseMeeting() {

        countFileIconTeach = dc.filesIconTeach.size();
    }

    @Then("Count of files attachment on the student's Course Meeting")
    public void countOfFilesAttachmentOnTheStudentSCourseMeeting() {

        countFileIconStud = dc.filesIconStud.size();
    }

    @Then("Verify count of the attachment files the teacher and the student")
    public void verifyCountOfTheAttachmentFilesTheTeacherAndTheStudent() {

//        System.out.println("countFileIconTeach = " + countFileIconTeach);
//        System.out.println("countFileIconStud = " + countFileIconStud);
        Assert.assertEquals(countFileIconTeach, countFileIconStud, "Test Failed");
    }

    @Then("Verify the download button clickable")
    public void verifyTheDownloadButtonClickable() {
        dc.waitUntilClickable(dc.downloadButton);
        Assert.assertTrue(dc.downloadButton.isEnabled());
    }
}
