SUMMARY = "PGM Reliable Multicast Protocol library"
DESCRIPTION = "OpenPGM is an implementation of the Pragmatic General Multicast (PGM) \
specification in RFC 3208. PGM is a reliable and scalable multicast protocol \
that enables receivers to detect loss, request retransmission of lost data, or \
notify an application of unrecoverable loss."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.128"

RPM_NAME = "libpgm-5_3-0-5.3.128-3.5.aarch64.rpm"
RPM_HASH = "e00ebbe3cfdf20e608d8b94ca20399af2a440d390a9b1f2701f07ec990e95b9485da0c1440d613435ec6991eb7c16d838755c061f5f07587be03035e906581ce"

RPROVIDES:${PN} += "libpgm-5-3-0 \
libpgm-5.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
