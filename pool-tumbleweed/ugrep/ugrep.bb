SUMMARY = "Universal grep: a feature-rich grep implementation with focus on speed"
DESCRIPTION = "Ugrep supports an interactive query UI and can search file systems, source \
code, text, binary files, archives, compressed files, documents and use \
fuzzy search."
LICENSE = "BSD-3-Clause"

PV = "7.8.4"

RPM_NAME = "ugrep-7.8.4-1.1.aarch64.rpm"
RPM_HASH = "986eda0de7f75677e95dc361042f88ef301dd14d84a7b52a0682ada7550e25f8dc1addd903a566f8f1f4daffaab6866c7827aec2296ecf387905275b749795ce"

RPROVIDES:${PN} += "ugrep \
ugrep-indexer"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbz2.so.1 \
libbzip3.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblz4.so.1 \
liblzma.so.5 \
libpcre2-8.so.0 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
