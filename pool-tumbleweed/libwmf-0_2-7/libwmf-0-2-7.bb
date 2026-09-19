SUMMARY = "Library for reading Metafile Images"
DESCRIPTION = "This library reads metafile images."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.15"

RPM_NAME = "libwmf-0_2-7-0.2.15-1.3.aarch64.rpm"
RPM_HASH = "c0efc18b04b19e8193b66778ba3457d27cc611f337917e398583ff9d2f57de3f89ca3e6204cdbd9ffa8b041ccdbb2fcea1a4a36a20a9ef677ee72eabda333f21"

RPROVIDES:${PN} += "libwmf-0-2-7 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libexpat.so.1 \
libfreetype.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
