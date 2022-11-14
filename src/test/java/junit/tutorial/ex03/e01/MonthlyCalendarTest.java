package junit.tutorial.ex03.e01;


import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;



class MonthlyCalendarTest {

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@ParameterizedTest
	@CsvSource({
		
	})
	void getRemainingDays(LocalDate nowDate) {
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar();
		static Stream<monthlyCalender> japaneseDateProvider() {
		    return Stream.of(
		        arguments(JapaneseDate.of(1989, 1, 7), "昭和"),
		        arguments(JapaneseDate.of(1989, 1, 8), "平成"),
		        arguments(JapaneseDate.of(2019, 4, 30), "平成"),
		        arguments(JapaneseDate.of(2019, 5, 1), "令和")
		    );
		
	}

}
