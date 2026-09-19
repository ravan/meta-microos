SUMMARY = "Yet Another JSON Library Tools"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides a few command-line utilities for processing JSON files."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "yajl-2.1.0-9.6.aarch64.rpm"
RPM_HASH = "4dc0007d77b595f10edb673397eadbf8d46b151435dc82a11671b69b67fc5313e2d3fdb2a1791c830ac513a7c1e17754df3a3d93accea7c1dda5c8d34b85b4b3"

RPROVIDES:${PN} += "yajl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libyajl2"

inherit rpm
