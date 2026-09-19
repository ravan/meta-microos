SUMMARY = "Multilingual text processing library for the C language"
DESCRIPTION = "A multilingual text processing library for the C language. \
This package contains shared libraries."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.5"

RPM_NAME = "libm17n0-1.8.5-1.6.aarch64.rpm"
RPM_HASH = "4c2e33f023d8eda9de5b887b63f4a59c7498b878758268d66a20bbd4cc33cbf11a661d647f0e2808581a34cf571a157476639106c1bce7e2b87b5237a1d7f04f"

RPROVIDES:${PN} += "libm17n-X.so \
libm17n-core.so.0 \
libm17n-flt.so.0 \
libm17n-gd.so \
libm17n-gui.so.0 \
libm17n.so.0 \
libm17n0 \
libmimx-anthy.so \
libmimx-ispell.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXt.so.6 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libgd.so.3 \
libotf.so.1 \
libxml2.so.16 \
pkgconfig-m17n-db"

inherit rpm
