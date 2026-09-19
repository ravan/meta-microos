SUMMARY = "Character Map"
DESCRIPTION = "A simple utility application to find and insert unusual characters."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-characters-50.0-2.1.aarch64.rpm"
RPM_HASH = "3cf98a9694e2504bc511c5865dfc91fc92954dd5aa81c6cf3c17efc1487efef3eb42621bf922f7ff2cb1185dd9bd23798a86003e12b05a069c04206ebaae7e3d"

RPROVIDES:${PN} += "gnome-characters \
libgc.so \
typelib-Gc"

RDEPENDS:${PN} += "/usr/bin/gjs-console \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
typelib-Adw \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gc \
typelib-Gdk \
typelib-Gio \
typelib-GnomeDesktop \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-IBus \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
