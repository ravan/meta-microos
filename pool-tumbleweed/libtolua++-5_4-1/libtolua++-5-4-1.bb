SUMMARY = "Runtime libraries for tolua++"
DESCRIPTION = "This package provides shared libraries for tolua++."
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "libtolua++-5_4-1-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "18cd6f928a451224855e7cddca485474c315cf6e5d1ce970b4df9eb7827dfad2d85c60b02174e51bbb5af69f1647e2f9f5f446d86d10340842c16cacca5c4aae"

RPROVIDES:${PN} += "libtolua++-5-4-1 \
libtolua++-5.4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libm.so.6"

inherit rpm
