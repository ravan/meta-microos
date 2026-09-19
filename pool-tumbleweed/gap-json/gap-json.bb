SUMMARY = "GAP: Package for reading and writing JSON"
DESCRIPTION = "Enhances GAP by the ability to read and write JSON files."
LICENSE = "BSD-2-Clause"

PV = "2.4.0"

RPM_NAME = "gap-json-2.4.0-1.3.aarch64.rpm"
RPM_HASH = "fae9c59d2114f8bb2dd5902f09346b211ba17ac9e6acedaefc7967f890a1b1ec41d05fe47209534023776a3165e85940277c683110663f53e5968ab8b1dadda1"

RPROVIDES:${PN} += "gap-json"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
