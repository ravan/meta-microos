SUMMARY = "Font rendering capabilities for complex non-Roman writing systems"
DESCRIPTION = "Graphite2 is a project within SIL's Non-Roman Script Initiative and Language \
Software Development groups to provide rendering capabilities for complex \
non-Roman writing systems. Graphite can be used to create 'smart fonts' capable \
of displaying writing systems with various complex behaviors. With respect to \
the Text Encoding Model, Graphite handles the 'Rendering' aspect of writing \
system implementation."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-2.0"

PV = "1.3.15"

RPM_NAME = "graphite2-1.3.15-1.3.aarch64.rpm"
RPM_HASH = "7a861fd5562a6adf8212b169ee22de667e4e198d5eb36796a1521af0402b5ab872eec7a794b9630f959f31938aee1c9be0ab1afc25107996d2dd3fe97cefc1d7"

RPROVIDES:${PN} += "graphite2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgraphite2.so.3 \
libstdc++.so.6"

inherit rpm
