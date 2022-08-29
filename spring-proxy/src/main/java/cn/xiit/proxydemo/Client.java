package cn.xiit.proxydemo;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();


        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(host);
        Rent proxy1 = (Rent) proxyInvocationHandler.getProxy();
        proxy1.rent();

//        Proxy proxy = new Proxy(host);
//        proxy.rent();
    }
}
