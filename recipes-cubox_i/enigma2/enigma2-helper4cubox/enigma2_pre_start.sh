#!/bin/sh

### q&d hacks for video/osd fb
fbset -fb /dev/fb0 "1280x720-50p"
fbset -fb /dev/fb1 "1280x720-50p"
echo 0 > /sys/class/graphics/fb1/blank
/usr/bin/fbalpha 1 g0 128 0xffffffff
/usr/bin/fbalpha 1 g1 128 0xffffffff

### stb related
lsmod | grep -q stb_procfs     || modprobe stb_procfs
lsmod | grep -q stb_nimsockets || modprobe stb_nimsockets
/usr/bin/create_nimsockets

### ir
lsmod | grep -q gpio_ir_recv || modprobe gpio-ir-recv
RCNAM=gpio_ir_recv
RCMAP=hauppauge
RCDEV=`find /sys/class/rc/rc*/ -name name -exec grep -l $RCNAM {} \; | sed -e 's/.*rc\///' -e 's/\/.*//'`
ir-keytable -s $RCDEV -c -w /lib/udev/rc_keymaps/$RCMAP

