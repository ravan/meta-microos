SUMMARY = "Application indicators library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the appindicator \
library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "typelib-1_0-AppIndicator3-0_1-12.10.1~bzr20200706.298-4.10.aarch64.rpm"
RPM_HASH = "0a013275400299e68269478ebff73fbcc79d3fab8240ffa89b243dff8ecbc57cc96846865628b2e853b3fa80d56b136166d1fc022a34301e48eda03010d5d255"

RPROVIDES:${PN} += "typelib-1-0-AppIndicator3-0-1 \
typelib-AppIndicator3"

RDEPENDS:${PN} += "libappindicator3.so.1 \
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
