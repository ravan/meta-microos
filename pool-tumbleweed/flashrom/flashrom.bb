SUMMARY = "A universal flash programming utility"
DESCRIPTION = "flashrom is a utility for reading, writing, verifying and erasing flash ROM \
chips. It's often used to flash BIOS/EFI/coreboot/firmware images in-system \
using a supported mainboard, but it also supports flashing of network \
cards (NICs), SATA controller cards, and other external devices which can \
program flash chips. \
 \
It supports a wide range of DIP32, PLCC32, DIP8, SO8/SOIC8, TSOP32, and \
TSOP40 chips, which use various protocols such as LPC, FWH, parallel flash, \
or SPI."
LICENSE = "GPL-2.0-only"

PV = "1.8.0+git0.90b6b437"

RPM_NAME = "flashrom-1.8.0+git0.90b6b437-1.1.aarch64.rpm"
RPM_HASH = "0a9943dc3376fae4814b4d5a0973d1bf55727c3c997fd6fee2ffc23354b59bd15ff9a6e528d9af73be64f1bb4671ed4dffc0ee30cbe12cd49fb080eaed4f8531"

RPROVIDES:${PN} += "flashrom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libftdi1.so.2 \
libjaylink.so.0 \
libpci.so.3 \
libusb-1.0.so.0"

inherit rpm
