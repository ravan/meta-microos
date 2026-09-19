SUMMARY = "JSON-RPC based peers lib -- Introspection bindings"
DESCRIPTION = "This is a library to communicate with JSON-RPC based peers in \
either a synchronous or an asynchronous fashion. It also allows \
communicating using the GVariant serialization format instead \
of JSON when both peers support it. \
 \
This package contains the Jsonrpc-GLib introspection bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.2"

RPM_NAME = "typelib-1_0-Jsonrpc-1_0-3.44.2-1.6.aarch64.rpm"
RPM_HASH = "f9df7b0ac8b930ec015bed8d7dd31c42cd284db7ed23ade10451b2beca0e50f3c8f5694ebb0f96e84a3ada8f44833783273a619ec6ea02dc2e6c9929db06c92c"

RPROVIDES:${PN} += "typelib-1-0-Jsonrpc-1-0 \
typelib-Jsonrpc"

RDEPENDS:${PN} += "libjsonrpc-glib-1.0.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
