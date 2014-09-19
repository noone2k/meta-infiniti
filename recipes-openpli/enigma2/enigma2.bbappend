PR="r100"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

DEPENDS_append = " gstreamer1.0-plugins-base gstreamer1.0 "

SRC_URI_mx6 = "git://github.com/noone2k/openpli-enigma2.git"

EXTRA_OECONF += " \
		--with-gstversion=1.0 \
"

do_configure_append() {
	sed -e 's/-Wl,--as-needed//' -i ${S}/../build/main/Makefile
}
