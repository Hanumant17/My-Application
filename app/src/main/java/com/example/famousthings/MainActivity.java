package com.example.famousthings;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    //ArrayList<Image> list;
    List<Image> imageList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   list = new ArrayList<>();
     //  list.addAll(MountainData.getListData());
      //  showRecyclerViewList();
      imageList = new ArrayList<>();
                imageList.add(new Image(R.drawable.taj,
                        "Taj Mahal",
                        "Place :  64 Taj Road, Agra",
                        "Famous for :  The world's most famous testimony to the power of love.",
                        "           Perhaps India's most recognizable building, the Taj Mahal is also the world's most famous testimony to the power of love. Named after Mumtaz Mahal, the favorite wife of Emperor Shah Jahan, this most beautiful of mausoleums was begun upon her death in 1631 and took 20,000 workmen until 1648 to complete."
                ));
                imageList.add(new Image(R.drawable.varanasi,
                        "The Holy City of Varanasi",
                        "Place :  Agra",
                        "Famous for :  Major pilgrimage center for Hindus.",
                        "           A major pilgrimage center for Hindus, the holy city of Varanasi has long been associated with the mighty Ganges River, one of the faith's most important religious symbols. Dating back to the 8th century BC, Varanasi is one of the oldest still inhabited cities in the world."
                ));
                imageList.add(new Image(R.drawable.goldentemple,
                        " Harmandir Sahib: The Golden Temple of Amritsar",
                        "Place :   Golden Temple Road, Amritsar, Punjab",
                        "Famous for :  Known as Golden Temple  And  The holiest of India's many Sikh shrines. ",
                        "           Founded in 1577 by Ram Das, Amritsar is an important hub of Sikh history and culture. The main attraction here is Harmandir Sahib, opened in 1604 and still often referred to as the Golden Temple for its beautiful gold decoration. The holiest of India's many Sikh shrines (it also attracts many Hindus and people of other faiths)," +
                                " the temple was built in a blend of Hindu and Islamic styles, its lower marble section featuring such flourishes as ornate inlaid floral and animal motifs, while the large golden dome represents a lotus flower, a symbol of purity to Sikhs."
                ));
                imageList.add(new Image(R.drawable.mecca,
                        "  Mecca Masjid, Hyderabad",
                        "Place :  Hyderabad.",
                        "Famous for :   One of the world's largest mosques-and One of the oldest in India.",
                        "           Construction of Hyderabad's Mecca Masjid, one of the world's largest mosques-and one of the oldest in India-began in 1614 during Mohammed Quli Qutub Shah's reign and took almost 80 years to complete. Large enough to accommodate 10,000 worshipers, this beautiful mosque's 15 enormous arches and pillars were each wrought from single slabs of black granite dragged to the site by huge cattle trains reputedly consisting of up to 1,400 bulls."
                ));
                imageList.add(new Image(R.drawable.ellora,
                        " The Ellora Caves, Aurangabad",
                        "Place :  Aurangabad.",
                        "Famous for :  One of the best tourist place in India",
                        "           The famous monumental Ellora Caves were built between the 5th and 10th centuries by Buddhist, Jain, and Hindu monks, and make for an excellent excursion from Mumbai, some 300 kilometers to the west.\n" +
                        "\n" +
                        "           Now a UNESCO World Heritage Site, this remarkable collection of 34 carved monasteries, chapels, and temples-12 of them Buddhist, 17 Hindu, and five belonging to the Jain faith-were built in close proximity to each other, a reflection of the religious tolerance that existed during this period of Indian history."
                ));
                imageList.add(new Image(R.drawable.mysorpalace,
                        " Mysore Palace",
                        "Place :  Sayyaji Rao Road, Mysuru, Karnataka ",
                        "Famous for :  One of the best tourist place in Karnataka",
                        "           The sprawling city of Mysore is a delight to explore thanks to its eclectic mix of fine old colonial architecture; regal Indian palaces; and lush, well-manicured gardens. While those inclined towards shopping will enjoy spending time in the city's famous silk and sandalwood bazaars, the main attraction is magnificent Mysore Palace."
                ));
                imageList.add(new Image(R.drawable.goldencity,
                        " The Golden City: Jaisalmer",
                        "Place :  Jaisalmer",
                        "Famous for :   Known as the Golden Fort",
                        "           So named for the yellow sandstone used in most of its buildings, the Golden City of Jaisalmer is an oasis of splendid old architecture that rises from the sand dunes of the Thar Desert. Once a strategic outpost, today the city is filled with splendid old mansions, magnificent gateways, and the massive Jaisalmer Fort-also known as the Golden Fort-a daunting 12th-century structure that rises high above the town."
                ));
                imageList.add(new Image(R.drawable.redfort,
                        "The Red Fort, New Delhi",
                        "Place :  Netaji Subhash Marg, Chandni Chowk, New Delhi, Delhi",
                        "Famous for :   Being the largest monument in Delhi.",
                        "           Built by Shah Jahan in 1648 as the seat of Mughal power-a role it maintained until 1857-the magnificent crescent-shaped Red Fort in New Delhi, named after the stunning red sandstone used in its construction, covers a vast area of more than two square kilometers, all of it surrounded by a large moat. " +
                                "Highlights include its two largest gates: the impressive Lahore Gate (the fort's main entrance) and the elaborately decorated Delhi Gate, once used by the emperor for ceremonial processions."
                ));
                imageList.add(new Image(R.drawable.gateway,
                        "Mumbai: The Gateway of India",
                        "Place :  Mumbai",
                        "Famous for :  Known as Famous Gateway of India",
                        "           Standing an impressive 26 meters tall and overlooking the Arabian Sea, the iconic Gateway of India is a must-see when in Mumbai. Built to commemorate the arrival of King George V and his wife Queen Mary in 1911, this stunning piece of architecture was opened with much pomp and ceremony in 1924 and was, for a while, the tallest structure in the city."
                ));
                imageList.add(new Image(R.drawable.amerfort,
                        "Amer Fort, Jaipur",
                        "Place :  Jaipur",
                        "Famous for :  One of the best tourist place in India",
                        "           Amer Fort (often also spelt \"Amber\") was built as a fortified palace in 1592 by Maharaja Man Singh I and has long served as the capital of Jaipur. Carved high up into the hillside, the fort is accessible on foot via a steep climb or by shuttle rides from the town below (better still, let an elephant do the work)." +
                                " Highlights include Jaleb Chowk, the first courtyard, with its many decorated elephants, and the Shila Devi Temple, dedicated to the goddess of war. Also of note is the adjoining Hall of Public Audience (Diwan-i-Am) with its finely decorated walls and terraces frequented by monkeys."
                ));
                imageList.add(new Image(R.drawable.goabeach ,
                        "The Beaches of Goa",
                        "Place :  Goa",
                        "Famous for :  Loveliest beaches..",
                        "           Long known within India as the \"go-to\" destination for those seeking a great beach holiday, Goa's beautiful western coastline, overlooking the Arabian Sea, has only recently been discovered by tourists from overseas.\n" +
                                "\n" +
                                "           Goa's more than 60 miles of coastline is home to some of the world's loveliest beaches, each with their own particular appeal. For those looking for peace and quiet, isolated Agonda Beach is a good choice, while Calangute Beach is by far the most commercial and crowded."
                ));
                imageList.add(new Image(R.drawable.madurai ,
                        "Periyar National Park and Wildlife Sanctuary, Madurai",
                        "Place :  Madurai",
                        "Famous for :  One of South India's most popular tourist attractions.",
                        "           One of South India's most popular tourist attractions, Periyar National Park and Wildlife Sanctuary is centered around a lake built by British engineers in 1895 for irrigation and to provide water to the city of Madurai. Established in 1934, this beautiful park is home to numerous species of mammals, including a large free-roaming Indian elephant population, wild boar, otters, the lion-tailed macaque, and more than 20 Bengal tigers." +
                                " Bird watching is a popular activity with frequent sightings of species such as darters, storks, kingfishers, hornbills, and racket-tailed drongos, along with many interesting varieties of butterflies."
                ));
        imageList.add(new Image(R.drawable.agrafort,
                "Agra Fort",
                "Place :  Rakabganj, Agra, Uttar Pradesh",
                "Famous for :  Known as Agra's Red Fort.",
                "           Built as a military structure in 1565 by Emperor Akbar with later additions by Shah Jahan, the stunning Agra Fort (also known as Agra's Red Fort) is an interesting mix of both Hindu and Muslim influences. Located a little more than two kilometers from the Taj Mahal, the fort is entered through Amar Singh Gate with its low outer wall and dogleg design built to confuse attackers. Once inside, you'll see two large interlinked sandstone buildings, Akbari Mahal and Jahangiri Mahal, the largest private residence in the complex."
        ));
        imageList.add(new Image(R.drawable.jodhpur,
                "Mehrangarh Fort, Jodhpur",
                "Place :  Fort Road, Jodhpur, Rajasthan",
                "Famous for :   One of the largest fortifications in India.",
                "           Dominating the old city of Jodhpur, the massive Mehrangarh Fort, one of the largest fortifications in India, was built in the 15th century to safeguard the people of the famous \"Blue City,\" as Jodhpur is still known - a name derived from its indigo colored houses, painted blue to deflect the heat."
        ));
        imageList.add(new Image(R.drawable.mahabodhitemple,
                "Mahabodhi Temple, Bodhgaya",
                "Place :  Bodhgaya, Bihar",
                "Famous for :   Considered the world's holiest Buddhist site.",
                "           Bodhgaya, considered the world's holiest Buddhist site, attracts thousands of visitors each year, all drawn to participate with the resident monks in meditation and prayer. The focal point of this place of pilgrimage is stunning Mahabodhi Temple, built next to the very spot where Buddha came to Enlightenment and formulated his philosophy on life. Constructed in the 6th century and restored numerous times since, the temple is topped with a beautiful pyramidal spire and houses a large gilded statue of Buddha."
        ));
        imageList.add(new Image(R.drawable.dandeli1,
                "Dandeli",
                "Place :  Dandeli, Uttara Kannada, Karnataka",
                "Famous for :    Famous for its gorgeous natural backdrop, wildlife and adventure activities.",
                "           Dandeli is one of the top destinations of Karnataka Tourism and one of the must visit tourist destination as part of Goa packages. It is quite famous for its gorgeous natural backdrop, wildlife and adventure activities. Dandeli has a dense forest cover and is one of the best natural habitats in the world. Dandeli Wildlife Sanctuary is the second largest wildlife sanctuary in Karnataka."+
                        "\n"+
                        "           Dandeli is one of the top white-water rafting destinations in India. Kayaking, canyoning, water rafting, overnight rafting or canoeing trips on the Kali River along with other adventure sports like cycling and mountain biking are some of the things one can indulge in here. Dandeli also offers crocodile spotting, nature walks, treks, boating, bird watching and angling trips."
        ));
        imageList.add(new Image(R.drawable.jogfalls,
                "JogFalls",
                "Place :   Shimoga, Karnataka",
                "Famous for :    One of the highest plunge waterfall in India ",
                "           Jog Falls is one of the most beautiful waterfalls in India and one of the top destinations of Karnataka Tourism. This is formed over the Sharavathi River falling from a height of 253 m (830 ft).The Sharavathi River flowing over a very rocky bed about 250 yards wide, 253 m deep and the water comes down in four distinct falls known as Raja, Rani, Rover and Rocket. The four cascades merge to form the huge waterfall. The Raja Fall pours in one unbroken column sheer to the depth of 830 ft. " +
                        "Halfway down it is encountered by the Rover, another fall, which rushes violently downwards to meet the Raja. A third fall, the Rocket, shoots downwards in a series of jets; while the fourth, the Rani, is a quiet fall over the mountain side."
        ));
        imageList.add(new Image(R.drawable.hampi,
                "Hampi",
                "Place :  Hampi, Bellari, Karnataka",
                "Famous for :   Hampi is one of the best heritage sites in India ",
                "           Hampi is an extremely significant place in terms of history and architecture. The first settlement in Hampi dates back to 1st century AD and a number of Buddhist sites belonging to that time have been found nearby. The seat of the Vijayanagara Empire was established by Saint Vidyaranya in 1336 AD with the help of two of his disciples, Hakka Raya and Bukka Raya. The kingdom flourished under the rule of Emperor Krishnadevaraya and stretched over the states of Karnataka, Andhra Pradesh and Maharashtra."
        ));
        imageList.add(new Image(R.drawable.sakaleshpur,
                "Sakaleshpur",
                "Place :  Hassan, Karnataka",
                "Famous for :   Sakleshpur is one of the best hill stations in Karnataka. ",
                "           It Lies in the Malnad region, Sakleshpura is the gateway to Western Ghats from Bengaluru & Hassan side. The town is surrounded by lofty green hills covered with coffee, cardamom, pepper and areca plantations. It is a spectacular town tucked away in the Western Ghats on Bangalore-Mangalore Highway. The beauty of this hill station has even got the name 'Poor Man's Ooty'. Sakleshpur is among the major producers of coffee and cardamom output in India."
        ));
        imageList.add(new Image(R.drawable.sivanasamudra,
                "Sivanasamudra",
                "Place :  Mandya, Karnataka",
                "Famous for :   This is one of the best waterfalls near Bangalore. ",
                "           Situated on River Kaveri, Shivanasamudra is among the popular Tourist places in Karnataka. The island of Shivanasamudra divides Kaveri River into two parts that form two waterfalls, one is Gaganachukki and the other is Bharachukki. Gaganachukki and Barachukki Falls are collectively called as Shivanasamudra Falls though Gaganachukki is most commonly represented as Shivanasamudra Falls. This place offers breathtaking sight in the peak monsoons. Shivanasamudra Falls is among the must include place in your Mysore tour packages."
        ));

        recyclerView = findViewById(R.id.imageRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        ImageAdapter adapter = new ImageAdapter(this, imageList);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogbuilder = new AlertDialog.Builder(this);
        alertDialogbuilder.setTitle("Exit this app...?");
        alertDialogbuilder.setIcon(R.drawable.exit);
        alertDialogbuilder.setMessage("Are you sure you want to exit the app..?");
        alertDialogbuilder.setCancelable(false);
        alertDialogbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();
            }
        });
        alertDialogbuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "App not exiting", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog = alertDialogbuilder.create();
        alertDialog.show();
        alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.green));
        alertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.yellow));
    }

}