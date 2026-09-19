SUMMARY = "JavaScript module used by Cinnamon"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "140.0"

RPM_NAME = "cjs-140.0-2.1.aarch64.rpm"
RPM_HASH = "52e4440eab9c62b18a185c9ab6ec55521838043d5c5837f7989817670f14f3abc6d8eca7ce88088f0c2475e9de27dd27d4c0459b4236dfd3ad7f514085c62a87"

RPROVIDES:${PN} += "cjs \
typelib-GjsPrivate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcjs.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmozjs-140.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject"

inherit rpm
