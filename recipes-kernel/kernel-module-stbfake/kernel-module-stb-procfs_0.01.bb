# Copyright (C) 2013 infiniti
SUMMARY = "STB-FAKE procfs module"
LICENSE = "none"
LIC_FILES_CHKSUM = "file://Makefile;md5=76eb945239233d045af99c1fd767472d"

PR = "r1"

inherit module

SRC_URI = "file://stb-procfs.c \
	   file://stb-procfs.h \
	   file://Makefile \
"

S = "${WORKDIR}"

COMPATIBLE_MACHINE = "(cubox-i)"

do_install() {
	install -d ${D}${base_libdir}/modules/${KERNEL_VERSION}/extra
	install -m 0644 ${S}/stb-procfs.ko* ${D}${base_libdir}/modules/${KERNEL_VERSION}/extra
}
