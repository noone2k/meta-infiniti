DESCRIPTION = "libdvbcsa"
MAINTAINER = "VideoLan <info@videolan.org>"

require conf/license/license-gplv2.inc

PV = "1.10+svn${SRCPV}"
PR = "r0"
SRCREV = "19"

inherit autotools pkgconfig

S = "${WORKDIR}/trunk"

SRC_URI = "svn://svn.videolan.org/libdvbcsa;module=trunk;protocol=svn"

