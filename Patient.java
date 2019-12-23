import java.util.*;
import java.lang.*;
import java.io.*;
class Patient
{
String name;
double height,weight;
 Patient(double h,double w)
{
weight =w;
height=h;
}

double bmi()
{
  return ((weight/(height*height))*703);
}
}

class Patients
{
public static void main(String[] args)
{
  Patient p=new Patient(168,72);

System.out.println("Body mass index is  "+p.bmi());
}}