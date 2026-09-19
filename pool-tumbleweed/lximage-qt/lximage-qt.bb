SUMMARY = "LXQt Image Viewer"
DESCRIPTION = "Image Viewer for LXQt and Thumbnail Generator for PCManFM-Qt"
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0"

RPM_NAME = "lximage-qt-2.4.0-1.3.aarch64.rpm"
RPM_HASH = "a200e22e79cadc302c9ce406e0ee018f4f064c646ef03a70062da4dd670dc2d3a8bf65f16a14140ca4a256285e4daa86e4f87e328153df57d3d0c277e4e893b2"

RPROVIDES:${PN} += "lximage-qt"

RDEPENDS:${PN} += "desktop-file-utils \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXfixes.so.3 \
libc.so.6 \
libexif.so.12 \
libfm-qt6.so.17 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
