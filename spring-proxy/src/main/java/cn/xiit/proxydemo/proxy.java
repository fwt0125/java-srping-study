package cn.xiit.proxydemo;

class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        seeHouse();
        hetong();
        fare();
    }

    public void seeHouse(){
        System.out.println("中介带你看房子");
    }

    public void hetong(){
        System.out.println("中介带你签租赁合同");
    }

    public void fare(){
        System.out.println("收中介费");
    }

}
