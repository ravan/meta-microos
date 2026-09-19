SUMMARY = "Introspection bindings for libmbim"
DESCRIPTION = "libmbim is a glib-based library for talking to WWAN modems and devices \
which speak the Mobile Broadband Interface Model (MBIM) protocol. \
 \
This package provides the GObject Introspection bindings for libmbim."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.34.0"

RPM_NAME = "typelib-1_0-Mbim-1_0-1.34.0-1.4.aarch64.rpm"
RPM_HASH = "c16ed12917ee84e29ba33b4635a638a7e10083067a157e37fe1003eb3c42021da608e94c9e35e5047e5815f6f1f5f18df808ae4b2fabd85ff302d5191743e688"

RPROVIDES:${PN} += "typelib-1-0-Mbim-1-0 \
typelib-Mbim"

RDEPENDS:${PN} += "libmbim-glib.so.4 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
