package br.com.sergiowink.place_service.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.slugify.Slugify;

import br.com.sergiowink.place_service.dto.PlaceRequestDTO;
import br.com.sergiowink.place_service.entities.PlaceEntity;
import br.com.sergiowink.place_service.repositories.PlaceRepository;
import reactor.core.publisher.Mono;

@Service
public class PlaceUseCase {

    private Slugify slg;

    @Autowired
    private PlaceRepository placeRepository;

    public PlaceUseCase(PlaceRepository placeRepository){
        this.placeRepository = placeRepository;
        this.slg = Slugify.builder().build();
    }

    public Mono<PlaceEntity> create(PlaceRequestDTO placeRequestDTO) {
        var place = new PlaceEntity(
            null, placeRequestDTO.name(), slg.slugify(placeRequestDTO.name()),
            placeRequestDTO.city(), placeRequestDTO.state(), null, null);
        return placeRepository.save(place);
      }
}
