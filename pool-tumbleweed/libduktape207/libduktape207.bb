SUMMARY = "The core library for duktape"
DESCRIPTION = "Embeddable Javascript engine. \
 \
This package contains the shared library."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "libduktape207-2.7.0-3.11.aarch64.rpm"
RPM_HASH = "c9e7444a2549955b5cbc9903a05e970527effa260ff852a285a2b45f26ce0d12ef0f78574edbcb0c9383d0b6c34f2f08f79c4ce965d9b9250b7d8831eab71bf2"

RPROVIDES:${PN} += "libduktape.so.207 \
libduktape207 \
libduktaped.so.207"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
