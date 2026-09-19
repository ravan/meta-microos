SUMMARY = "A universal flash programming utility"
DESCRIPTION = "flashrom is a utility for reading, writing, verifying and erasing flash ROM \
chips. It's often used to flash BIOS/EFI/coreboot/firmware images in-system \
using a supported mainboard, but it also supports flashing of network \
cards (NICs), SATA controller cards, and other external devices which can \
program flash chips. \
 \
This package contains the headers needed to compile against libflashrom."
LICENSE = "GPL-2.0-only"

PV = "1.8.0+git0.90b6b437"

RPM_NAME = "flashrom-devel-1.8.0+git0.90b6b437-1.1.aarch64.rpm"
RPM_HASH = "e805101acd2fe94d3d651725e9eda0bd2221ce6d14e792fd2e886759b9f312ee919063e2449267dce069638617ab43bcd393a92961ab67618e4baa0553826c44"

RPROVIDES:${PN} += "flashrom-devel \
pkgconfig-flashrom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libflashrom1 \
pkgconfig-libcrypto \
pkgconfig-libftdi1 \
pkgconfig-libjaylink \
pkgconfig-libpci \
pkgconfig-libusb-1.0"

inherit rpm
