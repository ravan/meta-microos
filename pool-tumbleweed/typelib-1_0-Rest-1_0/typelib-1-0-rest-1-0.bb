SUMMARY = "Library to access RESTful web services -- Introspection bindings"
DESCRIPTION = "This library was designed to make it easier to access web services that \
claim to be 'RESTful'. A reasonable description is that a RESTful \
service should have urls that represent remote objects, which methods \
can then be called on. \
 \
This package provides the GObject Introspection bindings for librest."
LICENSE = "LGPL-2.1-only"

PV = "0.10.2"

RPM_NAME = "typelib-1_0-Rest-1_0-0.10.2-2.1.aarch64.rpm"
RPM_HASH = "13eb7002ded6a5f9f2973ce46e73f297d6f840ae6195e3b292d734fb6c78debd10223bb6bb9c638730b1ab6daccaab379f97c322eb8e608527f76bba03450821"

RPROVIDES:${PN} += "typelib-1-0-Rest-1-0 \
typelib-Rest \
typelib-RestExtras"

RDEPENDS:${PN} += "librest-1.0.so.0 \
librest-extras-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Soup"

inherit rpm
