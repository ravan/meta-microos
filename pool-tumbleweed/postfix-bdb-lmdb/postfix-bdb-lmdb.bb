SUMMARY = "Postfix plugin to support LMDB maps"
DESCRIPTION = "Postfix plugin to support LMDB maps. This library will be loaded \
by starting postfix if you'll access a postmap which is stored in \
lmdb."
LICENSE = "EPL-2.0 | IPL-1.0"

PV = "3.11.7"

RPM_NAME = "postfix-bdb-lmdb-3.11.7-1.1.aarch64.rpm"
RPM_HASH = "570e0faa2b35619db9633eae35c06898091459ed39bbfd3f7158923214678c7eeb69f48b85d3c4523d6c9a78d622404af9abe2b33527c5afd96ca13f117419fa"

RPROVIDES:${PN} += "postfix-bdb-lmdb \
postfix-lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.35.so \
postfix-bdb"

inherit rpm
