SUMMARY = "Development environment for jsonrpc-glib"
DESCRIPTION = "This is a library to communicate with JSON-RPC based peers in \
either a synchronous or an asynchronous fashion. It also allows \
communicating using the GVariant serialization format instead \
of JSON when both peers support it. \
 \
This package contains all files necessary for development using \
Jsonrpc-GLib."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.2"

RPM_NAME = "jsonrpc-glib-devel-3.44.2-1.6.aarch64.rpm"
RPM_HASH = "cdbb0862b2b9d19a4fc10078b35069621a612f39ccb2edafa1295acf4bc0aaf373b5c026e29f18bcdeb722776e4eb487fe424b37b7610fa1218a55809e2c00a8"

RPROVIDES:${PN} += "jsonrpc-glib-devel \
pkgconfig-jsonrpc-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjsonrpc-glib-1-0-1 \
pkgconfig-gio-2.0 \
pkgconfig-json-glib-1.0 \
typelib-1-0-Jsonrpc-1-0"

inherit rpm
