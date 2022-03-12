package com.chuck.base.domain.range;

import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Administrator
 * @version 0.0.1
 * @apiNote Value Object
 * @since 2021/8/13
 */
@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Range<T> {

  private T from;

  private T to;
}
