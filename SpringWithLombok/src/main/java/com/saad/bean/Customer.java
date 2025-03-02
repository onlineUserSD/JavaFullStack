package com.saad.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component(value="cs")
public class Customer {
@Value("C1")
private String pid;
@Value("RUPAM")
private String cname;
@Value("548664")
private String cphno;

}
