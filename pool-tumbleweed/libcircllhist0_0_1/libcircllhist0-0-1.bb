SUMMARY = "A C implementation of Circonus log-linear histograms"
DESCRIPTION = "Shared library for libcircllhist, an implementation of Circonus log-linear \
histograms written in C."
LICENSE = "BSD-3-Clause"

PV = "20180917"

RPM_NAME = "libcircllhist0_0_1-20180917-2.28.aarch64.rpm"
RPM_HASH = "0817af302fc44cdc958c3bb48b1458ed47be15ad0817e837e60abcc8c632cf726fbca889ca4ebc39ede075c2920999d1ff9cb2299ed286c3ef7bcdea1187122a"

RPROVIDES:${PN} += "libcircllhist.so.0.0.1 \
libcircllhist0-0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
