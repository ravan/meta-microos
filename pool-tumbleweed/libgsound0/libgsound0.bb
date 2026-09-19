SUMMARY = "Shared library for gsound"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library. \
 \
This package provides the shared library for gsound."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "libgsound0-1.0.3-2.21.aarch64.rpm"
RPM_HASH = "e399ea7d898c5ac358580cc0072e28e6bb4623c26726e2909e9250e9bf2af640720549da03b746b9a6f6674230a23f61f87217b3b5ab05dfb7993cb8ed82e87b"

RPROVIDES:${PN} += "libgsound.so.0 \
libgsound0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcanberra.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
