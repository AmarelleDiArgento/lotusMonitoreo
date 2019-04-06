package com.lotus.lotusmonitoreo.Configuracion;

import java.util.List;

public interface DAO <K,O,S>{
    int insert(O o) throws Exception;
    int update(O o) throws Exception;
    int delete(K id) throws Exception;
    O oneId(K id)throws Exception;
    O oneName(S name) throws Exception;
    List<O> all()throws Exception;


}
