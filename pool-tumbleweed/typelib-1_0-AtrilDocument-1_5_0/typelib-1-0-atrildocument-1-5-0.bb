SUMMARY = "Introspection bindings for MATE Desktop's AtrilDocument"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.4"

RPM_NAME = "typelib-1_0-AtrilDocument-1_5_0-1.28.4-1.2.aarch64.rpm"
RPM_HASH = "ee77b7ef823372a681ccccbc1daff13e2574be311eedfe2d933fc4ac28405e7648a69cd44277762c05a75089d8aa48ad92d4cfac2956d9e28dd6a7df5ece5016"

RPROVIDES:${PN} += "typelib-1-0-AtrilDocument-1-5-0 \
typelib-AtrilDocument"

RDEPENDS:${PN} += "libatrildocument.so.3 \
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
