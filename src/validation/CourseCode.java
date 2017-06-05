package validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy={CourseCodeValidator.class})
@Target( value={ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	public String value() default "LUV";
	
	public String message() default "must start with LUV";
	
	Class<?>[] groups() default {};
	
    Class<? extends Payload>[] payload() default {};
}
