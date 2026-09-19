SUMMARY = "XReaderView -- Introspection Bindings"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "typelib-1_0-XreaderView-1_5-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "5622a0451815fe3aba08c38bcd8aba5890a9a58267961a8f12694642e778e83c4dab366345358e7b9d866c0724d510c68152969e46f495f2db1934e0973cdc24"

RPROVIDES:${PN} += "typelib-1-0-XreaderView-1-5 \
typelib-1-0-XreaderView-1-5-0 \
typelib-XreaderView"

RDEPENDS:${PN} += "libxreaderview.so.3 \
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
typelib-XreaderDocument \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
