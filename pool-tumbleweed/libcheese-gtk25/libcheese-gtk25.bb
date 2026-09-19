SUMMARY = "UI library for the Cheese a webcam booth"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects. \
 \
This package contains a library providing widgets to allow third \
party applications to include parts of cheese functionality."
LICENSE = "GPL-2.0-or-later"

PV = "44.1+12"

RPM_NAME = "libcheese-gtk25-44.1+12-1.6.aarch64.rpm"
RPM_HASH = "28380ee0da68020571eddc0c13eaa0ba55a552fd928a5265ea81e10793dbcea8d08cf4503afeeb97ed8e75a865f99c5a28207a1a997bf78ca2da081b4db88dd5"

RPROVIDES:${PN} += "libcheese-gtk.so.25 \
libcheese-gtk25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcheese-common \
libcheese.so.8 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libcogl.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
