SUMMARY = "Qt 6 GTK3 plugin"
DESCRIPTION = "Qt 6 plugin for better integration with GTK3-based desktop environments."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-platformtheme-gtk3-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "1d5cad61ba1af0cabfe5eb7e35e40053436b7b524b08e24f8f913a5d1aae977ae9b2797b55751e12f2be1efde4bb72857e1d378cd5cb7ac36df382066bccc98a"

RPROVIDES:${PN} += "libqgtk3.so \
qt6-platformtheme-gtk3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Gui6 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
