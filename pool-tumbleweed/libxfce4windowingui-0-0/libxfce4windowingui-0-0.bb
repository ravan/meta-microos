SUMMARY = "X11/Wayland windowing utility library for Xfce - extra widgets"
DESCRIPTION = "Libxfce4windowingui is a UI widget utility library that makes use of \
libxfce4windowing primitives."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.7"

RPM_NAME = "libxfce4windowingui-0-0-4.20.7-1.1.aarch64.rpm"
RPM_HASH = "c67151de168e1d50a7227da58a6f29d04eb10b9d48fd7b851c83774df9b339dac37083f429cbad1170f4353b187911870559eacf325e23899b42c1404fe4951b"

RPROVIDES:${PN} += "libxfce4windowingui-0-0 \
libxfce4windowingui-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libxfce4windowing-0.so.0"

inherit rpm
