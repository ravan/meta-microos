SUMMARY = "Library for creating dynamic graphical user interfaces"
DESCRIPTION = "Clutter is a library for creating fast, visually rich and animated \
graphical user interfaces. It uses OpenGL (or GLES) for rendering."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.4"

RPM_NAME = "libclutter-1_0-0-1.26.4-4.23.aarch64.rpm"
RPM_HASH = "5fdb76036c45a06ed7742a2f9a8ba7efe97b581039bf302d5b0e16f614a1e6389e5f5487d68ec1d71b8b53f455ee8292a78a552d3d3732eb05d50eca49884e27"

RPROVIDES:${PN} += "clutter \
libclutter-1-0-0 \
libclutter-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXi.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcogl-pango.so.20 \
libcogl-path.so.20 \
libcogl.so.20 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libinput.so.10 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libudev.so.1 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-server.so.0 \
libxkbcommon.so.0"

inherit rpm
