SUMMARY = "Library for handling Apple Binary and XML Property Lists"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains an utility to convert PList files from binary to XML and \
from XML to binary."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "plistutil-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "d325a33855d6560c26a2b8bb07594180e98b3ee3a2d7d273c67aa2cac950e8a3aed1d1c7772da50c37d4a27ae5fe4c0744bf98eda71d27ffccd2661ffb70ff81"

RPROVIDES:${PN} += "plistutil \
plutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libplist-2-0-4 \
libplist-2.0.so.4"

inherit rpm
