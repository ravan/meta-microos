SUMMARY = "Compare images and videos"
DESCRIPTION = "A program for comparing multiple versions of an image or video."
LICENSE = "GPL-3.0-or-later"

PV = "25.10.1"

RPM_NAME = "identity-25.10.1-1.10.aarch64.rpm"
RPM_HASH = "6287dbe5e92adb33af6e036e4564dbe4c2fc7dfa1f4bc38d313f73677fe74818cf6b2f43a8999a087b35221402d1e9ed74a43d5eca092be8fcf41d238ec47386"

RPROVIDES:${PN} += "identity"

RDEPENDS:${PN} += "glycin-loaders \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libdav1d.so.7 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libglycin-gtk4-2.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstallocators-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libstdc++.so.6 \
libwebpdemux.so.2"

inherit rpm
