package edu.mum.cs.cs401.model.entity;

import java.util.List;

/**
 * Created by 985333 on 9/13/2016.
 */
public class Member  extends  Person{

    public Member(String id, String firstName, String lastName, List<Address> addresses, String phoneNumber, String role) {
        super(id, firstName, lastName, addresses, phoneNumber, role);
    }
}
