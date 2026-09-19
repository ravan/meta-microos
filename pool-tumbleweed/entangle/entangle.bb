SUMMARY = "Tethered shooting & control of digital cameras"
DESCRIPTION = "Entangle is an application which uses GTK and libgphoto2 to provide a \
graphical interface for tethered photography with digital cameras. \
 \
It includes control over camera shooting and configuration settings \
and 'hands off' shooting directly from the controlling computer."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-3.0-3.2.aarch64.rpm"
RPM_HASH = "7273c9e576519e765e66612842825426846a82ff8bf5e46e9d1dc3ac278e969d552611d862e4282e225cebc62803eccb9db2ddc20ec182117f71999bb043e6c1"

RPROVIDES:${PN} += "entangle \
libentangle-backend.so.0 \
libentangle-frontend.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libXext.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgexiv2.so.2 \
libgio-2.0.so.0 \
libgirepository-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
liblcms2.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpeas-1.0.so.1 \
libpeas-gtk-1.0.so.1 \
libraw-r.so.25"

inherit rpm
