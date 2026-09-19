SUMMARY = "MATE Desktop keyboard configuration typelib"
DESCRIPTION = "This package provides libmatekdb, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "typelib-1_0-Matekbd-1_0-1.28.0-2.5.aarch64.rpm"
RPM_HASH = "c51c8effda6643e6b801dcfba8c02c911dd26c49caef8b0847ebdaeef68722641998e0e40a8e998f3cdebe5cb7e1451b4bc142f45b79a9cd2c24fd7d526ab770"

RPROVIDES:${PN} += "typelib-1-0-Matekbd-1-0 \
typelib-Matekbd"

RDEPENDS:${PN} += "libmatekbd.so.6 \
libmatekbdui.so.6 \
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
typelib-Xkl \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
