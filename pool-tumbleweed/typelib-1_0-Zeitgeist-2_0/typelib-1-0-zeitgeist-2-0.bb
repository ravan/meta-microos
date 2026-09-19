SUMMARY = "Introspection bindings for Zeitgeist client library"
DESCRIPTION = "Libzeitgeist is a client library for interacting with the Zeitgeist \
daemon. \
 \
This package provides the Introspection bindings for Zeitgeist."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "typelib-1_0-Zeitgeist-2_0-1.0.4-1.9.aarch64.rpm"
RPM_HASH = "3fc24a0c4e45f9455d50f67ea3dc4c1d374675ba0fe2e70e25ca97a957cc8db3f069ddc02719b054c437000dad515913721190881a543b9451c87de43faa8dab"

RPROVIDES:${PN} += "typelib-1-0-Zeitgeist-2-0 \
typelib-Zeitgeist"

RDEPENDS:${PN} += "libzeitgeist-2.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
