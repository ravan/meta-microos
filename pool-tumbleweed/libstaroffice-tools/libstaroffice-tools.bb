SUMMARY = "Tools to work with documents in StarOffice formats"
DESCRIPTION = "This package contains tools to work with documents in StarOffice file-format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-tools-0.0.7-3.20.aarch64.rpm"
RPM_HASH = "a8be094d39198b2fd00854de200739eeeed6062d8659c14a9262ad53277cdaaa18f6b2e440131edce36ada3c6b82eb983fca7f2fb4217219ea374c7aeb62e1de"

RPROVIDES:${PN} += "libstaroffice-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstaroffice-0.0.so.0 \
libstdc++.so.6"

inherit rpm
