SUMMARY = "Library for X On-Screen Display"
DESCRIPTION = "A library for displaying a TV-like on-screen display in X"
LICENSE = "GPL-2.0-or-later"

PV = "2.2.14"

RPM_NAME = "libxosd2-2.2.14-1.11.aarch64.rpm"
RPM_HASH = "691b44896dabe3b5b51542c92108ae1d7d03485464f321b0c2eb11e0322b6cb0ae4668a1f5b1f3756a1485a5c4fc1bb9f3c7de2f3e9320f0a30020f1df3c80e4"

RPROVIDES:${PN} += "libxosd.so.2 \
libxosd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
