import `object`.Grades
import `object`.Students
import junit.framework.Assert.assertEquals
import model.*
import objects.*
import org.jetbrains.annotations.TestOnly
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction
import org.junit.Test


class MainTest {

    fun init() {
        Type.new {
            name = "Lecture"
            shortName = "Lec"
        }
        Type.new {
            name = "Laboratory"
            shortName = "Lab"
        }
        Type.new {
            name = "Test"
            shortName = "Tst"
        }
         Tutor.new {
            name = "Sheldon"
            post = "Professor"
        }
         Tutor.new {
            name = "Leonard"
            post = "Professor"
        }
         Student.new {
            name = "Howard"
            group = "Footprint on the Moon"
        }
         Student.new {
            name = "Raj"
            group = "Footprint on the Moon"
        }
         Student.new {
            name = "Penny"
            group = "Waitress"
        }
         Course.new {
            name = "Math"
        }
        Course.new {
            name = "Phis"
        }
    }

        @Test
      /*  fun initTest() {
            Database.connect(
                    "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1",
                    driver = "org.h2.Driver"
            )
            transaction {
                SchemaUtils.create(Courses, Grades,Ratings,Students,Tasks,Tutors,Types)
                init()
                //val student = Student.find { Students.name eq "Howard" }
                val student = Student.findById(0)
                assertEquals("Howard", student?.name)
            }

        }*/
        fun setGradeTest() {
            Database.connect(
                    "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1",
                    driver = "org.h2.Driver"
            )
            transaction {
                SchemaUtils.create(Courses, CourseStudents,CourseTutors,Grades,Ratings,Students,Tasks,Tutors,Types)
                init()
            }

        }

}
