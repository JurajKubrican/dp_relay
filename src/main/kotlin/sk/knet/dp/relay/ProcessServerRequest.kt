package sk.knet.dp.relay

import org.springframework.stereotype.Service

@Service
class ProcessServerRequest {
    fun get(netId: String, transitionId: String, instanceId: String): Any {
        return {}
    }


    fun perform(netId: String, transitionId: String, instanceId: String, data: Map<String, Any>): Any {
        return {}
    }


    fun assign(netId: String, transitionId: String, instanceId: String): Any {
        return {}
    }


    fun cancel(netId: String, transitionId: String, instanceId: String): Any {
        return {}
    }

    fun delegate(netId: String, transitionId: String, instanceId: String, user: String): Any {
        return {}
    }
}
