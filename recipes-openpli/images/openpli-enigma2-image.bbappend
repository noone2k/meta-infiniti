# addtional image features/packges for my custom image

PR = "r102"

DEPENDS_append = " enigma2-skins "
DEPENDS_append = " libav "


### cubox stb/e2 related
IMAGE_INSTALL += " \
	kernel-module-stb-nimsockets \
	kernel-module-stb-procfs \
	enigma2-helper4cubox \
	dvbhelper \
	misc-files \
	first-run \
	rpi-wiggle \
	alsa-utils-alsamixer \
	alsa-utils-amixer \
	alsa-utils-aplay \
"

### cubox related
IMAGE_INSTALL += " \
	libclc-mx6  \
	libegl-mx6 \
	libgal-mx6 \
	libgles-mx6 \
	libgles2-mx6 \
	libglslc-mx6 \
	libopencl-mx6 \
	libopenvg-mx6  \
	libvdk-mx6 \
	libvivante-mx6 \
	linux-firmware-bcm4330 \
	brcm4330-helper \
"
### temp remove
# gpu-viv-bin-mx6q
# kernel-firmware-sdma-imx6q 
# libvivante-dri-mx6 
# libgl-mx6 

### enigma2 related / skins / plugins / python
IMAGE_INSTALL += " \
	enigma2-plugin-skins-dmconcinnity-hd \
	enigma2-plugin-skins-dmm-hd \
	enigma2-plugin-skins-dreammm-hd \
	python-mechanize \
	python-robotparser \
	python-html \
	python-gdata \
"

### rc / ir / input / event / support
IMAGE_INSTALL += " \
	libv4l \
	v4l-utils \
	rc-keymaps \
	evtest \
"

### misc tools/utilities
IMAGE_INSTALL += " \
	file lsof \
	dvb-apps dvb-azap dvb-czap dvb-tzap dvb-zap-data dvb-scan dvb-scan-data dvb-szap \
	dvbapp-tests dvbdate dvbnet dvbtraffic dvb-femon \
	libav alsa-utils-aplay \
	parted util-linux-fdisk e2fsprogs \
	rpi-wiggle first-run \
	"
#	libdvbapi libdvbcfg libdvben50221 libdvbsec 



### gst 1.0 
include openpli-enigma2-image-gst1.0.inc

