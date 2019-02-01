package datapipeline.costomer_etl.dataWriter;

public interface DataWriter<T> {
 public  void  writeData(String outputPath,T[] dataList);
}
