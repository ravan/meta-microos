SUMMARY = "Shared libraries for marst, an Algol-to-C translator"
DESCRIPTION = "MARST is an Algol-to-C translator. It automatically translates programs written \
on the algorithmic language Algol 60 to the C programming language. \
 \
This package contains the shared library."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "libalgol0-2.8-1.5.aarch64.rpm"
RPM_HASH = "bbbd0bfd25aa37697c227c045c44452d2fe1e94a9f44df5e4262c72efc2b5ffe57ef120953966f0705233ed59a85b22dcb2828f62d65a688ad3138ec1941c0b6"

RPROVIDES:${PN} += "libalgol.so.0 \
libalgol0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
