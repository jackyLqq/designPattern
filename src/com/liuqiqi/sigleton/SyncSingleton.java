package com.liuqiqi.sigleton;

/**
 * 双重检查，加锁实现
 *
 * @author liuqiqi
 * @date 2020/4/26 21:19
 */
public class SyncSingleton {

    private static volatile SyncSingleton syncSingleton = null;

    private SyncSingleton() {
    }

    public static SyncSingleton getSyncSingleton() {
        if (syncSingleton == null) {
            synchronized (SyncSingleton.class) {
                if (syncSingleton == null) {
                    syncSingleton = new SyncSingleton();
                    return syncSingleton;
                }
                return syncSingleton;
            }
        }
        return syncSingleton;
    }
}
