SUMMARY = "Linux Firmware for DRXK USB Tuner"
SECTION = "enigma2/extensions"
#LICENSE = "GPL"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=df0d3422e43cdc6ed4ab44510e339360"
LICENSE = "CLOSED"
PV = "0.1"
PRIORITY = "optional"
PR = "r2"

SRC_URI = "	file://dvb-demod-drxk-01.fw \
"

S = "${WORKDIR}"

inherit autotools pkgconfig

do_install () {
	install -d "${D}/lib/firmware"
        install -m 644 "${S}/dvb-demod-drxk-01.fw" "${D}/lib/firmware/"
}

FILES_${PN} += "/"
