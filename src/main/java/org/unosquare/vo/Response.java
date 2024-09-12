package org.unosquare.vo;

import lombok.*;

@Getter
@EqualsAndHashCode
@ToString
//@Builder
//@AllArgsConstructor
public class Response {
    public Object datos;
    public Integer codigo;
    public String mensaje;
}
