package pro.buildmysoftware.ee.ejb;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorEjbTest {

	private static EJBContainer container;
	@EJB
	private CalculatorEjbParser parser;

	@BeforeAll
	static void beforeClass() {
		container = EJBContainer.createEJBContainer();
	}

	@BeforeEach
	void beforeEach() throws Exception {
		container.getContext().bind("inject", this);
	}

	@DisplayName("should calculate sum using EJB parser")
	@Test
	void test0() throws Exception {
		// when
		int sum = parser.calculate("5 10");

		// then
		assertThat(sum).isEqualTo(15);
	}
}
