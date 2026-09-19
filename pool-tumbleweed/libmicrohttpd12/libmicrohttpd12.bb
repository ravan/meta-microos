SUMMARY = "Small embeddable http server library"
DESCRIPTION = "Shared library for libmicrohttpd (Small embeddable http server library)."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.10"

RPM_NAME = "libmicrohttpd12-1.0.10-1.1.aarch64.rpm"
RPM_HASH = "01fb95b63fcc75fb9add5aa769b4a348adb4e353346a25a9565cf4f83b2a941631e9279951c2bc81d0d7f06d3353e5ba60290f3fecc7feb8972143e259049f90"

RPROVIDES:${PN} += "libmicrohttpd.so.12 \
libmicrohttpd12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30"

inherit rpm
