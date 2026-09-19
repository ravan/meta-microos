SUMMARY = "Multilingual Text Processing Library for the C Language"
DESCRIPTION = "A multilingual text processing library for the C language. \
This package contains m17n-* programs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.5"

RPM_NAME = "m17n-lib-1.8.5-1.6.aarch64.rpm"
RPM_HASH = "9043a382a3d5a7ea01834d74ee9e6c3279c8441931d1b7b3cb2df16fd0a8cac6871bbb24b85a4c620cc7472977ff6f1f15c346188a41c51b4cf871c327e9dd66"

RPROVIDES:${PN} += "m17n-lib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libgd.so.3 \
libm17n-core.so.0 \
libm17n-flt.so.0 \
libm17n-gui.so.0 \
libm17n.so.0"

inherit rpm
