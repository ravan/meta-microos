SUMMARY = "Introspection bindings for the Qualcomm IPC Router protocol helper library"
DESCRIPTION = "This package provides the introspection bindings for the Qualcomm IPC Router protocol helper library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.2"

RPM_NAME = "typelib-1_0-Qrtr-1_0-1.2.2-1.17.aarch64.rpm"
RPM_HASH = "b8001c31632660aa9bb59b94b2dbec38718a6dc023d917c686a74730f3f3ccc664a4c94d42be4fb7009e6ea0958079d08be5116d9cf1b4942c0ee55cf4bff13c"

RPROVIDES:${PN} += "typelib-1-0-Qrtr-1-0 \
typelib-Qrtr"

RDEPENDS:${PN} += "libqrtr-glib.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
