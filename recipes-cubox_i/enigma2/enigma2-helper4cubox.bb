SUMMARY = "Enigma2 Helper4Cubox"
SECTION = "enigma2/extensions"
#LICENSE = "GPL"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=df0d3422e43cdc6ed4ab44510e339360"
LICENSE = "CLOSED"
PV = "0.1"
PRIORITY = "optional"
PR = "r3"

SRC_URI = "	file://create_nimsockets \
		file://enigma2_pre_start.sh \
		file://fbalpha \
		file://settings \
		file://fb.modes \
"

S = "${WORKDIR}"

inherit autotools pkgconfig

do_install () {
        install -d "${D}/usr/bin/"
        install -m 755 "${S}/create_nimsockets" "${D}/usr/bin/"
        install -m 755 "${S}/fbalpha" "${D}/usr/bin/"
        install -m 755 "${S}/enigma2_pre_start.sh" "${D}/usr/bin/"
	install -d "${D}/etc/"
	install -m 644 "${S}/fb.modes" "${D}/etc/"
	install -d "${D}/etc/enigma2/"
	install -m 644 "${S}/settings" "${D}/etc/enigma2/"
}

FILES_${PN} += "/"
