SUMMARY = "Voikko backend for the Enchant spell checking library"
DESCRIPTION = "Voikko plugin (Finnish) for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.19"

RPM_NAME = "enchant-2-backend-voikko-2.8.19-1.1.aarch64.rpm"
RPM_HASH = "4bfed8865834b352cb3e766e83f3a09422c6c394082c6708716302bec75e7676eaadee9d8395c57533b4614eaf66869bc2c33090c21b1766692812393b7a49b3"

RPROVIDES:${PN} += "enchant-2-backend \
enchant-2-backend-voikko \
locale-libenchant-2-2-fi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libglib-2.0.so.0 \
libvoikko.so.1"

inherit rpm
