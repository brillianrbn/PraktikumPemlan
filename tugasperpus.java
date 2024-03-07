package tugasPemlanPraktikum;

public class tugasperpus {
    public String[][] Teknologi = {
        {"Cybersecurity Fundamentals", "Michael Lee", "220"},
        {"Internet of Things: Konsep dan Aplikasi", "Andi Wijaya", "250"},
        {"Rekayasa Perangkat Lunak: Metode dan Praktikum", "Rudi Susanto", "350"},
        {"AI Superpowers: China, Silicon Valley, and the New World Order", "Kai-Fu Lee", "272"},
        {"Python for Data Science", "Jane Smith", "250"}
    };

    public String[][] Filsafat = {
        {"Filsafat Ilmu: Teori, Metode, dan Etika Penelitian", "Retno Wulandari", "320"},
        {"Filsafat Hidup: Memahami Arti dan Makna Kehidupan", "I Wayan Sunarta", "300"},
        {"Beyond Good and Evil", "Friedrich Nietzsche", "280"},
        {"Critique of Pure Reason", "Immanuel Kant", "500"},
        {"The Philosophy Book: Big Ideas Simply Explained", "DK", "352", "DK","2011"}
    };

    public String[][] Sejarah = {
        {"Sejarah Indonesia: Dari Zaman Batu Hingga Kemerdekaan", "Slamet Muljana", "500"},
        {"Sejarah Asia Tenggara: Perjalanan Bangsa-Bangsa di Nusantara", "I Gede Putra", "400"},
        {"A People's History of the United States", "Howard Zinn", "700"},
        {"The Silk Roads: A New History of the World", "Peter Frankopan", "800"},
        {"Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "464"}
    };
    
    public String[][] Agama = {
        {"Islam: A Short History", "Karen Armstrong", "200"},
        {"Kepercayaan Lokal: Kearifan Lokal dalam Budaya Nusantara", "Nyoman Wirasuta", "280"},
        {"The Life of the Prophet Muhammad", "Ibn Kathir", "300"},
        {"Kristen: Doktrin dan Praktik", "Maria Retno", "280",},
        {"Why Religion?: A Personal Story", "Elaine Pagels", "256", "Ecco", "2018"}
    };

    public String[][] Psikologi = {
        {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "350"},
        {"The Psychology of Persuasion", "Robert B. Cialdini", "250"},
        {"Psikologi Sosial: Teori dan Aplikasi", "Dini Pratiwi", "320"},
        {"Blink: The Power of Thinking Without Thinking", "Malcolm Gladwell", "296"},
        {"Psikologi Kepribadian: Teori dan Pengukuran", "Ratih Dewi", "350"}
    }; 

    public String[][] Politik = {
        {"Politik Global: Tantangan dan Perspektif", "Denny Kartika", "320"},
        {"Demokrasi: Teori dan Praktik", "Bambang Susilo", "280"},
        {"Political Islam and Violence in Indonesia", "Zachary Abuza", "280"},
        {"How Democracies Die", "Steven Levitsky, Daniel Ziblatt", "320"},
        {"The Politics of Indonesia: Malaysia Relations", "Amitav Acharya", "250"}
    }; 

    public String[][] Fiksi = {
        {"The Great Gatsby", "F. Scott Fitzgerald", "180"},
        {"Laskar Pelangi", "Andrea Hirata", "400"},
        {"Harry Potter and the Philosopher's Stone", "J.K. Rowling", "320"},
        {"Bumi Manusia", "Pramoedya Ananta Toer", "450"},
        {"Normal People", "Sally Rooney", "288", "Hogarth Press", "2018"}
    };
    
public String getInformasiBuku(int kode) {
    String informasi = "";
    
    switch (kode) {
        case 1:
            informasi = "\nKategori\t: Teknologi\n";
            informasi += "========================\n";
            for (String[] buku : Teknologi) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 2:
            informasi = "Kategori: Filsafat\n";
            informasi += "========================\n";
            for (String[] buku : Filsafat) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 3:
            informasi = "Kategori\t: Sejarah\n";
            informasi += "========================\n";
            for (String[] buku : Sejarah) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 4:
            informasi = "Kategori\t: Agama\n";
            informasi += "========================\n";
            for (String[] buku : Agama) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 5:
            informasi = "Kategori\t: Psikologi\n";
            informasi += "========================\n";
            for (String[] buku : Psikologi) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 6:
            informasi = "Kategori: Politik\n";
            informasi += "========================\n";
            for (String[] buku : Politik) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 7:
            informasi = "Kategori\t: Fiksi\n";
            informasi += "========================\n";
            for (String[] buku : Fiksi) {
                informasi += "Judul\t\t: " + buku[0] + "\n";
                informasi += "Pengarang\t: " + buku[1] + "\n";
                informasi += "Jumlah Halaman\t: " + buku[2] + "\n\n";
            }
            break;
        case 8:
            System.out.println("Terima kasih telah mengunjungi perpustakaan kami.");
            break;
        default:
            informasi = "Invalid.";
            break;
    }
    
    return informasi;
}
}
