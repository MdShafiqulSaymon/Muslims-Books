package com.saymon.muslimsbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class PDFreader extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_freader);


        WebView webview=findViewById(R.id.webview);
        ProgressBar progressber =findViewById(R.id.progressber);

        progressber.setVisibility(View.VISIBLE);

        String git=getIntent().getStringExtra("file");
        String d1="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-1-pdf.pdf";
        String d2="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-2-pdf.pdf";
        String d3="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-3-pdf.pdf";
        String d4="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-4-pdf.pdf";
        String d5="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-5-pdf.pdf";
        String d6="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-6-pdf.pdf";
        String d7="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-7-pdf.pdf";
        String d8="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-8-pdf.pdf";
        String d9="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-9-pdf.pdf";
        String d10="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-10-pdf.pdf";
        String d11="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-11-pdf.pdf";
        String d12="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-12-pdf.pdf";
        String d13="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-13-pdf.pdf";
        String d14="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-14-pdf.pdf";
        String d15="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-15-pdf.pdf";
        String d16="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-16-pdf.pdf";
        String d17="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-17-pdf.pdf";
        String d18="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-18-pdf.pdf";
        String d19="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-19-pdf.pdf";
        String d20="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-20-pdf.pdf";
        String d21="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-21-pdf.pdf";
        String d22="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-22-pdf.pdf";
        String d23="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-23-pdf.pdf";
        String d24="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-24-pdf.pdf";
        String d25="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-25-pdf.pdf";
        String d26="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-26-pdf.pdf";
        String d27="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-27-pdf.pdf";
        String d28="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-28-pdf.pdf";
        String d29="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-29-pdf.pdf";
        String d30="https://islamic1articleshome.files.wordpress.com/2020/05/13-line-tajwidi-quran-sipara-30-pdf.pdf";
        String q1="https://quranindex.info/surah/al-faatiha";
        String q2="https://quranindex.info/surah/al-baqara";
        String url =null;
        if(git.equals("১ম পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d1;
        }
        else if(git.equals("২ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d2;
        }
        else if(git.equals("৩ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d3;
        }
        else if(git.equals("৪ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d4;
        }
        else if(git.equals("৫ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d5;
        }
        else if(git.equals("৬ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d6;
        }
        else if(git.equals("৭ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d7;
        }
        else if(git.equals("৮ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d8;
        }
        else if(git.equals("৯ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d9;
        }
        else if(git.equals("১০ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d10;
        }
        else if(git.equals("১১ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d11;
        }
        else if(git.equals("১২ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d12;
        }
        else if(git.equals("১৩ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d13;
        }
        else if(git.equals("১৪ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d14;
        }
        else if(git.equals("১৫ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d15;
        }
        else if(git.equals("১৬ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d16;
        }
        else if(git.equals("১৭ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d17;
        }
        else if(git.equals("১৮ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d18;
        }
        else if(git.equals("১৯ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d19;
        }
        else if(git.equals("২০ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d20;
        }
        else if(git.equals("২১ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d21;
        }
        else if(git.equals("২২ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d22;
        }
        else if(git.equals("২৩ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d23;
        }
        else if(git.equals("২৪ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d24;
        }
        else if(git.equals("২৫ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d25;
        }
        else if(git.equals("২৬ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d26;
        }
        else if(git.equals("২৭ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d27;
        }
        else if(git.equals("২৮ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d28;
        }
        else if(git.equals("২৯ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d29;
        }
        else if(git.equals("৩০ পারা"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+d30;
        }
        else if(git.equals("1"))
        {
            url="https://quranindex.info/surah/al-faatiha";
        }
        else if(git.equals("2"))
        {
            url="https://quranindex.info/surah/al-baqara";
        }
        else if(git.equals("3"))
        {
            url="https://quranindex.info/surah/al-imraan";
        }
        else if(git.equals("4"))
        {
            url="https://quranindex.info/surah/an-nisaa";
        }
        else if(git.equals("5"))
        {
            url="https://quranindex.info/surah/al-maaida";
        }
        else if(git.equals("6"))
        {
            url="https://quranindex.info/surah/al-anaam";
        }
        else if(git.equals("7"))
        {
            url="https://quranindex.info/surah/al-araaf";
        }
        else if(git.equals("8"))
        {
            url="https://quranindex.info/surah/al-anfaal";
        }
        else if(git.equals("9"))
        {
            url="https://quranindex.info/surah/at-tawba";
        }
        else if(git.equals("10"))
        {
            url="https://quranindex.info/surah/yunus";
        }
        //10

        else if(git.equals("11"))
        {
            url="https://quranindex.info/surah/hud";
        }
        else if(git.equals("12"))
        {
            url="https://quranindex.info/surah/yusuf";
        }
        else if(git.equals("13"))
        {
            url="https://quranindex.info/surah/ar-rad";
        }
        else if(git.equals("14"))
        {
            url="https://quranindex.info/surah/ibrahim";
        }
        else if(git.equals("15"))
        {
            url="https://quranindex.info/surah/al-hijr";
        }
        else if(git.equals("16"))
        {
            url="https://quranindex.info/surah/an-nahl";
        }
        else if(git.equals("17"))
        {
            url="https://quranindex.info/surah/al-israa";
        }
        else if(git.equals("18"))
        {
            url="https://quranindex.info/surah/al-kahf";
        }
        else if(git.equals("19"))
        {
            url="https://quranindex.info/surah/maryam";
        }
        else if(git.equals("20"))
        {
            url="https://quranindex.info/surah/taa-haa";
        }
        //20

        else if(git.equals("21"))
        {
            url="https://quranindex.info/surah/al-anbiyaa";
        }
        else if(git.equals("22"))
        {
            url="https://quranindex.info/surah/al-hajj";
        }
        else if(git.equals("23"))
        {
            url="https://quranindex.info/surah/al-muminoon";
        }
        else if(git.equals("24"))
        {
            url="https://quranindex.info/surah/an-noor";
        }
        else if(git.equals("25"))
        {
            url="https://quranindex.info/surah/al-furqaan";
        }
        else if(git.equals("26"))
        {
            url="https://quranindex.info/surah/ash-shuaraa";
        }
        else if(git.equals("27"))
        {
            url="https://quranindex.info/surah/an-naml";
        }
        else if(git.equals("28"))
        {
            url="https://quranindex.info/surah/al-qasas";
        }
        else if(git.equals("29"))
        {
            url="https://quranindex.info/surah/al-ankaboot";
        }
        else if(git.equals("30"))
        {
            url="https://quranindex.info/surah/ar-room";
        }
        //30


        else if(git.equals("31"))
        {
            url="https://quranindex.info/surah/luqman";
        }
        else if(git.equals("32"))
        {
            url="https://quranindex.info/surah/as-sajda";
        }
        else if(git.equals("33"))
        {
            url="https://quranindex.info/surah/al-ahzaab";
        }
        else if(git.equals("34"))
        {
            url="https://quranindex.info/surah/saba";
        }
        else if(git.equals("35"))
        {
            url="https://quranindex.info/surah/faatir";
        }
        else if(git.equals("36"))
        {
            url="https://quranindex.info/surah/yaseen";
        }
        else if(git.equals("37"))
        {
            url="https://quranindex.info/surah/as-saaffaat";
        }
        else if(git.equals("38"))
        {
            url="https://quranindex.info/surah/saad";
        }
        else if(git.equals("39"))
        {
            url="https://quranindex.info/surah/az-zumar";
        }
        else if(git.equals("40"))
        {
            url="https://quranindex.info/surah/ghaafir";
        }
        //40

        else if(git.equals("41"))
        {
            url="https://quranindex.info/surah/fussilat";
        }
        else if(git.equals("42"))
        {
            url="https://quranindex.info/surah/ash-shura";
        }
        else if(git.equals("43"))
        {
            url="https://quranindex.info/surah/az-zukhruf";
        }
        else if(git.equals("44"))
        {
            url="https://quranindex.info/surah/ad-dukhaan";
        }
        else if(git.equals("45"))
        {
            url="https://quranindex.info/surah/al-jaathiya";
        }
        else if(git.equals("46"))
        {
            url="https://quranindex.info/surah/al-ahqaf";
        }
        else if(git.equals("47"))
        {
            url="https://quranindex.info/surah/muhammad";
        }
        else if(git.equals("48"))
        {
            url="https://quranindex.info/surah/al-fath";
        }
        else if(git.equals("49"))
        {
            url="https://quranindex.info/surah/al-hujuraat";
        }
        else if(git.equals("50"))
        {
            url="https://quranindex.info/surah/qaaf";
        }
        //50

        else if(git.equals("51"))
        {
            url="https://quranindex.info/surah/adh-dhaariyat";
        }
        else if(git.equals("52"))
        {
            url="https://quranindex.info/surah/at-tur";
        }
        else if(git.equals("53"))
        {
            url="https://quranindex.info/surah/an-najm";
        }
        else if(git.equals("54"))
        {
            url="https://quranindex.info/surah/al-qamar";
        }
        else if(git.equals("55"))
        {
            url="https://quranindex.info/surah/ar-rahmaan";
        }
        else if(git.equals("56"))
        {
            url="https://quranindex.info/surah/al-waaqia";
        }
        else if(git.equals("57"))
        {
            url="https://quranindex.info/surah/al-hadid";
        }
        else if(git.equals("58"))
        {
            url="https://quranindex.info/surah/al-mujaadila";
        }
        else if(git.equals("59"))
        {
            url="https://quranindex.info/surah/al-hashr";
        }
        else if(git.equals("60"))
        {
            url="https://quranindex.info/surah/al-mumtahana";
        }
        //60

        else if(git.equals("61"))
        {
            url="https://quranindex.info/surah/as-saff";
        }
        else if(git.equals("62"))
        {
            url="https://quranindex.info/surah/al-jumua";
        }
        else if(git.equals("63"))
        {
            url="https://quranindex.info/surah/al-munaafiqoon";
        }
        else if(git.equals("64"))
        {
            url="https://quranindex.info/surah/at-taghaabun";
        }
        else if(git.equals("65"))
        {
            url="https://quranindex.info/surah/at-talaaq";
        }
        else if(git.equals("66"))
        {
            url="https://quranindex.info/surah/at-tahrim";
        }
        else if(git.equals("67"))
        {
            url="https://quranindex.info/surah/al-mulk";
        }
        else if(git.equals("68"))
        {
            url="https://quranindex.info/surah/al-qalam";
        }
        else if(git.equals("69"))
        {
            url="https://quranindex.info/surah/al-haaqqa";
        }
        else if(git.equals("70"))
        {
            url="https://quranindex.info/surah/al-maaarij";
        }
        //70

        else if(git.equals("71"))
        {
            url="https://quranindex.info/surah/nooh";
        }
        else if(git.equals("72"))
        {
            url="https://quranindex.info/surah/al-jinn";
        }
        else if(git.equals("73"))
        {
            url="https://quranindex.info/surah/al-muzzammil";
        }
        else if(git.equals("74"))
        {
            url="https://quranindex.info/surah/al-muddaththir";
        }
        else if(git.equals("75"))
        {
            url="https://quranindex.info/surah/al-qiyaama";
        }
        else if(git.equals("76"))
        {
            url="https://quranindex.info/surah/al-insaan";
        }
        else if(git.equals("77"))
        {
            url="https://quranindex.info/surah/al-mursalaat";
        }
        else if(git.equals("78"))
        {
            url="https://quranindex.info/surah/an-naba";
        }
        else if(git.equals("79"))
        {
            url="https://quranindex.info/surah/an-naaziaat";
        }
        else if(git.equals("80"))
        {
            url="https://quranindex.info/surah/abasa";
        }
        //80

        else if(git.equals("81"))
        {
            url="https://quranindex.info/surah/at-takwir";
        }
        else if(git.equals("82"))
        {
            url="https://quranindex.info/surah/al-infitaar";
        }
        else if(git.equals("83"))
        {
            url="https://quranindex.info/surah/al-mutaffifin";
        }
        else if(git.equals("84"))
        {
            url="https://quranindex.info/surah/al-inshiqaaq";
        }
        else if(git.equals("85"))
        {
            url="https://quranindex.info/surah/al-burooj";
        }
        else if(git.equals("86"))
        {
            url="https://quranindex.info/surah/at-taariq";
        }
        else if(git.equals("87"))
        {
            url="https://quranindex.info/surah/al-alaa";
        }
        else if(git.equals("88"))
        {
            url="https://quranindex.info/surah/al-ghaashiya";
        }
        else if(git.equals("89"))
        {
            url="https://quranindex.info/surah/al-fajr";
        }
        else if(git.equals("90"))
        {
            url="https://quranindex.info/surah/al-balad";
        }
        //90

        else if(git.equals("91"))
        {
            url="https://quranindex.info/surah/ash-shams";
        }
        else if(git.equals("92"))
        {
            url="https://quranindex.info/surah/al-lail";
        }
        else if(git.equals("93"))
        {
            url="https://quranindex.info/surah/ad-dhuhaa";
        }
        else if(git.equals("94"))
        {
            url="https://quranindex.info/surah/ash-sharh";
        }
        else if(git.equals("95"))
        {
            url="https://quranindex.info/surah/at-tin";
        }
        else if(git.equals("96"))
        {
            url="https://quranindex.info/surah/al-alaq";
        }
        else if(git.equals("97"))
        {
            url="https://quranindex.info/surah/al-qadr";
        }
        else if(git.equals("98"))
        {
            url="https://quranindex.info/surah/al-bayyina";
        }
        else if(git.equals("99"))
        {
            url="https://quranindex.info/surah/az-zalzala";
        }
        else if(git.equals("100"))
        {
            url="https://quranindex.info/surah/al-aadiyaat";
        }
        //100

        else if(git.equals("101"))
        {
            url="https://quranindex.info/surah/al-qaaria";
        }
        else if(git.equals("102"))
        {
            url="https://quranindex.info/surah/at-takaathur";
        }
        else if(git.equals("103"))
        {
            url="https://quranindex.info/surah/al-asr";
        }
        else if(git.equals("104"))
        {
            url="https://quranindex.info/surah/al-humaza";
        }
        else if(git.equals("105"))
        {
            url="https://quranindex.info/surah/al-fil";
        }
        else if(git.equals("106"))
        {
            url="https://quranindex.info/surah/quraish";
        }
        else if(git.equals("107"))
        {
            url="https://quranindex.info/surah/al-maaun";
        }
        else if(git.equals("108"))
        {
            url="https://quranindex.info/surah/al-kawthar";
        }
        else if(git.equals("109"))
        {
            url="https://quranindex.info/surah/al-kaafiroon";
        }
        else if(git.equals("110"))
        {
            url="https://quranindex.info/surah/an-nasr";
        }
        //110

        else if(git.equals("111"))
        {
            url="https://quranindex.info/surah/al-masad";
        }
        else if(git.equals("112"))
        {
            url="https://quranindex.info/surah/al-ikhlaas";
        }
        else if(git.equals("113"))
        {
            url="https://quranindex.info/surah/al-falaq";
        }
        else if(git.equals("114"))
        {
            url="https://quranindex.info/surah/an-naas";
        }

        //hadis


        else if(git.equals("bukhari1"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=198";
        }
        else if(git.equals("bukhari2"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=199";
        }
        else if(git.equals("bukhari3"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=200";
        }
        else if(git.equals("bukhari4"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=220";
        }
        else if(git.equals("bukhari5"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=225";
        }
        else if(git.equals("bukhari6"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=232";
        }
        else if(git.equals("bukhari7"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=234";
        }
        else if(git.equals("bukhari8"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=235";
        }
        else if(git.equals("bukhari9"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=236";
        }
        else if(git.equals("bukhari10"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=237";
        }
        //10

        else if(git.equals("bukhari11"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=238";
        }
        else if(git.equals("bukhari12"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=239";
        }
        else if(git.equals("bukhari13"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=240";
        }
        else if(git.equals("bukhari14"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=241";
        }
        else if(git.equals("bukhari15"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=242";
        }
        else if(git.equals("bukhari16"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=243";
        }
        else if(git.equals("bukhari17"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=244";
        }
        else if(git.equals("bukhari18"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=245";
        }
        else if(git.equals("bukhari19"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=345";
        }
        else if(git.equals("bukhari20"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=246";
        }
        //20

        else if(git.equals("bukhari21"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=247";
        }
        else if(git.equals("bukhari22"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=248";
        }
        else if(git.equals("bukhari23"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=249";
        }
        else if(git.equals("bukhari24"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=251";
        }
        else if(git.equals("bukhari25"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=252";
        }
        else if(git.equals("bukhari26"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=253";
        }
        else if(git.equals("bukhari27"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=254";
        }
        else if(git.equals("bukhari28"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=255";
        }
        else if(git.equals("bukhari29"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=256";
        }
        else if(git.equals("bukhari30"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=257";
        }
        //30


        else if(git.equals("bukhari31"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=258";
        }
        else if(git.equals("bukhari32"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=259";
        }
        else if(git.equals("bukhari33"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=260";
        }
        else if(git.equals("bukhari34"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=261";
        }
        else if(git.equals("bukhari35"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=263";
        }
        else if(git.equals("bukhari36"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=264";
        }
        else if(git.equals("bukhari37"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=265";
        }
        else if(git.equals("bukhari38"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=266";
        }
        else if(git.equals("bukhari39"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=267";
        }
        else if(git.equals("bukhari40"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=268";
        }
        //40

        else if(git.equals("bukhari41"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=269";
        }
        else if(git.equals("bukhari42"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=270";
        }
        else if(git.equals("bukhari43"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=271";
        }
        else if(git.equals("bukhari44"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=272";
        }
        else if(git.equals("bukhari45"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=273";
        }
        else if(git.equals("bukhari46"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=274";
        }
        else if(git.equals("bukhari47"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=275";
        }
        else if(git.equals("bukhari48"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=277";
        }
        else if(git.equals("bukhari49"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=278";
        }
        else if(git.equals("bukhari50"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=279";
        }
        //50

        else if(git.equals("bukhari51"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=280";
        }
        else if(git.equals("bukhari52"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=281";
        }
        else if(git.equals("bukhari53"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=283";
        }
        else if(git.equals("bukhari54"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=284";
        }
        else if(git.equals("bukhari55"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=285";
        }
        else if(git.equals("bukhari56"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=286";
        }
        else if(git.equals("bukhari57"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=293";
        }
        else if(git.equals("bukhari58"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=294";
        }
        else if(git.equals("bukhari59"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=295";
        }
        else if(git.equals("bukhari60"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=296";
        }
        //60

        else if(git.equals("bukhari61"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=297";
        }
        else if(git.equals("bukhari62"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=303";
        }
        else if(git.equals("bukhari63"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=305";
        }
        else if(git.equals("bukhari64"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=306";
        }
        else if(git.equals("bukhari65"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=310";
        }
        else if(git.equals("bukhari66"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=311";
        }
        else if(git.equals("bukhari67"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=312";
        }
        else if(git.equals("bukhari68"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=313";
        }
        else if(git.equals("bukhari69"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=314";
        }
        else if(git.equals("bukhari70"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=315";
        }
        //70

        else if(git.equals("bukhari71"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=316";
        }
        else if(git.equals("bukhari72"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=317";
        }
        else if(git.equals("bukhari73"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=318";
        }
        else if(git.equals("bukhari74"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=319";
        }
        else if(git.equals("bukhari75"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=320";
        }
        else if(git.equals("bukhari76"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=321";
        }
        else if(git.equals("bukhari77"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=322";
        }
        else if(git.equals("bukhari78"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=323";
        }
        else if(git.equals("bukhari79"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=324";
        }
        else if(git.equals("bukhari80"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=325";
        }
        //80

        else if(git.equals("bukhari81"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=326";
        }
        else if(git.equals("bukhari82"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=327";
        }
        else if(git.equals("bukhari83"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=328";
        }
        else if(git.equals("bukhari84"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=329";
        }
        else if(git.equals("bukhari85"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=330";
        }
        else if(git.equals("bukhari86"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=331";
        }
        else if(git.equals("bukhari87"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=332";
        }
        else if(git.equals("bukhari88"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=333";
        }
        else if(git.equals("bukhari89"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=334";
        }
        else if(git.equals("bukhari90"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=335";
        }
        //90

        else if(git.equals("bukhari91"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=336";
        }
        else if(git.equals("bukhari92"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=337";
        }
        else if(git.equals("bukhari93"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=338";
        }
        else if(git.equals("bukhari94"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=339";
        }
        else if(git.equals("bukhari95"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=340";
        }
        else if(git.equals("bukhari96"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=341";
        }
        else if(git.equals("bukhari97"))
        {
            url="https://www.hadithbd.com/hadith/detail/?book=12&section=342";
        }


        //full_quran
        else if(git.equals("full_quran"))
        {
            url="https://drive.google.com/viewerng/viewer?embedded=true&url="+"https://quranindex.info/download/Arabic-Quran.pdf";
        }
        //Namaz


        else if(git.equals("namaz1"))
        {
            url="https://www.hadithbd.com/books/detail/?book=67&section=985";
        }
        else if(git.equals("namaz2"))
        {
            url="https://www.hadithbd.com/books/detail/?book=67&section=986";
        }
        else if(git.equals("namaz3"))
        {
            url="https://www.hadithbd.com/books/detail/?book=67&section=987";
        }
        else if(git.equals("namaz4"))
        {
            url="https://www.hadithbd.com/books/detail/?book=67&section=988";
        }
        else if(git.equals("namaz5"))
        {
            url="https://www.hadithbd.com/books/detail/?book=67&section=989";
        }
        else if(git.equals("namaz6"))
        {
            url="https://www.hadithbd.com/books/detail/?book=67&section=990";
        }
        else if(git.equals("namaz7"))
        {
            url="https://www.hadithbd.com/books/detail/?book=67&section=991";
        }
        else if(git.equals("namaz8"))
        {
            url="https://www.hadithbd.com/books/detail/?book=67&section=992";
        }
        else if(git.equals("namaz9"))
        {
            url="https://www.hadithbd.com/books/detail/?book=67&section=993";
        }
        else if(git.equals("namaz10"))
        {
            url="https://www.hadithbd.com/books/detail/?book=67&section=994";
        }
        //dua
        else if(git.equals("DUA"))
        {
            url="https://www.hadithbd.com/books/detail/?book=67&section=995";
        }

        //Jiboni...

        else if(git.equals("nobider_jiboni1"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=253";
        }
        else if(git.equals("nobider_jiboni2"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=254";
        }
        else if(git.equals("nobider_jiboni3"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=255";
        }
        else if(git.equals("nobider_jiboni4"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=256";
        }
        else if(git.equals("nobider_jiboni5"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=257";
        }
        else if(git.equals("nobider_jiboni6"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=339";
        }
        else if(git.equals("nobider_jiboni7"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=340";
        }
        else if(git.equals("nobider_jiboni8"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=341";
        }
        else if(git.equals("nobider_jiboni9"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=342";
        }
        else if(git.equals("nobider_jiboni10"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=343";
        }
        //10

        else if(git.equals("nobider_jiboni11"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=344";
        }
        else if(git.equals("nobider_jiboni12"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=345";
        }
        else if(git.equals("nobider_jiboni13"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=346";
        }
        else if(git.equals("nobider_jiboni14"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=347";
        }
        else if(git.equals("nobider_jiboni16"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=348";
        }
        else if(git.equals("nobider_jiboni17"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=349";
        }
        else if(git.equals("nobider_jiboni18"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=350";
        }
        else if(git.equals("nobider_jiboni19"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=351";
        }
        else if(git.equals("nobider_jiboni20"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=352";
        }
        //20

        else if(git.equals("nobider_jiboni21"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=353";
        }
        else if(git.equals("nobider_jiboni22"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=354";
        }
        else if(git.equals("nobider_jiboni24"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=355";
        }
        else if(git.equals("nobider_jiboni25"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=435";
        }
        else if(git.equals("nobider_jiboni25m"))
        {
            url="https://www.hadithbd.com/books/detail/?book=15&section=458";
        }



        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                if(newProgress==100){
                    progressber.setVisibility(View.GONE);
                }
            }
        });
        webview.loadUrl(url);

    }
}