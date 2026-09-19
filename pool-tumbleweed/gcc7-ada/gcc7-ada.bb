SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-ada-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "7e1c71982f83a7b683e43f5f7ae0b1c222fa01eaa0101c935329b88f23d34e50665ed92cf452aae0c035f79ece4c022741aa26ee08bf61d17d26820dbda2c091"

RPROVIDES:${PN} += "gcc7-ada"

RDEPENDS:${PN} += "gcc7 \
libada7 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
