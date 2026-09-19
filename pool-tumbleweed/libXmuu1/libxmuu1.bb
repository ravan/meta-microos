SUMMARY = "More miscellaneous utility routines for X"
DESCRIPTION = "The Xmu/Xmuu libraries are a collection of miscellaneous (some might \
say random) utility functions that have been useful in building \
various applications and widgets."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libXmuu1-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "b10bf6033b0dbb37ee48195796060501830ff7f5400d1d30106fdc43b21553b41d1b35d0ed769ff46e28e3bbbd05fcd32b909122ba275f712c5a28ed0fde5d73"

RPROVIDES:${PN} += "libXmuu.so.1 \
libXmuu1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
