package construct;

import java.lang.reflect.Member;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);
        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] memberInits = new MemberInit[]{member1, member2};

        for (MemberInit s : memberInits) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }

    static void initMember(MemberInit memberInit, String name, int age, int grade) {
        memberInit.name = name;
        memberInit.age = age;
        memberInit.grade = grade;
    }
}
