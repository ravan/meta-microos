SUMMARY = "Introspection bindings for MATE Desktop's AtrilView"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.4"

RPM_NAME = "typelib-1_0-AtrilView-1_5_0-1.28.4-1.2.aarch64.rpm"
RPM_HASH = "75c1864088eabe0b894e460c375a9adb205ffd32b06408f4491e3f1310b9ec4f9246c8be2de4e8ca6d169d60af8b0fb247ffe241b49bbbaed2ac6d2738e2a01b"

RPROVIDES:${PN} += "typelib-1-0-AtrilView-1-5-0 \
typelib-AtrilView"

RDEPENDS:${PN} += "libatrilview.so.3 \
typelib-Atk \
typelib-AtrilDocument \
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
