SUMMARY = "GTK libfm libraries"
DESCRIPTION = "GTK system libraries for libfm"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libfm-gtk3-4-1.4.1-2.5.aarch64.rpm"
RPM_HASH = "477e68f8fbfdeb5cbe69cce7081eae24c878a0b943fe13494e2c8e015df39582b39eabf23a7d3c8f3c4120041c5328945a948d2409325b8847cdf68c66fe1855"

RPROVIDES:${PN} += "libfm-gtk3-4 \
libfm-gtk3.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libfm.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmenu-cache.so.3 \
libpango-1.0.so.0"

inherit rpm
