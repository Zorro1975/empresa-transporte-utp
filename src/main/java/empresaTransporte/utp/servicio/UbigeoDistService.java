package empresaTransporte.utp.servicio;

import empresaTransporte.utp.entidad.ubigeo.UbigeoDist;
import empresaTransporte.utp.repositorio.UbigeoDistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbigeoDistService {

    @Autowired
    private UbigeoDistRepository ubigeoDistRepository;

    public List<UbigeoDist> obtenerUbigeoDist() {
        return ubigeoDistRepository.findUbigeoDistByActivoTrue();
    }

    public UbigeoDist obtenerPorId(Long id) {
        return ubigeoDistRepository.getById(id);
    }
}
