SUMMARY = "MinGW Windows cross-C Preprocessor"
DESCRIPTION = "MinGW Windows cross-C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-cross-cpp-bootstrap-16.2.0-1.1.aarch64.rpm"
RPM_HASH = "1578944aaee0e394f51dcf1f69a235304ee0781b6c56b8836cfb0d258d4d60a08d08ffcd5ccaca3a822bbdb8a97e632ac29ccb1f5f7d9570855818b73aa2645d"

RPROVIDES:${PN} += "mingw32-cross-cpp-bootstrap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
