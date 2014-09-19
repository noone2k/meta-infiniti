
do_configure_prepend() {
	sed -e 's/GSTREAMER, gstreamer-0.10 gstreamer-pbutils-0.10/GSTREAMER, gstreamer-1.0 gstreamer-pbutils-1.0/' -i configure.ac
	sed -e '/merlinmusicplayer/d' -i Makefile.am
}

