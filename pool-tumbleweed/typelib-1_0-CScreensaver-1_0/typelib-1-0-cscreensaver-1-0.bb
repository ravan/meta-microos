SUMMARY = "Typelib for cinnamon-screensaver"
DESCRIPTION = "Typelib for cinnamon-screensaver. \
 \
This package ships the typelib for cinnamon-screensaver."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.1"

RPM_NAME = "typelib-1_0-CScreensaver-1_0-6.6.1-1.4.aarch64.rpm"
RPM_HASH = "872547f3301590f43f696848166d25f4572991f6295ed74c850e3a49c5bcee2561dde41c12e33707803148d5f86f88966468ec7006b16b11a89255698a78a08b"

RPROVIDES:${PN} += "typelib-1-0-CScreensaver-1-0 \
typelib-CScreensaver"

RDEPENDS:${PN} += "libcscreensaver.so \
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
