package com.tech.coolsprings.service;

import com.tech.coolsprings.model.CustomerData;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    public List<CustomerData> getAllData() throws IOException {
        List<CustomerData> customerDataList = new ArrayList<>();
        CustomerData customerData;
        String line="";
        BufferedReader bufferedReader;
        InputStream resource = new ClassPathResource("us-500.csv").getInputStream();
        bufferedReader = new BufferedReader(new InputStreamReader(resource));
        while ((line = bufferedReader.readLine()) != null) {
            customerData = new CustomerData();
            String []customer = line.replaceAll("\"","").split(",");
            if(!customer[0].equals("first_name")) {
                customerData.setFirstName(customer[0]);
                customerData.setLastName(customer[1]);
                customerData.setCompany(customer[2]);
                customerData.setAddress(customer[3]);
                customerData.setCity(customer[4]);
                customerData.setCounty(customer[5]);
                customerData.setState(customer[6]);
                customerData.setZip(customer[7]);
                customerData.setPhone1(customer[8]);
                customerData.setPhone2(customer[9]);
                customerData.setEmail(customer[10]);
                customerDataList.add(customerData);
            }
        }

        return customerDataList;

    }
}
