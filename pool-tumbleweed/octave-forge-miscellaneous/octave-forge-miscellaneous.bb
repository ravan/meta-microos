SUMMARY = "Miscellaneous functions for Octave"
DESCRIPTION = "Miscellaneous functions for Octave. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.3"

RPM_NAME = "octave-forge-miscellaneous-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "826513c84f47dd1d8cabb2196b219a9fb1cb0df1e842c1f1c2ee1bb9934dbde1ad955493581771ffe790c64bc83f3d17456566d81226c81c40d2ea28c8a3b483"

RPROVIDES:${PN} += "octave-forge-miscellaneous"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
octave-forge-general \
units"

inherit rpm
