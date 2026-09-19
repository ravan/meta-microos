SUMMARY = "Introspection bindings for Libgee"
DESCRIPTION = "Libgee is a collection library providing GObject-based interfaces and \
classes for commonly used data structures. \
 \
This package provides the GObject Introspection bindings for Libgee."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.8"

RPM_NAME = "typelib-1_0-Gee-0_8-0.20.8-1.8.aarch64.rpm"
RPM_HASH = "f9786ede7c05efad8fbc8109a73d7336632f3f43a311ad7d70d8bc94c9893e2687a088401a96d208a560963f5382529790acc260adb91937fe4413619d4cddc9"

RPROVIDES:${PN} += "typelib-1-0-Gee-0-8 \
typelib-Gee"

RDEPENDS:${PN} += "libgee-0.8.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
