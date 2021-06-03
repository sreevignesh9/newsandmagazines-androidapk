package com.example.newsandmagazines.ui.dashboard;

public class Magazine {
        private String title;
//        private String tail_text;
        private int cur_image;

        // Constructor
        public Magazine(String title, int cur_image) {
            this.title = title;
//            this.tail_text = tail_text;
            this.cur_image = cur_image;
        }

        // Getter and Setter
        public String gettitle() {
            return title;
        }

        public void settitle(String title) {
            this.title = title;
        }

//        public String gettail_text() {
//            return tail_text;
//        }

//        public void settail_text(String tailtext) {
//            this.tail_text = tailtext;
//        }

        public int getcur_image() {
            return cur_image;
        }

        public void setcur_image(int cur_image) {
            this.cur_image = cur_image;
        }
}

