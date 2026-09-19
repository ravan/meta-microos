SUMMARY = "Qt6 Gtk2 Style Plugin"
DESCRIPTION = "Qt 6 plugin for better integration with gtk-based desktop enviroments."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "qt6gtk2-0.7-1.10.aarch64.rpm"
RPM_HASH = "997171252a270afd5e3a29e8d36ab5ab081a0d216a14dde8c91e2b93830139a2a0d49ce8b0e7457558dbff4f247122cdacd0b72b7d61b551e3301639d0ce5da9"

RPROVIDES:${PN} += "libqt6gtk2-style.so \
libqt6gtk2.so \
qt6gtk2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
