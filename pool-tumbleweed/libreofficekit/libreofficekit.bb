SUMMARY = "A library providing access to LibreOffice functionality"
DESCRIPTION = "LibreOfficeKit can be used to access LibreOffice functionality \
through C/C++, without any need to use UNO."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreofficekit-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "8b3016c275b37f24712a7032147a1df6d0eba52a5414b278b053477c4531bf2c5e18b8699f8cabf87745a0f025008f1da55dd2c8ff49343231b0184f3b5e689a"

RPROVIDES:${PN} += "libreofficekit \
typelib-LOKDocView"

RDEPENDS:${PN} += "liblibreofficekitgtk.so \
libreoffice \
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
