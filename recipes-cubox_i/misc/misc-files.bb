SUMMARY = "MISC Helper4Cubox"
SECTION = "enigma2/extensions"
#LICENSE = "GPL"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=df0d3422e43cdc6ed4ab44510e339360"
LICENSE = "CLOSED"
PV = "0.1"
PRIORITY = "optional"
PR = "r1"

SRC_URI = "	file://.profile \
"

S = "${WORKDIR}"

inherit autotools pkgconfig

do_install () {
        install -d "${D}/home/root/"
        install -m 644 "${S}/.profile" "${D}/home/root/"
}

FILES_${PN} += "/"
