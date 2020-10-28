# itest-4-dummies

easy TTD 

Tijdens het testen

### Triple A
	- Arrange, Act, Assert
	- 4e A after. voor het opruimen
	
### 7 Naamgevingen van testen
	- MethodName_StateUnderTest_ExpectedBehavior
	- MethodName_ExpectedBehavior_StateUnderTest
	- test[Feature being tested]
	- Feature to be tested
	- Should_ExpectedBehavior_When_StateUnderTest
	- When_StateUnderTest_Expect_ExpectedBehavior
	- Given_Preconditions_When_StateUnderTest_Then_ExpectedBehavior

	- MethodName_ExpectedBehavior_StateUnderTest * gekozen
	voorbeelden:
		- isAdult_False_AgeLessThan18
		- withdrawMoney_ThrowsException_IfAccountIsInvalid
		- admitStudent_FailToAdmit_IfMandatoryFieldsAreMissing


HAMCREST
 - Matchers. match = true
	matcher = (result, assertFunc(expected))
	
assertFunc = is(), not() instanceOf etc.

        int result = 5;
        assertThat(result, is(5));
        assertThat(result, equalTo(5));
		// assertThat(result, not(5));
        assertThat(result, isA(Integer.class));

### jUnit 5 error handeling.

Assertions.assertThrows(Exception.class, () -> {
	// Act
});

### Tags inplaats van suites
@Tag("name")

### Imports voor het testen
- imports
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.junit.MatcherAssert.assertThat;

## UML
![alt text](https://i.gyazo.com/8ff56db02b44735e37e880321866e32c.png)
