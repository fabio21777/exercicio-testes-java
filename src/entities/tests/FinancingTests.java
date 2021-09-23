package entities.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import entities.factory.FinancingFactory;

public class FinancingTests {
	@Test
	public void financingConstructShoudCorrectInstanceWhenValidationData() {
		Financing financing = FinancingFactory.createFinancing(100000.0,2000.0,80);
		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}
	@Test
	public void financingConstructShoudIncorrectInstanceWhenValidationData() {
			Assertions.assertThrows(IllegalArgumentException.class,() -> 
			{
				FinancingFactory.createFinancing(100000.0,2000.0,20);
			}
		
		);
	}
	@Test
	public void financingSetTotalAmountShoudCorrectInstanceWhenValidationData() {
		Financing financing = FinancingFactory.createFinancing(100000.0,2000.0,80);
		financing.setTotalAmount(50000.0);
		Assertions.assertEquals(50000.0, financing.getTotalAmount());
	}
	@Test
	public void financingSetTotalAmountShoudIncorrectInstanceWhenValidationData() {
		Financing financing = FinancingFactory.createFinancing(100000.0,2000.0,80);
		Assertions.assertThrows(IllegalArgumentException.class,() -> 
			{
				financing.setTotalAmount(100000.1);
			}
	
		);
	}
	@Test
	public void financingSetIncomeShoudCorrectInstanceWhenValidationData() {
		Financing financing = FinancingFactory.createFinancing(100000.0,2000.0,80);
		financing.setIncome(2000.1);
		Assertions.assertEquals(2000.1, financing.getIncome());
	}
	@Test
	public void financingSetIncomeShoudIncorrectInstanceWhenValidationData() {
		Financing financing = FinancingFactory.createFinancing(100000.0,2000.0,80);
		Assertions.assertThrows(IllegalArgumentException.class,() -> 
			{
				financing.setIncome(1999.9);
			}

		);
		
	}
	@Test
	public void financingSetMonthsShoudCorrectInstanceWhenValidationData() {
		Financing financing = FinancingFactory.createFinancing(100000.0,2000.0,80);
		financing.setMonths(81);
		Assertions.assertEquals(81, financing.getMonths());
	}
	@Test
	public void financingSetMonthsShoudIncorrectInstanceWhenValidationData() {
		Financing financing = FinancingFactory.createFinancing(100000.0,2000.0,80);
		Assertions.assertThrows(IllegalArgumentException.class,() -> 
			{
				financing.setMonths(79);
			}

		);
		
	}
	@Test
	public void financingCalculateEntryShoudCorrectInstance() {
		Financing financing = FinancingFactory.createFinancing(100000.0,2000.0,80);
		Assertions.assertEquals(20000.0, financing.entry());
		
	}
	@Test
	public void financingCalculateQuotaShoudCorrectInstance() {
		Financing financing = FinancingFactory.createFinancing(100000.0,2000.0,80);
		Assertions.assertEquals(1000,00, financing.quota());
		
	}
	
}
