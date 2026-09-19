SUMMARY = "MPEG audio decoder and player"
DESCRIPTION = "madplay is a command-line MPEG audio decoder and player based on the MAD \
library (libmad)."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.2b"

RPM_NAME = "madplay-0.15.2b-3.11.aarch64.rpm"
RPM_HASH = "2d0d2dd6d5d2d76222d7a59adbc47b0a4c9ef19a51ca4e6d44f356bee464a72f2418553025020133bca248b79ae7df25da21bb9b264cf24aaa30305e5cc1ee3c"

RPROVIDES:${PN} += "madplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libid3tag.so.0 \
libm.so.6 \
libmad.so.0"

inherit rpm
