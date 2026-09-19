SUMMARY = "A base library for writing document import filters (stream implementations)"
DESCRIPTION = "librevenge is a base library for writing document import filters. It has \
interfaces for text documents, vector graphics, spreadsheets and \
presentations. \
This package contains the different stream implementations."
LICENSE = "BSD-3-Clause & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.0.5"

RPM_NAME = "librevenge-stream-0_0-0-0.0.5-1.14.aarch64.rpm"
RPM_HASH = "b2829a0ab69c1dc9d8924da404edb352a54bb513612c6ec56a039a8cfe71d0cf1396f4e11e47190394252dce41e016989534b0b097544732ad1dbb8c92fde108"

RPROVIDES:${PN} += "librevenge-stream-0-0-0 \
librevenge-stream-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
