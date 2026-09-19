SUMMARY = "Introspection bindings for AppStream"
DESCRIPTION = "GObject introspection bindings for interfaces provided by AppStream."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "typelib-1_0-AppStream-1.0-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "99458431ed1163b10d800c099a6fcd6a460e38d2779ce53e04a8f0d534073d3fdbccfea26727f9e921285fc6d1309726bfc71c53b27c35a6afff792070b341cb"

RPROVIDES:${PN} += "typelib-1-0-AppStream-1.0 \
typelib-AppStream"

RDEPENDS:${PN} += "libappstream.so.5 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
