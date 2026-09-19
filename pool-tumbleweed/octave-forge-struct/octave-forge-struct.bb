SUMMARY = "Additional Structure manipulations functions for Octave"
DESCRIPTION = "Additional Structure manipulations functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.18"

RPM_NAME = "octave-forge-struct-1.0.18-1.17.aarch64.rpm"
RPM_HASH = "fc86206b3e7ef598228ab98f23656ab398b5c9f5b7d99004caf96c1f43c7a23fff497475696e316f611016312f8c7e2d2566f6402f156ce6a49760a743245a3c"

RPROVIDES:${PN} += "octave-forge-struct"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
