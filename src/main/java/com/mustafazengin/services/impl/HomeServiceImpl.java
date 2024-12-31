package com.mustafazengin.services.impl;

import com.mustafazengin.dto.DtoHome;
import com.mustafazengin.dto.DtoRoom;
import com.mustafazengin.entities.Home;
import com.mustafazengin.entities.Room;
import com.mustafazengin.repository.HomeRepository;
import com.mustafazengin.services.IHomeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@Service
public class HomeServiceImpl implements IHomeService {

    @Autowired
    private HomeRepository homeRepository;


    @Override
    public DtoHome findHomeById(Long id) {

        DtoHome dtoHome = new DtoHome();

        Optional<Home> optional = homeRepository.findById(id);

        if (optional.isEmpty()){

            return null;

        }

        Home dbhome = optional.get();

        List<Room> dbrooms=optional.get().getRoom();

        BeanUtils.copyProperties(dbhome,dtoHome);

        if (dbrooms!=null && !dbrooms.isEmpty()){

            for (Room room : dbrooms){

                DtoRoom dtoRoom=new DtoRoom();
                BeanUtils.copyProperties(room,dtoRoom);
                dtoHome.getRooms().add(dtoRoom);
            }

        }

        return dtoHome;
    }
}
