SUMMARY = "Theme preview application for GTK 2"
DESCRIPTION = "A widget factory is a theme preview application for GTK and Qt. It \
displays the various widget types in a single window allowing to see \
the visual effect of the applied theme. \
 \
This package provides the program for GTK 2."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "awf-gtk2-4.2.0-1.2.aarch64.rpm"
RPM_HASH = "b733f734191f80dece64e33bda48d0f69149ed046b815701d7ffdc44e58c9c08475c3b3389c5ce1803d1dd0e905058c9b93813827852c1503a8050c511853983"

RPROVIDES:${PN} += "awf-gtk2"

RDEPENDS:${PN} += "gtk2 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libnotify \
libnotify.so.4 \
libpango-1.0.so.0"

inherit rpm
