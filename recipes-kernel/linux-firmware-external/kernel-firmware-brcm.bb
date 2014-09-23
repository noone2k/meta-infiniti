SUMMARY = "Linux Firmware for BRCM43XX BT/WIFI"
SECTION = "enigma2/extensions"
#LICENSE = "GPL"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=df0d3422e43cdc6ed4ab44510e339360"
LICENSE = "CLOSED"
PV = "0.1"
PRIORITY = "optional"
PR = "r2"

SRC_URI = "	file://bcm4329.hcd \
		file://bcm4330.hcd \
"

S = "${WORKDIR}"

#inherit autotools pkgconfig

do_install () {
	install -d "${D}/lib/firmware/brcm/"
        install -m 644 "${S}/bcm4329.hcd" "${D}/lib/firmware/brcm/"
        install -m 644 "${S}/bcm4330.hcd" "${D}/lib/firmware/brcm/"
}

FILES_${PN} += "/"
