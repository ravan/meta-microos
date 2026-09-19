SUMMARY = "Introspection bindings for the NetworkManager client convenience library"
DESCRIPTION = "This package contains the gi-bindings that make it easier to use some \
Network Manager functionality from applications that use glib. \
 \
This package provides the GObject Introspection bindings for the \
NetworkManager library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "typelib-1_0-NM-1_0-1.56.1-4.1.aarch64.rpm"
RPM_HASH = "7a1e4a52162ed603540e16f9aac86cdf880b76c18e7d9fb58efb409294ea9791852575040a606852d8ae3e115754cb5394af535c6fccc90fe73d0ac94560e4b9"

RPROVIDES:${PN} += "typelib-1-0-NM-1-0 \
typelib-NM"

RDEPENDS:${PN} += "libnm.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
