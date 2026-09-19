SUMMARY = "Fight Flash Fraud / Fight Fake Flash"
DESCRIPTION = "This package contains tools for identifying fake flash drives (primarily USB \
sticks and memory cards). \
 \
A fake flash drive fraudulently inflates its apparent storage capacity (far) \
beyond the physical capacity of its flash memory. Not surprisingly, using such \
a flash drive will, sooner or later, result in data loss and/or corruption. \
 \
The main tools in this package are an open-source implementation of the H2testw \
algorithm. Some extra tools are also provided, among them one for using \
the actual storage capacity of fake drives as safely as possible."
LICENSE = "GPL-3.0-only"

PV = "10.0"

RPM_NAME = "f3-10.0-1.2.aarch64.rpm"
RPM_HASH = "da5444865badd26fa22a077b09d528b33a9691b9016049404afbf7185bed13538b99aba2def5d8e4e55c844cabacefb5958f60d78d11de48b7e9a6fdac5ecf2d"

RPROVIDES:${PN} += "f3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libparted.so.2 \
libudev.so.1"

inherit rpm
