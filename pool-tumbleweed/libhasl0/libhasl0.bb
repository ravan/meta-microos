SUMMARY = "Library files for hasl"
DESCRIPTION = "Library files for hasl."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.0"

RPM_NAME = "libhasl0-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "6c9c404b83c0ae032d3d232e729a49019c4cf9245ca34e17f2a458987d9eafb2a58c49fec27d33ce628a1dfe137310b33cc886e8421676ea85bab1a9f101c3db"

RPROVIDES:${PN} += "hasl \
libhasl.so.0 \
libhasl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libidn.so.12"

inherit rpm
