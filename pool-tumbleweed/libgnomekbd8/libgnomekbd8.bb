SUMMARY = "GNOME Keyboard Library"
DESCRIPTION = "GNOME keyboard shared library. \
 \
This package provides the shared library of libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "libgnomekbd8-3.28.1-1.15.aarch64.rpm"
RPM_HASH = "e54dcf458f0f978470b331a74086fd3758ffa78f166bba4a3eb6134fbb4671f1a260080d68114574cd3ad8e702d4dd6f4d3f9e52283a99afcee9110466b40791"

RPROVIDES:${PN} += "libgnomekbd \
libgnomekbd.so.8 \
libgnomekbd8 \
libgnomekbdui.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxklavier.so.16"

inherit rpm
