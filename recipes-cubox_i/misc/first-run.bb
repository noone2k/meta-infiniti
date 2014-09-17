SUMMARY = "FirstRun - Helper4Cubox"
SECTION = "enigma2/extensions"
#LICENSE = "GPL"
#LIC_FILES_CHKSUM = "file://LICENSE;md5=df0d3422e43cdc6ed4ab44510e339360"
LICENSE = "CLOSED"
PV = "0.1"
PRIORITY = "optional"
PR = "r5"

SRC_URI = "	file://first-run \
"

S = "${WORKDIR}"

#inherit autotools pkgconfig

do_install () {
        install -d "${D}/etc/init.d/"
	install -m 755 "${S}/first-run" "${D}/etc/init.d/"	
	install -d "${D}/etc/rcS.d/"
	cd "${D}/etc/rcS.d/"
	ln -sf ../init.d/first-run S90first-run

	#install -d "${D}/home/root/preinstall"
	#install -m 755 "${S}/enigma2-plugin-extensions-mediaportal_5.4.0_all.ipk"  "${D}/home/root/preinstall"

}

FILES_${PN} += "/"
