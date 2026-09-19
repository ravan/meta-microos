SUMMARY = "Matrix group messaging app"
DESCRIPTION = "Fractal is a Matrix messaging app for GNOME written in Rust. Its \
interface is tuned for collaboration in large groups, such as \
free software projects."
LICENSE = "GPL-3.0-or-later"

PV = "14.1"

RPM_NAME = "fractal-14.1-1.1.aarch64.rpm"
RPM_HASH = "3e0cc78fb6516b559b385945a93db23a8f41a5e1175ed61dd1d318d44f563f18b1c619c4f427c39bef4112df8afc6945e439087860a11f88f130f11e138876f3"

RPROVIDES:${PN} += "fractal"

RDEPENDS:${PN} += "glycin-loaders \
gstreamer-plugins-good-gtk \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libglycin-gtk4-2.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstplay-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libshumate-1.0.so.1 \
libsqlite3.so.0"

inherit rpm
