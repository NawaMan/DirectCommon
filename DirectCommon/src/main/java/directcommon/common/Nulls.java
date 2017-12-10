//  ========================================================================
//  Copyright (c) 2017 Nawapunth Manusitthipol.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
package directcommon.common;

import java.util.Optional;
import java.util.function.Supplier;

import lombok.experimental.UtilityClass;

/**
 * This utility class contains useful methods involving null.
 * 
 * @author NawaMan
 */
@UtilityClass
public class Nulls {

    /**
     * Returns {@code true} if theGivenObject is null. 
     * 
     * @param theGivenObject
     * @return {@code true} if theGivenObject is null.
     **/
    public boolean isNull(Object theGivenObject) {
        return (theGivenObject == null);
    }

    /**
     * Returns {@code true} if theGivenObject is not null. 
     * 
     * @param theGivenObject
     * @return {@code true} if theGivenObject is not null.
     **/
    public boolean isNotNull(Object theGivenObject) {
        return (theGivenObject != null);
    }
    
    /**
     * Returns elseValue if theGivenObject is null. 
     * 
     * @param  theGivenObject 
     * @param  elseValue 
     * @return theGivenObject if not null or elseValue if null.
     **/
    public <T> T or(T theGivenObject, T elseValue) {
        return (theGivenObject == null) ? elseValue : theGivenObject;
    }
    
    /**
     * Extension method to create optional of theGivenObject. 
     * 
     * @param theGivenObject 
     * @return the optional value of the theGivenObject.
     **/
    public <T> Optional<T> whenNotNull(T theGivenObject) {
        return Optional.ofNullable(theGivenObject);
    }
    
    /**
     * Returns the result of elseSupplier if the given object is null. 
     * 
     * @param theGivenObject 
     * @param elseSupplier 
     * @return theGivenObject if not null or value from the elseSupplier if null.
     **/
    public <T> T or(T theGivenObject, Supplier<? extends T> elseSupplier) {
        return (theGivenObject == null) ? elseSupplier.get() : theGivenObject;
    }
    
}
