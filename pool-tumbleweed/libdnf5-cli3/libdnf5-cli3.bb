SUMMARY = "Library for working with a terminal in a command-line package manager"
DESCRIPTION = "Library for working with a terminal in a command-line package manager."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "libdnf5-cli3-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "8a276b67d1cb0b3278fc5b1418b79ed592b5780b72a614deae92d5410f093923c3b957ff19a5bf375a64e52624e0a6fa4cc909544cb90042d6e85d7781b43eaa"

RPROVIDES:${PN} += "libdnf5-cli.so.3 \
libdnf5-cli3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libsmartcols.so.1 \
libstdc++.so.6"

inherit rpm
