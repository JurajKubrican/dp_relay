package sk.knet.dp.relay

import org.springframework.boot.test.mock.mockito.MockBean

@MockBean
class ProcessServerRequest {
    fun get(netId: String, transitionId: String, instanceId: String): Any {
        return {}
    }


    fun data(netId: String, transitionId: String, instanceId: String, data: Map<String, Any>): Any {
        return {}
    }


    fun assign(netId: String, transitionId: String, instanceId: String): Any {
        return {}
    }


    fun cancel(netId: String, transitionId: String, instanceId: String): Any {
        return {}
    }


    fun finish(netId: String, transitionId: String, instanceId: String): Any {
        return {}
    }

    fun delegate(netId: String, transitionId: String, instanceId: String, user: String): Any {
        return {}
    }
}
