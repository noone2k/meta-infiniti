PR="r100"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 += " \
		file://_001_change_to_fb1.patch \
		file://_010_servicemp3_remove_dvbsink_find.patch \
		file://_011_servicemp3_cast_len.patch \
"

EXTRA_OECONF += " \
		--with-gstversion=1.0 \
"

do_configure_append() {
	sed -e 's/-Wl,--as-needed//' -i ${S}/../build/main/Makefile
}
