SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
ayatana appindicator library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.93"

RPM_NAME = "typelib-1_0-AyatanaAppIndicator-0_1-0.5.93-3.4.aarch64.rpm"
RPM_HASH = "7daa104ce291d6f8ab874965975d30751a4694e8d62d607d22cf3ab53630193159ad58b69d207c62102b4b1f444f1cf3a4ea55371b600edac0ec7817664ad27c"

RPROVIDES:${PN} += "typelib-1-0-AyatanaAppIndicator-0-1 \
typelib-AyatanaAppIndicator"

RDEPENDS:${PN} += "libayatana-appindicator.so.1 \
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
typelib-freetype2"

inherit rpm
