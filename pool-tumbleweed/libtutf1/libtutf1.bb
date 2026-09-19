SUMMARY = "Unicode/Charset conversion library for twin"
DESCRIPTION = "Unicode <-> charset conversion routines for twin."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+161"

RPM_NAME = "libtutf1-0.9.0+161-1.5.aarch64.rpm"
RPM_HASH = "7ffb1ea329fb852f3ab4aa2a63f14119e0e8f2f883f112174896a2032458812cbc1f56459146d26adc5b76658d7f2b18598f6b7f59ec8b4c40763699d4152a3c"

RPROVIDES:${PN} += "libTutf1 \
libtutf.so.1 \
libtutf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
