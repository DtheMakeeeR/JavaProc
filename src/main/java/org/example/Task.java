package org.example;

public class Task {
    public Instructions instruction;
    public int address1 = -1;
    public int address2 = -1;
    public int address3 = -1;
    public Task(Instructions ins){
        instruction = ins;
    }
    public Task(Instructions ins, int _addr1, int _addr2){
        address1 = _addr1;
        address2 = _addr2;
        instruction = ins;
    }
    public Task(Instructions ins, int _addr1, int _addr2, int _addr3){
        address1 = _addr1;
        address2 = _addr2;
        address3 = _addr3;
        instruction = ins;
    }

    public Instructions getIns() {
        return instruction;
    }

    public int getAddress1() {
        return address1;
    }

    public int getAddress2() {
        return address2;
    }

    public int getAddress3() {
        return address3;
    }
    @Override
    public String toString() {
        return  instruction +
                " " + (address1 >=0? address1 :" ") +
                " " + (address2 >=0? address2 :" ") +
                " " + (address3 >=0? address3 :" ") ;
    }
}
