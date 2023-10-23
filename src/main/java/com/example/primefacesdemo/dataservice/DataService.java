package com.example.primefacesdemo.dataservice;


import org.springframework.stereotype.Service;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class DataService {

  public Map<Integer, Double> getLineChartData() {
      Map<Integer, Double> map = new LinkedHashMap<>();
      map.put(1, 52.20);
      map.put(2, 19.63);
      map.put(3, 593.01);
      map.put(4, 139.76);
      map.put(5, 300.4);
      map.put(6, 890.0);
      map.put(7, 139.76);
      map.put(8, 100.4);
      map.put(9, 30.0);
     return map;
  }
}