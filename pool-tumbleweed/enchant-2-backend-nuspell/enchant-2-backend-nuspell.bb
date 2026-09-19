SUMMARY = "Nuspell backend for the Enchant spell checking library"
DESCRIPTION = "Nuspell plugin for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.19"

RPM_NAME = "enchant-2-backend-nuspell-2.8.19-1.1.aarch64.rpm"
RPM_HASH = "82cb51ee31878586de6670df8706d7710eaa2e95bd49f420e818c2621043c92b8ec51b1ef2097625d6cda4c0478bdcd6fc2f115984ef8fba362b85f6b4c945d6"

RPROVIDES:${PN} += "enchant-2-backend \
enchant-2-backend-nuspell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libicuuc.so.78 \
libnuspell.so.5 \
libstdc++.so.6"

inherit rpm
