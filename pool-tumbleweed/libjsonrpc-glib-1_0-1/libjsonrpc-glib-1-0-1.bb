SUMMARY = "Library to communicate with JSON-RPC based peers"
DESCRIPTION = "This is a library to communicate with JSON-RPC based peers in \
either a synchronous or an asynchronous fashion. It also allows \
communicating using the GVariant serialization format instead \
of JSON when both peers support it. \
 \
This package contains the Jsonrpc-GLib shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.2"

RPM_NAME = "libjsonrpc-glib-1_0-1-3.44.2-1.6.aarch64.rpm"
RPM_HASH = "c257aa16fa21b76324e73ec5845df37909507fce637d7c12d17d2f31e94b30c51cd30fc22ad5d93eefbb16d12b83d79c2f74bd1f0a193c727f4adbf841f26ce5"

RPROVIDES:${PN} += "libjsonrpc-glib-1-0-1 \
libjsonrpc-glib-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
