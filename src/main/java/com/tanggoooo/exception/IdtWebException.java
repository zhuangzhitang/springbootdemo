package com.tanggoooo.exception;


/**
 * Created by panxing on 17/8/1
 */
public class IdtWebException extends Exception {

    public final IdtWebError idtWebError;

    public IdtWebException(IdtWebError idtWebError) {
        this.idtWebError = idtWebError;
    }
}
