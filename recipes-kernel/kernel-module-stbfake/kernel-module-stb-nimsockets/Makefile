obj-m += stb-nimsockets.o

KDIR=/development/hummingboard/openpli40/openpli-oe-core/build/tmp/sysroots/cubox-i/usr/src/kernel

all:
	make -C ${KDIR} M=$(PWD) modules

clean:
	make -C ${KDIR} M=$(PWD) clean
