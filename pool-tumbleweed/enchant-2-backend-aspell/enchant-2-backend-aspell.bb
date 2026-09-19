SUMMARY = "Aspell backend for the Enchant spell checking library"
DESCRIPTION = "Aspell plugin for enchant, a library providing an efficient \
extensible abstraction for dealing with different spell checking \
libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.8.19"

RPM_NAME = "enchant-2-backend-aspell-2.8.19-1.1.aarch64.rpm"
RPM_HASH = "482140776ecd65def7a15e150bddfe793bd75ac4c94a7131d64e7c4dbe2d18bd6bdf9556365168baf0434fd2b9a082ea9617d1293d32d8e343306a66631caf91"

RPROVIDES:${PN} += "enchant-2-backend \
enchant-2-backend-aspell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaspell.so.15 \
libc.so.6 \
libenchant-2.so.2 \
libglib-2.0.so.0"

inherit rpm
