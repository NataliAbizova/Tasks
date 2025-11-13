package H3_Proxy;

class ProxyTxt implements Txt {
    private String fileName;
    private FileTxt fileProxy;

    public ProxyTxt(String fileName) {
        this.fileName = fileName;
    }

    public void reading() {
        if (fileProxy == null) {
            fileProxy = new FileTxt(fileName);
        }
        fileProxy.reading();
    }
}
