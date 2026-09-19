SUMMARY = "Additional manipulation functions for Octave"
DESCRIPTION = "Additional manipulation functions. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later"

PV = "1.3.2"

RPM_NAME = "octave-forge-strings-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "d42fac8392b6ea7387504ab476153374274f9b4d4cf69135883c36f15ed25475a40282e817561f44259dfc89e8beea66387fb7f370c7edb275243b6db1e73d69"

RPROVIDES:${PN} += "octave-forge-strings"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpcre2-8.so.0 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm
