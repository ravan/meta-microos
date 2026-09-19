SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async API for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "typelib-1_0-XdpGtk3-1_0-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "ab80b0235caf08ba78dc36fbc9c145b452cbf0d237c410ffac23d3473b7da2ed349a3ecb654bfff23f4cd6816d32e9629b7983d4218065b7f4d7cc5f8ab1114c"

RPROVIDES:${PN} += "typelib-1-0-XdpGtk3-1-0 \
typelib-XdpGtk3"

RDEPENDS:${PN} += "libportal-gtk3.so.1 \
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
typelib-Xdp \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
