SUMMARY = "Cinnamon Desktop default window manager"
DESCRIPTION = "Cinnamon Desktop default window manager. \
Muffin uses GTK+ and Clutter to do everything."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "muffin-6.4.1-2.4.aarch64.rpm"
RPM_HASH = "47c100b6b5269a4544bebbee426409d56fae59fd313834ea966cc3269b38d81abce793ce975869f2d3e55cea2e8d723e3f76320d8583fa6611ce8ad806ff93b1"

RPROVIDES:${PN} += "libdefault.so \
libmuffin-clutter-0.so.0 \
libmuffin-cogl-0.so.0 \
libmuffin-cogl-pango-0.so.0 \
libmuffin-cogl-path-0.so.0 \
muffin \
windowmanager"

RDEPENDS:${PN} += "cinnamon-gschemas \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmuffin.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libwayland-server.so.0 \
zenity"

inherit rpm
