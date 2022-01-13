package com.chuck.base.domain.core;

import com.chuck.base.handler.ValidationNotificationHandler;

/**
 * Chuck 26/9/21 10:19
 */
public abstract class IdentifiedEntity extends IdentifiedDomainObject {

    public IdentifiedEntity() {
        super();
    }

    /**
     * 实体整体级别上的校验
     *
     * @param aHandler
     */
    public void validate(ValidationNotificationHandler aHandler) {
    }

    public void complete() {
    }
}