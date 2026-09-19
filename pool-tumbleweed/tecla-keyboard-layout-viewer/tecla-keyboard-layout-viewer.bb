SUMMARY = "A keyboard layout viewer"
DESCRIPTION = "A keyboard layout viewer from the GNOME project."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "tecla-keyboard-layout-viewer-50.0-1.3.aarch64.rpm"
RPM_HASH = "958856c3c05bf565ec0d738bc69d8918dca3f59c0be6e6a94d377f9d2d47f65309a242ca483ea73b3db2024b7be0407b55c55fc1cd0a8f78824834f78db3c4ad"

RPROVIDES:${PN} += "pkgconfig-tecla \
tecla-keyboard-layout-viewer"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
