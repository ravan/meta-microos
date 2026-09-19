SUMMARY = "A Library for Generating Network Deltas"
DESCRIPTION = "librsync implements the 'rsync' algorithm, which allows remote \
differencing of binary files.  librsync computes a delta relative to a \
file's checksum, so the two files need not both be present to generate \
a delta."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.4"

RPM_NAME = "librsync2-2.3.4-1.13.aarch64.rpm"
RPM_HASH = "110fc221f9233300f2b4bf95a4f0bd70ab317a75e11606d464dc123b08ef00beb522f57f2eda666f842d82d3f01479eb2ddb5c7fa0610a11e1e102efbfc8fba0"

RPROVIDES:${PN} += "librsync \
librsync.so.2 \
librsync2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
