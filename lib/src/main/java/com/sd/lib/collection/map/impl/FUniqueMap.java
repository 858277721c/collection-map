package com.sd.lib.collection.map.impl;

/**
 * key和value都是唯一的Map
 *
 * @param <K>
 * @param <V>
 */
public class FUniqueMap<K, V> extends BaseUniqueMap<K, V>
{
    public FUniqueMap()
    {
        super(new FHashMap<K, V>(), new FHashMap<V, K>());
    }
}