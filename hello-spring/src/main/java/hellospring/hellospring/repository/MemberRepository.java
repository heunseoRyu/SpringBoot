package hellospring.hellospring.repository;

import hellospring.hellospring.domain.Member;

import java.util.Optional;
import java.util.List;
public abstract class MemberRepository {
    Member save(Member member) {
        return null;
    }

    Optional<Member> findById(long id) {
        return null;
    }

    Optional<Member> findById(String name) {
        return null;
    }

    List<Member> findAll() {
        return null;
    }

    public abstract Optional<Member> findById(Long id);//추상화 시켜야지 에러 안생김.

    public abstract Optional<Member> findByName(String name);//근데 왜 붙여야 되는겨 야발
}
