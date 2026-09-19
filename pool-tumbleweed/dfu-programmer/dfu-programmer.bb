SUMMARY = "A Device Firmware Update based USB programmer for Atmel chips"
DESCRIPTION = "dfu-programmer is an implementation of the Device Firmware Upgrade class \
USB driver that enables firmware upgrades for various USB enabled (with the \
correct bootloader) Atmel chips. This program was created because the \
Atmel 'FLIP' program for flashing devices does not support flashing via USB \
on Linux, and because standard DFU loaders do not work for Atmel's chips."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "dfu-programmer-1.1.0-1.8.aarch64.rpm"
RPM_HASH = "0c944764ff6078488f8c0187714af72ed806c9bbe2d777217c320065a26e7f44386e73bded7394da47108150fecf40742c5a3424c28a13b1a2517c4d31704de6"

RPROVIDES:${PN} += "dfu-programmer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
