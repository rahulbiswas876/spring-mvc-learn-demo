package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String>{

	private String prefix;
	@Override
	public void initialize(CourseCode courseCode) {
		prefix = courseCode.value();
	}

	@Override
	public boolean isValid(String theCourseCode, ConstraintValidatorContext context) {
		boolean result;
		if(theCourseCode != null){
			result = theCourseCode.startsWith(prefix);
			return result;
		}else{
			result = true;
		}
		return result;
	}

}
