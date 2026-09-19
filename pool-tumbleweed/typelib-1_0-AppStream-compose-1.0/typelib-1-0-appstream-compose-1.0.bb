SUMMARY = "Introspection bindings for  AppStream Compose"
DESCRIPTION = "GObject introspection bindings for interfaces provided by AppStream Compose"
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.5"

RPM_NAME = "typelib-1_0-AppStream-compose-1.0-1.1.5-1.1.aarch64.rpm"
RPM_HASH = "65fcae7ab4f7a0cab46c5cbe0856c3035230a85289137376a13f47eeedd76eeaf97329502eab902a7c1e24bd4b563df9598a49f5dc25c686b8546dd321c626e4"

RPROVIDES:${PN} += "typelib-1-0-AppStream-compose-1.0 \
typelib-AppStreamCompose"

RDEPENDS:${PN} += "libappstream-compose.so.0 \
typelib-AppStream \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
