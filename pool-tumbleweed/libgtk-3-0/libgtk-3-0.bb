SUMMARY = "The GTK+ toolkit library (version 3)"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "libgtk-3-0-3.24.52+git59.b30343717d-1.1.aarch64.rpm"
RPM_HASH = "60b0c995ddc2cb525e42b07ae45f127c3ac6f29bc94d638cdb226910c204bc6eadfe580f81b0a29d6ebc965c85cda7b7c4352b3c3f23b80b789b5d45b2adb069"

RPROVIDES:${PN} += "gtk3 \
libgailutil-3.so.0 \
libgdk-3.so.0 \
libgtk-3-0 \
libgtk-3-0-0 \
libgtk-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
glycin-loaders \
gtk3-data \
gtk3-schema \
gtk3-tools \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXcursor.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcolord.so.2 \
libcups.so.2 \
libepoxy.so.0 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0"

inherit rpm
