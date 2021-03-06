package com.sd.lib.collection.map.impl;

/**
 * value是弱引用，并且key和value都是唯一的Map
 *
 * @param <K>
 * @param <V>
 */
public class FWeakValueUniqueMap<K, V> extends BaseUniqueMap<K, V>
{
    public FWeakValueUniqueMap()
    {
        super(new FWeakValueMap<K, V>(), new FWeakKeyMap<V, K>());
    }
}
