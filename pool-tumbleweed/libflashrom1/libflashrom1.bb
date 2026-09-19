SUMMARY = "A universal flash programming utility"
DESCRIPTION = "flashrom is a utility for reading, writing, verifying and erasing flash ROM \
chips. It's often used to flash BIOS/EFI/coreboot/firmware images in-system \
using a supported mainboard, but it also supports flashing of network \
cards (NICs), SATA controller cards, and other external devices which can \
program flash chips."
LICENSE = "GPL-2.0-only"

PV = "1.8.0+git0.90b6b437"

RPM_NAME = "libflashrom1-1.8.0+git0.90b6b437-1.1.aarch64.rpm"
RPM_HASH = "000e5f143e2abb9ba4e494464836cb734ba6fe0e897c2c35021bfec2dc9aaab85a7edcf7ffd2827c663c7402cffeee5254ba6bc8ca1d8b8c0b5e4f65ed6ac689"

RPROVIDES:${PN} += "libflashrom.so.1 \
libflashrom1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
libjaylink.so.0 \
libpci.so.3 \
libusb-1.0.so.0"

inherit rpm
