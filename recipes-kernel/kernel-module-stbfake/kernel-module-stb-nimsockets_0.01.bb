# Copyright (C) 2013 infiniti
SUMMARY = "STB-FAKE nimsockets module"
LICENSE = "none"
LIC_FILES_CHKSUM = "file://Makefile;md5=d63106dda085096e9ba68dd3677a987a"

PR = "r0"

inherit module

SRC_URI = "file://stb-nimsockets.c \
	   file://stb-nimsockets.h \
	   file://Makefile \
"

S = "${WORKDIR}"

COMPATIBLE_MACHINE = "(cubox-i)"

do_install() {
	install -d ${D}${base_libdir}/modules/${KERNEL_VERSION}/extra
	install -m 0644 ${S}/stb-nimsockets.ko* ${D}${base_libdir}/modules/${KERNEL_VERSION}/extra
}
