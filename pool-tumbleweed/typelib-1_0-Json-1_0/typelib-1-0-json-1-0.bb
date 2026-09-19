SUMMARY = "Introspection bindings for libjson-glib"
DESCRIPTION = "JSON-GLib provides a parser and a generator GObject classes and various \
wrappers for the complex data types employed by JSON, such as arrays \
and objects. \
 \
This package provides the GObject Introspection bindings for JSON-GLib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.10.8"

RPM_NAME = "typelib-1_0-Json-1_0-1.10.8-2.1.aarch64.rpm"
RPM_HASH = "fc0cb9079689332842956c1048da8869f0fbe07fd500b2f63b7c3f631b6921f196dcf2f89fdb9bf1b70affe7a6881a0e06a11eae1c210f4b33e13191e199e476"

RPROVIDES:${PN} += "typelib-1-0-Json-1-0 \
typelib-Json"

RDEPENDS:${PN} += "libjson-glib-1.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
