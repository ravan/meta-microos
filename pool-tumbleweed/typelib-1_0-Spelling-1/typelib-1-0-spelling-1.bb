SUMMARY = "Introspection file for libspelling"
DESCRIPTION = "Introspection file for libspelling."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.10"

RPM_NAME = "typelib-1_0-Spelling-1-0.4.10-4.1.aarch64.rpm"
RPM_HASH = "a3e647c12d4c4a763c3e6907b996034d996cecea2ed12d5930ac2e3376850a6c8446489df8ec4252133bc384ad2451b1dac076b0a29be867c0b14bd8e3ac00c1"

RPROVIDES:${PN} += "typelib-1-0-Spelling-1 \
typelib-Spelling"

RDEPENDS:${PN} += "libspelling-1.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
