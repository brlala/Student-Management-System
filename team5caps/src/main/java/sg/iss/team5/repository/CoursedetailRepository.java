package sg.iss.team5.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.iss.team5.model.ChartData;
import sg.iss.team5.model.Coursedetail;
import sg.iss.team5.model.Studentcourse;

public interface CoursedetailRepository extends JpaRepository<Coursedetail, String> {

//	@Query(value = "select * from Coursedetails c", nativeQuery = true)
//	ArrayList<Coursedetail> findAllCoursedetail();
	
	//select sc.moduleid,count (sc.studentid) from studentcourse sc group by sc.moduleid where sc.moduleid like '%A0006' and year(sc.enrolltime)=YEAR(CURDATE())
	@Query(value= "select * from studentcourse sc where sc.moduleid like %:courseid and year (sc.enrolltime) = YEAR(CURDATE())",nativeQuery=true)
	ArrayList<Object> getCurrentEnrolledCapacity(@Param("courseid") String courseId);
	
	@Query(value="select * from coursedetails where courseid = :cid", nativeQuery = true)
	Coursedetail findCoursesById(@Param("cid") String cid);
}
