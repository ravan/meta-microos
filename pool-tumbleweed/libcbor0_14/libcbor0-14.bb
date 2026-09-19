SUMMARY = "Library for parsing Concise Binary Object Representation (CBOR)"
DESCRIPTION = "libcbor is a C99 library for parsing and generating CBOR (RFC 7049), \
a general-purpose schema-less binary data format. \
 \
It supports flexible memory management, UTF-8, streams & incremental \
processing, and has a layered architecture."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "libcbor0_14-0.14.0-1.3.aarch64.rpm"
RPM_HASH = "b8e0266bc0c69cd172a00ab037791377a321138ae945072e02d3ebf2116faa9c2ee7091526cea9fdd9395f559b6d143d8a9e68f06a7314f70cf0fd718e1df29f"

RPROVIDES:${PN} += "libcbor.so.0.14 \
libcbor0-14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
