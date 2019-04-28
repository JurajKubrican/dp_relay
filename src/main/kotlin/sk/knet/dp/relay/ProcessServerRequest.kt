package sk.knet.dp.relay

import org.springframework.stereotype.Service

@Service
class ProcessServerRequest {
    fun get(netId: String, transitionId: String): Any {
        return {}
    }


    fun post(netId: String, transitionId: String, data: Map<String, Any>): Any {
        return {}
    }
}
