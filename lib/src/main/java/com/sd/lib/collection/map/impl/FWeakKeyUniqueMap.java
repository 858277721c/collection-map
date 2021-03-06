package com.sd.lib.collection.map.impl;

/**
 * key是弱引用，并且key和value都是唯一的Map
 *
 * @param <K>
 * @param <V>
 */
public class FWeakKeyUniqueMap<K, V> extends BaseUniqueMap<K, V>
{
    public FWeakKeyUniqueMap()
    {
        super(new FWeakKeyMap<K, V>(), new FWeakValueMap<V, K>());
    }
}
