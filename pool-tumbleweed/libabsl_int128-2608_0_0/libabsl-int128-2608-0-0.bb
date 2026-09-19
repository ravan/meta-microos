SUMMARY = "Abseil library liblibabsl_int128"
DESCRIPTION = "This package contains the libabsl_int128 library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_int128-2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "4ea507ed181ffefb6fa992dd4bf7cc5c2bf6da6275dee8d7fcd03262c609698328e1a97e17c1a7dec2952550addea03c0b850d3e3d234d70eb9ed1bdcaee73d6"

RPROVIDES:${PN} += "libabsl-int128-2608-0-0 \
libabsl-int128.so.2608.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
