SUMMARY = "Common API for various MATE modules typelib"
DESCRIPTION = "This package contains the library with common API for various \
MATE modules."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.2"

RPM_NAME = "typelib-1_0-MateDesktop-2_0-1.28.2-1.13.aarch64.rpm"
RPM_HASH = "8706eac34c35a054fe9ded3306d3a878a42d07e56f55a276ea1251951c08694ace1551bc7271fea1b4122aa29f02d8a19b654c6dd240e88b55d2b5c193e0c064"

RPROVIDES:${PN} += "typelib-1-0-MateDesktop-2-0 \
typelib-MateDesktop"

RDEPENDS:${PN} += "libmate-desktop-2.so.17 \
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
