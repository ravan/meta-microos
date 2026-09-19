SUMMARY = "Gedit Technology - File loading and saving"
DESCRIPTION = "libgedit-gfls is a module dedicated to file loading and saving for the needs of gedit and other similar text editors."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.2"

RPM_NAME = "typelib-1_0-Gfls-1-0.4.2-1.1.aarch64.rpm"
RPM_HASH = "1f8d0076696d9fd641e9c9a7b595fbda825c9b89871757ba85e34da2a5fb2310e6580e7527376c89d3a47d1629a5e68d2bdd33b8a9e372d3c6f4028e6ff9d2b9"

RPROVIDES:${PN} += "typelib-1-0-Gfls-1 \
typelib-Gfls"

RDEPENDS:${PN} += "libgedit-gfls-1.so.0 \
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
