SUMMARY = "Muffin shared libraries"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything. \
 \
This package provides Muffin's shared libraries."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "libmuffin0-6.4.1-2.4.aarch64.rpm"
RPM_HASH = "b01be9baca27dca93b95558a4f25f9aac7450351480299bf03fa18ebda4bb2a1452fc875b39f5af943a2b352f432a7c2d48ea226269177932c3bc282ebb74251"

RPROVIDES:${PN} += "libmuffin.so.0 \
libmuffin0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11-xcb.so.1 \
libX11.so.6 \
libXau.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXtst.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcanberra.so.0 \
libcinnamon-desktop.so.4 \
libdrm.so.2 \
libgbm.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libinput.so.10 \
libm.so.6 \
libmuffin-clutter-0.so.0 \
libmuffin-cogl-0.so.0 \
libpango-1.0.so.0 \
libpipewire-0.3.so.0 \
libstartup-notification-1.so.0 \
libsystemd.so.0 \
libudev.so.1 \
libwacom.so.9 \
libwayland-server.so.0 \
libxcb-randr.so.0 \
libxcb-res.so.0 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libxkbfile.so.1"

inherit rpm
