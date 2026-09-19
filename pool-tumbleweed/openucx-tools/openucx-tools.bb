SUMMARY = "OpenUCX utilities"
DESCRIPTION = "Miscallaneous utilities for Unified Communication X."
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "openucx-tools-1.21.0-1.2.aarch64.rpm"
RPM_HASH = "ae1866c6be599b843a7dd4361b316c2758aa1223381eadc97b2315d96ac75dbf24dfe85faf61b5c2594a7745a67d7ca5a95a1445e7fd7923e4dafff0601ad923"

RPROVIDES:${PN} += "config-openucx-tools \
openucx-tools \
pkgconfig-ucx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libstdc++.so.6 \
libucp.so.0 \
libucs.so.0 \
libuct.so.0 \
pkgconfig-ucx-ucs \
pkgconfig-ucx-uct"

inherit rpm
