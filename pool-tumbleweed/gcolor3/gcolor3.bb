SUMMARY = "A color chooser written in GTK3 (like gcolor2)"
DESCRIPTION = "Gcolor3 enables picking the color from any pixel on the screen. It \
also offers a palette to mix and match a couple of colors together. \
Colors can be saved and retrieved."
LICENSE = "GPL-2.0-only"

PV = "2.4.0"

RPM_NAME = "gcolor3-2.4.0-3.5.aarch64.rpm"
RPM_HASH = "91ed17d28442019748fc1788c4f0a8d470a1f2264fe7fe710d52399e8d4b550b59db945c0a5e79b74d56f21bf145ace0d8863a9ff6acb29990ef05f5be873b24"

RPROVIDES:${PN} += "gcolor3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libportal-gtk3.so.1 \
libportal.so.1"

inherit rpm
