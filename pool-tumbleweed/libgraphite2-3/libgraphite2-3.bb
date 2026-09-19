SUMMARY = "Text categorization library"
DESCRIPTION = "Graphite2 is a project within SIL's Non-Roman Script Initiative and Language \
Software Development groups to provide rendering capabilities for complex \
non-Roman writing systems. Graphite can be used to create 'smart fonts' capable \
of displaying writing systems with various complex behaviors. With respect to \
the Text Encoding Model, Graphite handles the 'Rendering' aspect of writing \
system implementation."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-2.0"

PV = "1.3.15"

RPM_NAME = "libgraphite2-3-1.3.15-1.3.aarch64.rpm"
RPM_HASH = "9ee3b6f481f7f2839fc102839fd9c1401dbbbd023e8dac50b1d269287899460c1696a3098f9789b34f33be6c08e850cb9f05080a19d13a1f5a1b003bb1b577f2"

RPROVIDES:${PN} += "libgraphite2-3 \
libgraphite2.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
