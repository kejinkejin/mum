package edu.mum.cs.cs401.controller;

import edu.mum.cs.cs401.dataaccess.DataAccess;
import edu.mum.cs.cs401.dataaccess.DataAccessImpl;
import edu.mum.cs.cs401.model.entity.Member;

/**
 * Created by 985333 on 9/13/2016.
 */
public class MemberController {

    private static MemberController instance = new MemberController();
    private static DataAccess<String , Member> databaseMember = null;

    public MemberController() {
        databaseMember = new DataAccessImpl<>();
    }

    public static MemberController getInstance(){
        return instance;
    }

    public  Member addMember(Member member){
       return databaseMember.add(member.getId() ,member);
    }

    public Member modifyMember(String mid, Member member){
        return databaseMember.update(mid, member);
    }

    public  Member deleteMember(String memberId){
        return databaseMember.delete(memberId);
    }

    public  Member getMember(String memberId){
        return databaseMember.get(memberId);
    }


}
