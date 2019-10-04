package com.company.fi.academy;

    public class Person {
        String address;
        String city;
        String phoneNumber;

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

