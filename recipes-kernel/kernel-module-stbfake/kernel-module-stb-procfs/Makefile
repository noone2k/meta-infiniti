obj-m += stb-procfs.o

#KDIR=/usr/src/linux-headers-3.10-2-amd64/
#KDIR=/usr/src/linux-headers-$(shell uname -r)/
#KDIR=/development/hummingboard/openpli40/openpli-oe-core/build/tmp/sysroots/cubox-i/usr/include/linux/
KDIR=/development/hummingboard/openpli40/openpli-oe-core/build/tmp/sysroots/cubox-i/usr/src/kernel

all:
	make -C ${KDIR} M=$(PWD) modules

clean:
	make -C ${KDIR} M=$(PWD) clean
