SUMMARY = "Library with common API for various MATE modules"
DESCRIPTION = "This package contains the library with common API for various \
MATE modules."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.28.2"

RPM_NAME = "libmate-desktop-2-17-1.28.2-1.13.aarch64.rpm"
RPM_HASH = "d56d051eeb7cb54b84aef28479d59f01bb75b191b0f5571ed5871d463c19e909f6ef7c564b201f11ec490ba9aef60b63bb32b4ddafa37dd541ac6e6222b431fa"

RPROVIDES:${PN} += "libmate-desktop-2-17 \
libmate-desktop-2.so.17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdconf.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libstartup-notification-1.so.0 \
mate-desktop-gschemas"

inherit rpm
