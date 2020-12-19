package LinkedList;

public class MyLinkedList {
    // listenin basini ve sonunu tanimladim.
    Node head;
    Node son;
    //    Veri yapısini burada baslat. (constructor)
    public MyLinkedList(){
        head = null;
        son = null;
    }
    public void listeyiYazdir(){
        Node tmp = head;
        while(tmp!=null){
            System.out.println(tmp.val+ " ");
            tmp = tmp.next;
        }
    }
    public boolean doluMu(){
         if(head!=null){
             return true;
         }else{
             return false;
         }
    }
    //    Bağlantılı listeden indeks düğümünün değerini alın.
    //    Dizin geçersizse -1 döndür.
    public void get(int index){

    }
    //    Bağlantılı listenin ilk öğesinden önce val değerli bir düğüm ekleyin.
    //    Eklemeden sonra, yeni düğüm, bağlantılı listenin ilk düğümü olacaktır.
    public void addAtHead(int val){
        Node yeniEleman = new Node(val);
        if (doluMu()){
            // liste dolu
            yeniEleman.next = head;
            head = yeniEleman;
        }else{
            // liste bos
            head = yeniEleman;
            son = yeniEleman;
        }

    }
    //    Bağlantılı listenin son öğesine bir değer düğümü ekleyin.
    public void addAtTail(int val){
        Node yeniEleman = new Node(val);
        if (doluMu()){
            // liste dolu
            son.next = yeniEleman;
            son = yeniEleman;
        }else{
            // liste bos
            head = yeniEleman;
            son = yeniEleman;
        }

    }
    //    Bağlı listedeki indeks düğümünden önce val değerli bir düğüm ekleyin.
    //    Dizin bağlantılı listenin uzunluğuna eşitse, düğüm bağlantılı listenin sonuna eklenecektir.
    //    İndeks uzunluktan büyükse, düğüm eklenmeyecektir.
    public void addAtIndex(int index, int val){

    }
    //    Dizin geçerliyse, bağlantılı listedeki dizin düğümünü silin.
    public void deleteAtIndex(int index) {

    }

}
