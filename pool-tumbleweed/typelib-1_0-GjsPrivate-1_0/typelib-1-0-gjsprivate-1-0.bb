SUMMARY = "Introspection bindings for the GJS library"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "1.88.1"

RPM_NAME = "typelib-1_0-GjsPrivate-1_0-1.88.1-2.1.aarch64.rpm"
RPM_HASH = "d41ebbdcc4dec29087fab13087f87016afcf04e9a305d70df157b3c0c3afccb3be4b6597b9b22120782889b7dc46cd21dc3b8c396599040db5b52589f3176daf"

RPROVIDES:${PN} += "GjsPrivate-by-GNOME \
typelib-1-0-GjsPrivate-1-0 \
typelib-GjsPrivate"

RDEPENDS:${PN} += "libgjs.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject"

inherit rpm
