SUMMARY = "GTK3 Spell Checker Interface Library -- Introspection bindings"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.10"

RPM_NAME = "typelib-1_0-GtkSpell-3_0-3.0.10-3.19.aarch64.rpm"
RPM_HASH = "467177d46a24be188a8487cff92f0a419770819eeacd3099de436f317f97842b263c95bcb32381c6ed9dff288b95ad780e50085ea868cabc45a751d188e0e418"

RPROVIDES:${PN} += "typelib-1-0-GtkSpell-3-0 \
typelib-GtkSpell"

RDEPENDS:${PN} += "libgtkspell3-3.so.0 \
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
