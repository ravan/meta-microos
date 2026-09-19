SUMMARY = "Boost.Test runtime library"
DESCRIPTION = "This package contains the Boost.Test runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_test1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "2a18ddfa87bfebf017036dbf12b8d3751b69619fc8779129a23a2ad3069cbf5734cca1a9d07fc37ddc4a3c23b80174381f7aadbd6488490f0ec44fbf1aed11c6"

RPROVIDES:${PN} += "libboost-prg-exec-monitor.so.1.91.0 \
libboost-test-exec-monitor.so.1.91.0 \
libboost-test1-91-0 \
libboost-unit-test-framework.so.1.91.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
