SUMMARY = "BRCM4330 Helper4Cubox"
SECTION = "enigma2/extensions"
#LICENSE = "GPL"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=df0d3422e43cdc6ed4ab44510e339360"
LICENSE = "CLOSED"
PV = "0.1"
PRIORITY = "optional"
PR = "r2"

SRC_URI = "	file://brcm4330_default \
		file://brcm4330-patch \
		file://bcm4329.hcd \
		file://bcm4330.hcd \
		file://brcm_patchram_plus \
"

S = "${WORKDIR}"

inherit autotools pkgconfig

do_install () {
	install -d "${D}/usr/bin"
	install -m 755 "${S}/brcm_patchram_plus" "${D}/usr/bin"
        install -d "${D}/etc/init.d"
        install -m 755 "${S}/brcm4330-patch" "${D}/etc/init.d"
        install -d "${D}/etc/rc3.d"
        cd "${D}/etc/rc3.d"
        ln -sf ../init.d/brcm4330-patch S09brcm4330-patch

        install -d "${D}/etc/default"
        install -m 644 "${S}/brcm4330_default" "${D}/etc/default/brcm4330"
	install -d "${D}/lib/firmware/brcm"
	install -m 644 "${S}/bcm4329.hcd" "${D}/lib/firmware/brcm/"
        install -m 644 "${S}/bcm4330.hcd" "${D}/lib/firmware/brcm/"
}

FILES_${PN} += "/"
