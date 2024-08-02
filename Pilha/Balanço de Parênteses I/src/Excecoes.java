public class Excecoes extends RuntimeException{
    public static class pilhaVazia extends Throwable{
        String msg;
        public String getMsg(){ return msg; }
        public pilhaVazia(String msg){
            super();
            this.msg = msg;
        }
    }
}
