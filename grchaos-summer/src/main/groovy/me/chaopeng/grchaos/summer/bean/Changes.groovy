package me.chaopeng.grchaos.summer.bean

/**
 * me.chaopeng.grchaos.summer.bean.Changes
 *
 * @author chao
 * @version 1.0 - 2016-06-02
 */
class Changes<T> {

    List<T> adds = []
    List<T> deletes = []
    List<T> changes = []

    boolean isEmpty() {
        adds.isEmpty() && deletes.isEmpty() && changes.isEmpty()
    }
}
