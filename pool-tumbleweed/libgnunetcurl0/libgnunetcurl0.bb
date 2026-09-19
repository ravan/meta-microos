SUMMARY = "GNUnet library libgnunetcurl"
DESCRIPTION = "This package contains the libgnunetcurl library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetcurl0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "2d2f1ecfaa6988a022e0fdb308d164115ee71660eac9bfdcb3cd7656213192ab4df44221fa7a1ff9a701022e6c89c2f7acb95694dfab309bc8e48ef2927f7e6c"

RPROVIDES:${PN} += "libgnunetcurl.so.0 \
libgnunetcurl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgnunetutil.so.20 \
libjansson.so.4"

inherit rpm
