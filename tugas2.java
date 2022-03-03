import java.util.LinkedList;

public class tugas2 {
    public static void main(String[] args) {

        System.out.println("Tugas 2 : Linked List");

        //membuat LinkedList dengan variabel 'saya'
        LinkedList<String> saya = new LinkedList<>();

        //mengisi 'saya' dengan nama saya
        saya.add("F");
        saya.add("A");
        saya.add("I");
        saya.add("Z");
        saya.add(" ");
        saya.add("A");
        saya.add("B");
        saya.add("D");
        saya.add("U");
        saya.add("L");
        saya.add("L");
        saya.add("A");
        saya.add("H");

        //add karakter lain yg anda inginkan!
        System.out.println(" nama sekarang : "+saya);

        saya.addFirst("Muhammad");
        saya.addLast("bin Abdul Muthalib");

        System.out.println(" nama setelah ditambah : "+saya);

        //sisipkan karakter lain yang anda inginkan!
        saya.set(3,"III");
        saya.set(12,"AAA");

        System.out.println("nama setelah disisip : "+saya);

        //hapus beberapa karakter yg ingin anda hapus!
        saya.remove(0);
        saya.remove(13);

        System.out.println("nama setelah dihapus : "+saya);

        //buat fungsi POP dan PUSH!
        saya.push("Muhammad");
        System.out.println("nama setelah di PUSH : "+saya);

        saya.pop();
        System.out.println("nama setelah di POP : "+saya);
        
    }
}
