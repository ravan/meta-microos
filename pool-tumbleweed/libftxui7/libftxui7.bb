SUMMARY = "A C++ library for terminal based user interfaces"
DESCRIPTION = "A C++ library for terminal based user interfaces."
LICENSE = "MIT"

PV = "7.0.3"

RPM_NAME = "libftxui7-7.0.3-1.1.aarch64.rpm"
RPM_HASH = "6126e2fc7d358c856f5546b0e3fae3a091a6c78feff3905bd4083a1d17d1364d93d322fbaecac342beb3705c5c41ddfc0158195ac5a59df24e6b92a967875441"

RPROVIDES:${PN} += "libftxui-component.so.7 \
libftxui-dom.so.7 \
libftxui-screen.so.7 \
libftxui7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
