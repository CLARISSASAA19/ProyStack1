import java.util.Stack;
public class Pila {
    private Stack pila;  ///refeerencia////

    public Pila() {
        pila=new Stack<Integer>(); //Integer solo para datos enteros///

    }
    public void insertar(Integer dato){
        pila.push(dato);
    }
    public Integer eliminar ()throws Exception{
        if(pila.empty())
          throw new Exception("Pila sin elementos");
       return (Integer) pila.pop();
    }
    public Integer consultarTope() throws Exception{
        if (pila.empty())
            throw new Exception("Pila sin elementos");
        return (Integer) pila.peek();
    }


    @Override
    public String toString(){
        String resultado= "===PILA===\n";
        for (int i=pila.size()-1; i>=0;i--){
            resultado+=pila.get(i)+"\n";
        }
        return resultado;
    }
}
