package directcommon.common;

import java.util.Optional;
import java.util.function.Supplier;

public class UNull {

    /** Returns {@code true} if the object is null. */
    public static boolean isNull(Object obj) {
        return (obj == null);
    }

    /** Returns {@code true} if the object is not null. */
    public static boolean isNotNull(Object obj) {
        return (obj != null);
    }
    
    /** Returns elseValue if the given object is null. **/
    public static <T> T or(T theGivenObject, T elseValue) {
        return (theGivenObject == null) ? elseValue : theGivenObject;
    }
    
    /** Extension method to create optional of the given object. **/
    public static <T> Optional<T> whenNotNull(T theGivenObject) {
        return Optional.ofNullable(theGivenObject);
    }
    
    /** Returns the result of elseSupplier if the given object is null. **/
    public static <T> T or(T theGivenObject, Supplier<? extends T> elseSupplier) {
        return (theGivenObject == null) ? elseSupplier.get() : theGivenObject;
    }
    
}
