SUMMARY = "Utilities for HMACs"
DESCRIPTION = "Use hmacsum to calculate a Hash-based Message Authentication Code (HMAC) of the data in a file."
LICENSE = "LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "libhmac-tools-20260522-1.10.aarch64.rpm"
RPM_HASH = "8e4aa8d8f73e65654bf339dfe90ca9a9a09dcc994a6608cd2b315553b08b263efe475450051010e44aea25e540e8ea2a021f5b4d63a6135a8b9eb55eea4f4170"

RPROVIDES:${PN} += "libhmac-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libhmac.so.1"

inherit rpm
