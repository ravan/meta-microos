SUMMARY = "Cabinet file library"
DESCRIPTION = "gcab is a tool and library for manipulating cabinet files. \
 \
It uses the GObject API and provides GIR bindings. \
It supports creation of archives with simple MSZIP compression. \
 \
This package provides a system library to access cab files"
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "libgcab-1_0-0-1.6-2.1.aarch64.rpm"
RPM_HASH = "94e82ccac7c07becc2b06665c1f3c9dd1d62b0ffd21c3886d1efd41c0a64cc42340035f2e842151fd5ffdff5ddfcc2d9b4bc2ee5112a8d1a08fa3ccff764d59c"

RPROVIDES:${PN} += "libgcab-1-0-0 \
libgcab-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libz.so.1"

inherit rpm
