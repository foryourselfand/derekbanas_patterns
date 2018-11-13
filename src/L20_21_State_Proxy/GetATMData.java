package L20_21_State_Proxy;

// This interface will contain just those methods
// that you want the proxy to provide access to

import L20_21_State_Proxy.States.ATMState;

public interface GetATMData {
    public ATMState getATMState();

    public int getCashInMachine();
}
