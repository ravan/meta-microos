SUMMARY = "XApp library -- Introspection bindings"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions. \
 \
This library is used by several XApp applications."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.2"

RPM_NAME = "typelib-1_0-XApp-1_0-3.2.2-1.4.aarch64.rpm"
RPM_HASH = "2cc04c4fdf39a4bd94dc2e99d57aee54435100f0a5806d9c65753140283cefe12e8ebb4fc8df79dea304e8577b9b93360655b5e2f44f243cf2e01523688d034e"

RPROVIDES:${PN} += "typelib-1-0-XApp-1-0 \
typelib-XApp"

RDEPENDS:${PN} += "libxapp.so.1 \
python-abi \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
