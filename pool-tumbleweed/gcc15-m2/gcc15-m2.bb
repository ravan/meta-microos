SUMMARY = "GNU Modula-2 Compiler"
DESCRIPTION = "This package contains a Modula-2 compiler."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-m2-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "933c16076d91fdd144dc44c446af6031ccd9f48acab4b815cd88d9689d72b30301f149992f65c451eb5bda697c8b92cecf8ec99b24a0dcbd6171d206791e3dbb"

RPROVIDES:${PN} += "gcc15-m2"

RDEPENDS:${PN} += "gcc15 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libm2cor20 \
libm2iso20 \
libm2log20 \
libm2min20 \
libm2pim20 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++.so.6 \
libstdc++6-devel-gcc15 \
libz.so.1 \
libzstd.so.1"

inherit rpm
