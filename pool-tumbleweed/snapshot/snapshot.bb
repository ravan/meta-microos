SUMMARY = "Take pictures and videos"
DESCRIPTION = "Take pictures and videos."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "snapshot-50.0-1.4.aarch64.rpm"
RPM_HASH = "b257d777ca3094c9f34932888bde8ff128c2a925f24ec80d0dc50573e636f5105aae96a37fecd66a92d1bdaa2dea69d72be424bc1064b12f3bb692ef47f921bd"

RPROVIDES:${PN} += "snapshot"

RDEPENDS:${PN} += "gstreamer-plugin-pipewire \
gstreamer-plugins-rs \
libadwaita-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libglycin-gtk4-2.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
