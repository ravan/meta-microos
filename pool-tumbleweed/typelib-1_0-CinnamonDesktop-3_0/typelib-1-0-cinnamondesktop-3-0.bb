SUMMARY = "Libcinnamon-desktop API -- Introspection bindings"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
This package provides the GObject Introspection bindings for \
libcinnamon-desktop."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "typelib-1_0-CinnamonDesktop-3_0-6.4.1-1.8.aarch64.rpm"
RPM_HASH = "c32fcb2322d541e17afbcbbf264492eab47978dd28c2d1c454a0c3a4828aa6d15caa384e3c9575cc0d9654195f386dccbb65c25d2e186d50e51aa7d05ef97755"

RPROVIDES:${PN} += "typelib-1-0-CinnamonDesktop-3-0 \
typelib-CDesktopEnums \
typelib-CinnamonDesktop"

RDEPENDS:${PN} += "libcinnamon-desktop.so.4 \
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
