SUMMARY = "Hunspell tools"
DESCRIPTION = "This package contains the munch and unmunch programs."
LICENSE = "(GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1+) & LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "hunspell-tools-1.7.2-1.14.aarch64.rpm"
RPM_HASH = "736e7c7fbd6f52f9c4c402afc38d5d9ca6fb4789bfdaedf7fd663538624e2e7286bbae7729cffc1c2fff0fda846319ab82d9ca6e8510351277f12eb2e2999b8e"

RPROVIDES:${PN} += "hunspell-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
hunspell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
