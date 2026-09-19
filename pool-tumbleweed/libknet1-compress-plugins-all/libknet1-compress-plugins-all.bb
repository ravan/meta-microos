SUMMARY = "Provides libknet1 compress plugins meta package"
DESCRIPTION = " Meta package to install all of libknet1 compress plugins"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.33"

RPM_NAME = "libknet1-compress-plugins-all-1.33-2.2.aarch64.rpm"
RPM_HASH = "b178d0464565dfdf13846dd26083323434c8a75689a0c8fd4675598b33bf85a9d196cd1e7624b2349c0dbc0c4ccd79c03afbe65c552f2cd29a37f8f27721329b"

RPROVIDES:${PN} += "libknet1-compress-plugins-all"

RDEPENDS:${PN} += "libknet1-compress-bzip2-plugin \
libknet1-compress-lz4-plugin \
libknet1-compress-lzma-plugin \
libknet1-compress-lzo2-plugin \
libknet1-compress-zlib-plugin \
libknet1-compress-zstd-plugin"

inherit rpm
