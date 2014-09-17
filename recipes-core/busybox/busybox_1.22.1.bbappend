do_configure_prepend() {
    sed -e 's/.*CONFIG_BLOCKDEV.*/CONFIG_BLOCKDEV=y/' -i ${WORKDIR}/defconfig
}
