SUMMARY = "Configurable tiling and floating Window Manager"
DESCRIPTION = "awesome is a dynamic window manager. \
 \
It manages windows in several layout modes: tiled, floating, etc. \
Each layout can be applied dynamically, optimizing the environment \
for the application in use and the task performed."
LICENSE = "GPL-2.0-or-later"

PV = "4.3"

RPM_NAME = "awesome-4.3-6.4.aarch64.rpm"
RPM_HASH = "895810984e7d4df5e727bc06ce6a8263cfbec16b7db812a5a2ac7b28be56c2f052b0518944cbdc4adea769b5651da23446c7a31dbabb7dbb53ff1495ff3760fc"

RPROVIDES:${PN} += "awesome \
windowmanager"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
awesome-branding \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblua5.4.so.5 \
libstartup-notification-1.so.0 \
libxcb-cursor.so.0 \
libxcb-icccm.so.4 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-shape.so.0 \
libxcb-util.so.1 \
libxcb-xinerama.so.0 \
libxcb-xkb.so.1 \
libxcb-xrm.so.0 \
libxcb-xtest.so.0 \
libxcb.so.1 \
libxdg-basedir.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
lua-lgi \
typelib-GLib \
typelib-Gio \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
update-alternatives"

inherit rpm
