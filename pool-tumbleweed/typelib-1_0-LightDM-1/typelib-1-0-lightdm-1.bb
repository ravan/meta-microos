SUMMARY = "GObject Introspection Bindings for the LightDM Client Library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
LightDM client library."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "typelib-1_0-LightDM-1-1.32.0-9.4.aarch64.rpm"
RPM_HASH = "d4bbac96fc22d567b5fd5829f1b76cb0eca78fdec049c99b07c82841fc0004f61292bd2f9478c2db1d37433a1018a3f12136236bb3e35dcca5032ebad6d1bedc"

RPROVIDES:${PN} += "typelib-1-0-LightDM-1 \
typelib-LightDM"

RDEPENDS:${PN} += "liblightdm-gobject-1.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
