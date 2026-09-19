SUMMARY = "Quick Binary Diff shared library"
DESCRIPTION = "Quick Binary Diff (qbdiff) is a tool for generating and applying binary \
patches. It builds on the general ideas of bsdiff. \
 \
It is designed to be faster than bsdiff by taking advantage of multiple CPU \
cores. It is also designed to produce generally smaller patch files, and \
supports only LZMA compression as it performs well on sparse binary data. \
Further it aims to be frugal on memory usage and provides integrity checking \
using BLAKE2B. \
 \
This package contains the shared library."
LICENSE = "LGPL-3.0-or-later & Apache-2.0"

PV = "1.0.0"

RPM_NAME = "libqbdiff0-1.0.0-1.6.aarch64.rpm"
RPM_HASH = "303058f73ec9f37d95d88640cd5c7ac88d312b731605a792cd9d5180e064f76ad4f4777e2c71130bc7cdf18bd629334b8e4f18ff1368f889f7dddc3976b7c0e0"

RPROVIDES:${PN} += "libqbdiff.so.0 \
libqbdiff0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
liblzma.so.5"

inherit rpm
