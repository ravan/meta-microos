SUMMARY = "Hunspell backend for the Enchant spell checking library"
DESCRIPTION = "Hunspell plugin for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.19"

RPM_NAME = "enchant-2-backend-hunspell-2.8.19-1.1.aarch64.rpm"
RPM_HASH = "c2290c218c9e1d16a404c049678b78287c7ed2da77e314208781b078088a936c90cfbabfa5cec568ab260259638bda6b3e16599a5b9a592f36663051b42c99ac"

RPROVIDES:${PN} += "enchant-2-backend \
enchant-2-backend-hunspell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
