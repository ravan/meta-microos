SUMMARY = "GNUnet library libgnunetcadet"
DESCRIPTION = "This package contains the libgnunetcadet library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetcadet7-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "8345691a3c0065a408ca1a54374759ced53cd184854fea0d1e386a021c29403a084c4e6c3d4c5562157fbc44c22e1d25678a76e987dbaec84d56503558ff638e"

RPROVIDES:${PN} += "libgnunetcadet.so.7 \
libgnunetcadet7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
