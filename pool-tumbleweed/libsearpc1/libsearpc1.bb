SUMMARY = "Library to handle the serialization/deserialization part of RPC"
DESCRIPTION = "Searpc is a simple C language RPC framework based on GObject system. Searpc handles the serialization/deserialization part of RPC, the transport part is left to users. \
 \
The serialization/deserialization uses JSON format via json-glib library. A serialized json object is returned from server to client after executing the RPC function. Each RPC function defined in the server side should take an extra GError argument to report error."
LICENSE = "Apache-2.0"

PV = "3.3.0.20250303"

RPM_NAME = "libsearpc1-3.3.0.20250303-1.6.aarch64.rpm"
RPM_HASH = "f51738a69499073d2b966e5689601a9e4a5767474a331f83fa20f326141f4f71dec115d2ce469858e8cbeff7debece37fa5fd29d7634e0e183a8129a4fc7fb03"

RPROVIDES:${PN} += "libsearpc.so.1 \
libsearpc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4"

inherit rpm
