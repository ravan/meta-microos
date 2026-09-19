SUMMARY = "Example Programs for libsndfile"
DESCRIPTION = "This package includes the example programs for libsndfile."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "libsndfile-progs-1.2.2-5.3.aarch64.rpm"
RPM_HASH = "3f462f022cadadcca1fb220b132e1a1fb09b4a48fd1550a78da5e3f2c1b0cd01ff558deeeb617ac989475d52c72671645760bd5eb7e30cfc0dcb8e098b5e610e"

RPROVIDES:${PN} += "libsndfile-progs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6 \
libsndfile.so.1"

inherit rpm
