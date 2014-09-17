SUMMARY = "rpi-wiggle"
SECTION = "enigma2/extensions"
#LICENSE = "GPL"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=df0d3422e43cdc6ed4ab44510e339360"
LICENSE = "CLOSED"
PV = "0.1"
PRIORITY = "optional"
PR = "r5"

SRC_URI = "	file://rpi-wiggle"

S = "${WORKDIR}"

#inherit autotools pkgconfig

do_install () {
        install -d "${D}/etc/init.d/"
	install -m 755 "${S}/rpi-wiggle" "${D}/etc/init.d/"
	install -d "${D}/etc/rcS.d/"
	cd "${D}/etc/rcS.d/"
	ln -sf ../init.d/rpi-wiggle S80rpi-wiggle
}

FILES_${PN} += "/"
