package datapipeline.costomer_etl.driver;

import datapipeline.costomer_etl.dataReader.DataReader;
import datapipeline.costomer_etl.dataReader.DataReaderFactory;
import datapipeline.costomer_etl.model.Customer;
import datapipeline.costomer_etl.model.DatapipeLineConfig;

public class Driver {
	DatapipeLineConfig datapipeLineConfig = null;
	DataReaderFactory<Customer[]> dataReaderFactory = new DataReaderFactory<Customer[]>();
	
	
	
	public Customer[] readData(){
		DataReader<Customer[]> reader = null;
		reader=dataReaderFactory.getdataReader(datapipeLineConfig.getInputDataType());
		Customer[] customerList = reader.readData(datapipeLineConfig.getInputDataPath(),Customer[].class );
		return customerList;
	}
}


