SUMMARY = "Development files for librsync"
DESCRIPTION = "librsync implements the 'rsync' algorithm, which allows remote \
differencing of binary files.  librsync computes a delta relative to a \
file's checksum, so the two files need not both be present to generate \
a delta."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.4"

RPM_NAME = "librsync-devel-2.3.4-1.13.aarch64.rpm"
RPM_HASH = "4de761ccfb02abc90affde806e91e990f615aec9d208402e97e24ff9abf01d30774ad7589853667a9c9c43673ca768279fd9e84dba0e6da2f853fc2ca559edc8"

RPROVIDES:${PN} += "librsync-devel"

RDEPENDS:${PN} += "librsync2"

inherit rpm
