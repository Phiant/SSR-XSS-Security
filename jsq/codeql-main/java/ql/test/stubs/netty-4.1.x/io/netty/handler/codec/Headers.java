// Generated automatically from io.netty.handler.codec.Headers for testing purposes

package io.netty.handler.codec;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Headers<K, V, T extends Headers<K, V, T>> extends java.lang.Iterable<Map.Entry<K, V>>
{
    Boolean getBoolean(K p0);
    Boolean getBooleanAndRemove(K p0);
    Byte getByte(K p0);
    Byte getByteAndRemove(K p0);
    Character getChar(K p0);
    Character getCharAndRemove(K p0);
    Double getDouble(K p0);
    Double getDoubleAndRemove(K p0);
    Float getFloat(K p0);
    Float getFloatAndRemove(K p0);
    Integer getInt(K p0);
    Integer getIntAndRemove(K p0);
    List<V> getAll(K p0);
    List<V> getAllAndRemove(K p0);
    Long getLong(K p0);
    Long getLongAndRemove(K p0);
    Long getTimeMillis(K p0);
    Long getTimeMillisAndRemove(K p0);
    Short getShort(K p0);
    Short getShortAndRemove(K p0);
    T add(Headers<? extends K, ? extends V, ? extends Object> p0);
    T add(K p0, Iterable<? extends V> p1);
    T add(K p0, V p1);
    T add(K p0, V... p1);
    T addBoolean(K p0, boolean p1);
    T addByte(K p0, byte p1);
    T addChar(K p0, char p1);
    T addDouble(K p0, double p1);
    T addFloat(K p0, float p1);
    T addInt(K p0, int p1);
    T addLong(K p0, long p1);
    T addObject(K p0, Iterable<? extends Object> p1);
    T addObject(K p0, Object p1);
    T addObject(K p0, Object... p1);
    T addShort(K p0, short p1);
    T addTimeMillis(K p0, long p1);
    T clear();
    T set(Headers<? extends K, ? extends V, ? extends Object> p0);
    T set(K p0, Iterable<? extends V> p1);
    T set(K p0, V p1);
    T set(K p0, V... p1);
    T setAll(Headers<? extends K, ? extends V, ? extends Object> p0);
    T setBoolean(K p0, boolean p1);
    T setByte(K p0, byte p1);
    T setChar(K p0, char p1);
    T setDouble(K p0, double p1);
    T setFloat(K p0, float p1);
    T setInt(K p0, int p1);
    T setLong(K p0, long p1);
    T setObject(K p0, Iterable<? extends Object> p1);
    T setObject(K p0, Object p1);
    T setObject(K p0, Object... p1);
    T setShort(K p0, short p1);
    T setTimeMillis(K p0, long p1);
    V get(K p0);
    V get(K p0, V p1);
    V getAndRemove(K p0);
    V getAndRemove(K p0, V p1);
    boolean contains(K p0);
    boolean contains(K p0, V p1);
    boolean containsBoolean(K p0, boolean p1);
    boolean containsByte(K p0, byte p1);
    boolean containsChar(K p0, char p1);
    boolean containsDouble(K p0, double p1);
    boolean containsFloat(K p0, float p1);
    boolean containsInt(K p0, int p1);
    boolean containsLong(K p0, long p1);
    boolean containsObject(K p0, Object p1);
    boolean containsShort(K p0, short p1);
    boolean containsTimeMillis(K p0, long p1);
    boolean getBoolean(K p0, boolean p1);
    boolean getBooleanAndRemove(K p0, boolean p1);
    boolean isEmpty();
    boolean remove(K p0);
    byte getByte(K p0, byte p1);
    byte getByteAndRemove(K p0, byte p1);
    char getChar(K p0, char p1);
    char getCharAndRemove(K p0, char p1);
    double getDouble(K p0, double p1);
    double getDoubleAndRemove(K p0, double p1);
    float getFloat(K p0, float p1);
    float getFloatAndRemove(K p0, float p1);
    int getInt(K p0, int p1);
    int getIntAndRemove(K p0, int p1);
    int size();
    java.util.Iterator<Map.Entry<K, V>> iterator();
    java.util.Set<K> names();
    long getLong(K p0, long p1);
    long getLongAndRemove(K p0, long p1);
    long getTimeMillis(K p0, long p1);
    long getTimeMillisAndRemove(K p0, long p1);
    short getShort(K p0, short p1);
    short getShortAndRemove(K p0, short p1);
}
