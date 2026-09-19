SUMMARY = "MATE Desktop graphics viewer typelib"
DESCRIPTION = "The Eye of MATE is a graphics viewer for the MATE Desktop \
which uses the gdk-pixbuf library. It can deal with large images, \
and zoom and scroll with constant memory usage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.1"

RPM_NAME = "typelib-1_0-Eom-1_0-1.28.1-1.3.aarch64.rpm"
RPM_HASH = "4a891635c513bad26273f71e11529f5785785776e54aec0d171d95d9903a241a312f4ed92886f66276441b0489055a0ee6387ac0ae3e21fed801be3476d146d8"

RPROVIDES:${PN} += "typelib-1-0-Eom-1-0 \
typelib-Eom"

RDEPENDS:${PN} += "typelib-Atk \
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
