SUMMARY = "GTK+ integration for Clutter"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GTK+ enables the use of GTK+ with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.4"

RPM_NAME = "libclutter-gtk-1_0-0-1.8.4-5.30.aarch64.rpm"
RPM_HASH = "d83228706b0d1bc0508331a76ed6f2612469418473bca0f9d05916c0f55097779c1127918ea1e9ce93782de984b3b8d531c2f70b41b1034ef5015b95153fce12"

RPROVIDES:${PN} += "clutter-gtk \
libclutter-gtk-1-0-0 \
libclutter-gtk-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libcogl.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libwayland-client.so.0"

inherit rpm
