SUMMARY = "Library for Terminal Handling"
DESCRIPTION = "This contain the library for handling terminals for termrec"
LICENSE = "LGPL-2.0-or-later"

PV = "0.19"

RPM_NAME = "libtty1-0.19-1.24.aarch64.rpm"
RPM_HASH = "ab8282430f2c5b4762c43ab0831d260fc22c28947a4855e3595df2b338082aaefbc611cfcfad089d5bcf065164b58928e4f060fd53c39afede1d2a31fc9f0d91"

RPROVIDES:${PN} += "libtty.so.1 \
libtty1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libz.so.1"

inherit rpm
