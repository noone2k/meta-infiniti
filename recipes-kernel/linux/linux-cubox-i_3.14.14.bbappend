PR="r101"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRCREV = "06c3dc6096ea15f146daa174d1efaf822c760321"

SRC_URI_append_mx6 += " \
                file://_defconfig_add_firmware.patch \
		file://brcmfmac4329-sdio.bin.ihex \
                file://brcmfmac4329-sdio.txt.ihex \
                file://brcmfmac4330-sdio.bin.ihex \
                file://brcmfmac4330-sdio.txt.ihex \
"

do_configure_append() {
        install -d "${S}/firmware/brcm/"
        install -m 644 "${S}/../brcmfmac4329-sdio.bin.ihex" "${S}/firmware/brcm/"
        install -m 644 "${S}/../brcmfmac4329-sdio.txt.ihex" "${S}/firmware/brcm/"
        install -m 644 "${S}/../brcmfmac4330-sdio.bin.ihex" "${S}/firmware/brcm/"
        install -m 644 "${S}/../brcmfmac4330-sdio.txt.ihex" "${S}/firmware/brcm/"
}
