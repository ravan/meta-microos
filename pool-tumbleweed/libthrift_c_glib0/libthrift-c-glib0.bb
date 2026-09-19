SUMMARY = "C API for the Thrift software framework"
DESCRIPTION = "Shared library providing the C API for the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "libthrift_c_glib0-0.24.0-2.1.aarch64.rpm"
RPM_HASH = "79ed7e0a5201497da4b7979cd3f0af8560510c1188318fc1e6133799e20c8f225249de0e721130c414a05c24f26af86f576b3d1674e39f9add198ea2f29fbde8"

RPROVIDES:${PN} += "libthrift-c-glib.so.0 \
libthrift-c-glib0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libssl.so.3 \
libz.so.1"

inherit rpm
