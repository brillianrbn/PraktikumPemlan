package tugasPemlanPraktikum2;
import java.util.Scanner;

public class maintugasperpus2 {
    public static void main(String[] args) {
        tugasperpus2 perpus = new tugasperpus2("Judul Default", "Penulis Default", 0, "Sinopsis Default");

        Scanner scn = new Scanner(System.in);

        System.out.println("========================PERPUSTAKAAN========================\n");
        System.out.printf("SELAMAT DATANG DI PERPUSTAKAAN \nDaftar kategori buku di perpustakaan ini :\n 1. Teknologi\n 2. Filsafat\n 3. Sejarah\n 4. Agama\n 5. Psikologi\n 6. Politik\n 7. Fiksi\n 8. Keluar\n \nSilahkan masukkan kode kategori buku yang ingin Anda cari : ");

        int kode = scn.nextInt();
        switch (kode) {
            case 1:
            tugasperpus2 buku1Teknologi = new tugasperpus2("Cybersecurity Fundamentals", "Michael Lee", 220, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?,");
            tugasperpus2 buku2Teknologi = new tugasperpus2("Internet of Things: Konsep dan Aplikasi", "Andi Wijaya", 250, " laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2 buku3Teknologi = new tugasperpus2("Rekayasa Perangkat Lunak: Metode dan Praktikum", "Rudi Susanto", 350, "Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2 buku4Teknologi = new tugasperpus2("AI Superpowers: China, Silicon Valley, and the New World Order", "Kai-Fu Lee", 272, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis");
            tugasperpus2 buku5Teknologi = new tugasperpus2("Python for Data Science", "Jane Smith", 250, "Lorem ipsum dolor sit amet consectetur adipisicing elit.quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2[] bukuArrayTeknologi = {buku1Teknologi, buku2Teknologi, buku3Teknologi, buku4Teknologi, buku5Teknologi};
            perpus.kategori(bukuArrayTeknologi);
            break;

            case 2:
            tugasperpus2 buku1Filsafat = new tugasperpus2("Filsafat Ilmu: Teori, Metode, dan Etika Penelitian", "Retno Wulandari", 320, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Est nihil soluta cumque possimus amet quibusdam hic expedita ratione doloribus alias. Earum ");
            tugasperpus2 buku2Filsafat = new tugasperpus2("Filsafat Hidup: Memahami Arti dan Makna Kehidupan", "I Wayan Sunarta", 300, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            tugasperpus2 buku3Filsafat = new tugasperpus2("Beyond Good and Evil", "Friedrich Nietzsche", 280, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Est nihil soluta cumque possimus amet quibusdam hic expedita ratione doloribus alias. Earum et adipisci alias, repudiandae natus sint animi quaerat impedit.");
            tugasperpus2 buku4Filsafat = new tugasperpus2("Critique of Pure Reason", "Immanuel Kant", 500, "as, repudiandae natus sint animi quaerat impedit.");
            tugasperpus2 buku5Filsafat = new tugasperpus2("The Philosophy Book: Big Ideas Simply Explained", "DK", 352, "amet quibusdam hic expedita ratione doloribus alias. Earum et adipisci alias, repudiandae natus sint animi quaerat impedit.");
            tugasperpus2[] bukuArrayFilsafat = {buku1Filsafat, buku2Filsafat, buku3Filsafat, buku4Filsafat, buku5Filsafat};
            perpus.kategori(bukuArrayFilsafat);
            break;

            case 3:
            tugasperpus2 buku1Sejarah = new tugasperpus2("Sejarah Indonesia: Dari Zaman Batu Hingga Kemerdekaan", "Slamet Muljana", 700, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            tugasperpus2 buku2Sejarah = new tugasperpus2("Sejarah Asia Tenggara: Perjalanan Bangsa-Bangsa di Nusantara", "I Gede Putra", 400, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            tugasperpus2 buku3Sejarah = new tugasperpus2("A People's History of the United States", "Howard Zinn", 700, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2 buku4Sejarah = new tugasperpus2("The Silk Roads: A New History of the World", "Peter Frankopan", 800, " adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2 buku5Sejarah = new tugasperpus2("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 464, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2[] bukuArraySejarah = {buku1Sejarah, buku2Sejarah, buku3Sejarah, buku4Sejarah, buku5Sejarah};
            perpus.kategori(bukuArraySejarah);
            break;

            case 4:
            tugasperpus2 buku1Agama = new tugasperpus2("Islam: A Short History", "Karen Armstrong", 200, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2 buku2Agama = new tugasperpus2("Kepercayaan Lokal: Kearifan Lokal dalam Budaya Nusantara", "Nyoman Wirasuta", 280, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            tugasperpus2 buku3Agama = new tugasperpus2("The Life of the Prophet Muhammad", "Ibn Kathir", 300, " itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2 buku4Agama = new tugasperpus2("Kristen: Doktrin dan Praktik", "Maria Retno", 280, " laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2 buku5Agama = new tugasperpus2("Why Religion?: A Personal Story", "Elaine Pagels", 256, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?,");
            tugasperpus2[] bukuArrayAgama = {buku1Agama, buku2Agama, buku3Agama, buku4Agama, buku5Agama};
            perpus.kategori(bukuArrayAgama);
            break;

            case 5:
            tugasperpus2 buku1Psikologi = new tugasperpus2("Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", 350, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolorem quos p.");
            tugasperpus2 buku2Psikologi = new tugasperpus2("The Psychology of Persuasion", "Robert B. Cialdini", 250, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            tugasperpus2 buku3Psikologi = new tugasperpus2("Psikologi Sosial: Teori dan Aplikasi", "Dini Pratiwi", 320, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolorem quos perferendis maiores odit.");
            tugasperpus2 buku4Psikologi = new tugasperpus2("Blink: The Power of Thinking Without Thinking", "Malcolm Gladwell", 296, "Lorem ipsum dolor sit amet consectetur adipisicing elit.  labore amet aliquid, optio maiores odit.");
            tugasperpus2 buku5Psikologi = new tugasperpus2("Psikologi Kepribadian: Teori dan Pengukuran", "Ratih Dewi", 350, "7quos perferendis accusantium porro architecto est ratione nostrum laudantium placeat voluptatem qui dolorum libero ipsum labore amet aliquid, optio maiores odit.");
            tugasperpus2[] bukuArrayPsikologi = {buku1Psikologi, buku2Psikologi, buku3Psikologi, buku4Psikologi, buku5Psikologi};
            perpus.kategori(bukuArrayPsikologi);
            break;

            case 6:
            tugasperpus2 buku1Politik = new tugasperpus2("Politik Global: Tantangan dan Perspektif", "Denny Kartika", 320, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            tugasperpus2 buku2Politik = new tugasperpus2("Demokrasi: Teori dan Praktik", "Bambang Susilo", 280, " laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2 buku3Politik = new tugasperpus2("Political Islam and Violence in Indonesia", "Zachary Abuza", 280, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            tugasperpus2 buku4Politik = new tugasperpus2("How Democracies Die", "Steven Levitsky, Daniel Ziblatt", 320, "Lorem sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2 buku5Politik = new tugasperpus2("The Politics of Indonesia: Malaysia Relations", "Amitav Acharya", 250, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Possimus necessitatibus laboriosam similique sunt cupiditate placeat suscipit, quis officiis, itaque quibusdam, rerum fuga natus quas minus velit assumenda perferendis dolorum unde?");
            tugasperpus2[] bukuArrayPolitik = {buku1Politik, buku2Politik, buku3Politik, buku4Politik, buku5Politik};
            perpus.kategori(bukuArrayPolitik);
            break;

            case 7:
            tugasperpus2 buku1Fiksi = new tugasperpus2("The Great Gatsby", "F. Scott Fitzgerald", 180, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Est nihil soluta cumque possimus amet quibusdam hic expedita ratione doloribus alias. Earum et adipisci alias, repudiandae natus sint animi quaerat impedit.");
            tugasperpus2 buku2Fiksi = new tugasperpus2("Laskar Pelangi", "Andrea Hirata", 400, " quibusdam hic expedita ratione doloribus alias. Earum et adipisci alias, repudiandae natus sint animi quaerat impedit.");
            tugasperpus2 buku3Fiksi = new tugasperpus2("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 320, "dolor sit amet consectetur adipisicing elit. Est nihil soluta cumque possimus sint animi quaerat impedit.");
            tugasperpus2 buku4Fiksi = new tugasperpus2("Bumi Manusia", "Pramoedya Ananta Toer", 450, "Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
            tugasperpus2 buku5Fiksi = new tugasperpus2("Normal People", "Sally Rooney", 288, "soluta cumque possimus amet quibusdam hic expedita ratione doloribus alias. Earum et adipisci alias, repudiandae natus sint animi quaerat impedita.");
            tugasperpus2[] bukuArrayFiksi = {buku1Fiksi, buku2Fiksi, buku3Fiksi, buku4Fiksi, buku5Fiksi};
            perpus.kategori(bukuArrayFiksi);
            break;

            case 8:
            System.out.println("Terima kasih telah mengunjungi perpustakaan kami.");
            break;

            default:
                System.out.println("Invalid");
        }
        
    }
}