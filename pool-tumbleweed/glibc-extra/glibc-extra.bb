SUMMARY = "Extra binaries from GNU C Library"
DESCRIPTION = "The glibc-extra package contains some extra binaries for glibc that \
are not essential but recommend for use. \
 \
makedb: A program to create a database for nss"
LICENSE = "LGPL-2.1-or-later"

PV = "2.44"

RPM_NAME = "glibc-extra-2.44-2.1.aarch64.rpm"
RPM_HASH = "1396e007223fc8919dd7dfd883a83370a41e0ed8cfead868a3c40e68a9dd3786c6a272b55104d7454708c957cd2e218a8ba1a8d821014c3e1d45b58f359fa9b1"

RPROVIDES:${PN} += "glibc-extra"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
