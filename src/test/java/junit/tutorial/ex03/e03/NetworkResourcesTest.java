package junit.tutorial.ex03.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.io.ByteArrayInputStream;

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
class NetworkResourcesTest {

	@Mock
	private NetworkLoader networkLoader;

	@InjectMocks
	private NetworkResources networkResources = new NetworkResources();

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
		String e = "Hello World";
		
		ByteArrayInputStream input = new ByteArrayInputStream(e.getBytes());
		//doReturn("戻り値").when(Class).getStr(str.capture());
		doReturn(input).when(networkLoader).getInput();
		
		assertEquals(e, networkResources.load());

	}

}
