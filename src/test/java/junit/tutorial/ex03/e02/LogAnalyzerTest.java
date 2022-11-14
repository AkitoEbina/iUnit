package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doThrow;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) 
class LogAnalyzerTest {

	@Mock
	private LogLoader mockedLogLoader;
	
	@InjectMocks
	private LogAnalyzer logAnalyzer = new LogAnalyzer();

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

	@Test
	void test() throws Exception {
		//doThrow(RuntimeException.class).when(mock).someVoidMethod();
		//↑doThrow 構文
		doThrow(new IOException("入出力処理失敗")).when(mockedLogLoader).load("test");
		//
		AnalyzeException e = assertThrows(AnalyzeException.class,
				() -> logAnalyzer.analyze("test"));

		Throwable throwable = e.getCause();
		//instanceofでthrowableをThrowableからIOExceptionに
		assertTrue(throwable instanceof IOException);
		assertEquals("入出力処理失敗", throwable.getMessage());
	}

}
