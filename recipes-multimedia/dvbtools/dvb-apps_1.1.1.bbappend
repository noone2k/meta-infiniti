FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_mx6 += " \
		file://001_remove_test_video.patch \
"

