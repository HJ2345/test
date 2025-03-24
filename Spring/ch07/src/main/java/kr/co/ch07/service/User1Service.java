package kr.co.ch07.service;

import kr.co.ch07.dto.User1DTO;
import kr.co.ch07.entity.User1;
import kr.co.ch07.repository.User1Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class User1Service {
    
    //@RequiredArgsConstructor 생성자 주입 (final 있을시)
    private final User1Repository repository;
    
    public void register(){
        log.info("user1DTO" + user1DTO);
        // DTO를 Entity로 변환
        User1 user1 = User1DTO.toEntity();
        log.info("user1DTO" + user1DTO);

        repository.save(user1);
    }

    public List<User1DTO> findAll(){
        // Entity 전체 조회
        List<User1> user1Entities =repository.findAll();

        // DTO 리스트 변환
        /* 외부 반복자를 이용하기 때문에 성능에서 불리
        List<User1DTO> user1DTOs = new ArrayList<>();

        for (User1 user1 : user1Entities) {

            user1DTOs.add(user1.toDTO());
        }
        */
        // 내부 반복자를 이용한 변환
        List<User1DTO> user1DTOs = user1Entities
                                    .stream()
                                    .map( entity ->
                                        entity.toDTO()
                                        )
                                    .toList();
        return null;
    }

    public User1DTO findById(String uid){
        return null;
    }

    public void modify(User1DTO user1DTO){

    }
    public void delete(User1DTO uid){

    }
}
