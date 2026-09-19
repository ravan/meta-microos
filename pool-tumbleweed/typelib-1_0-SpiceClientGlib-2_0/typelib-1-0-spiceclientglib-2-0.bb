SUMMARY = "Gtk client and libraries for SPICE remote desktop servers - gi-bindings"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.43"

RPM_NAME = "typelib-1_0-SpiceClientGlib-2_0-0.43-1.1.aarch64.rpm"
RPM_HASH = "4991e2f30c9e5ef8586f4f46f3b8dd97959076e18e5dcd633196f7719f903b9389e0a883ebcb734583b549ed81091ae167c8336852e4bba0f002121edc9b4f66"

RPROVIDES:${PN} += "typelib-1-0-SpiceClientGlib-2-0 \
typelib-SpiceClientGLib"

RDEPENDS:${PN} += "libspice-client-glib-2.0.so.8 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Gst \
typelib-GstBase"

inherit rpm
