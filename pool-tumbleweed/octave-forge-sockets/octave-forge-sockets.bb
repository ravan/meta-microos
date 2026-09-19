SUMMARY = "Socket Octave functions for networking"
DESCRIPTION = "Socket functions for networking. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "octave-forge-sockets-1.4.1-1.10.aarch64.rpm"
RPM_HASH = "63d8e4265a3401527614571b4ad4117904a3ef3b78a6d2ae242a59bdfbeefa558a9cd5a374e5dd93daa63caf0e1316db85f4d684359ce74977fb53e00c1f768c"

RPROVIDES:${PN} += "octave-forge-sockets"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
