package com.company.fi.academy;


    public class Person {
        String address;
        String city;
        String phoneNumber;
        int age;
        String name;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person() {

        }

        public Person(String address, String city, String phoneNumber) {
            this.address = address;
            this.city = city;
            this.phoneNumber = phoneNumber;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "address='" + address + '\'' +
                    ", city='" + city + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    }





    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setAge(int age) {
        this.name = name;
    }

    public int getAge(int age) {
        return this.name;
    }

    public String toString() {
    }

}

