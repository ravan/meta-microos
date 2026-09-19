SUMMARY = "Command-line tool to control the zswap kernel module options"
DESCRIPTION = "Zswap-cli is a command-line tool to control the zswap kernel module options on \
the fly. \
 \
Zswap is a compressed cache for swap pages. It takes pages that are in the \
process of being swapped out to disk and tries to compress them into a \
RAM-based memory pool with dynamic allocation. \
 \
It trades CPU cycles for a significant performance boost since reading from a \
compressed cache is much faster than reading from a swap device."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "zswap-cli-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "b5824c533d5aed170e4e1268b0a45c3c71ceac874b8bbe2290fad01d45599387c655ac147b501b72cb3386d3263cf91acd77f207221dd6c824a8d2072e7978d4"

RPROVIDES:${PN} += "config-zswap-cli \
zswap-cli"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
