SUMMARY = "Introspection bindings for aravis"
DESCRIPTION = "This package provides the GObject Introspection bindings for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.36"

RPM_NAME = "typelib-1_0-Aravis-0.8-0.8.36-2.3.aarch64.rpm"
RPM_HASH = "5b6b2f6b6da3fc3c2dde649f7e217b0a2359c042faac4be5a8d6e483ba272a1497f94d65f3a92aa76b7c28d0aeedc548c3f4897bf4a073816980b2132247503a"

RPROVIDES:${PN} += "typelib-1-0-Aravis-0.8 \
typelib-Aravis"

RDEPENDS:${PN} += "libaravis-0.8.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
