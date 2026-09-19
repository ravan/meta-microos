SUMMARY = "Library for handling Apple Binary and XML Property Lists -- Python Bindings"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains the python bindings."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "python3-plist-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "81ceb179e3b5c628ff59e4d8a1f869aedf20de58e8f17eeea4a3a5e1dea89367399fbc87c8d5b6d96af33d69ed72afc5bb8c11a690620701443205a55415e261"

RPROVIDES:${PN} += "python3-plist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libplist-2-0-4 \
libplist-2.0.so.4 \
libpython3.13.so.1.0 \
python-abi"

inherit rpm
