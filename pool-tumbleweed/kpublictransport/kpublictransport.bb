SUMMARY = "QML imports for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kpublictransport-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "196140dd89e98728bc3cfc8adec8e51f302d66524f30ce10fb523a13c18f3b9989662f50e109941e6e74cb23d5f01a6eb9af2575720951cdb61de9adca0c6402"

RPROVIDES:${PN} += "kpublictransport"

RDEPENDS:${PN} += ""

inherit rpm
