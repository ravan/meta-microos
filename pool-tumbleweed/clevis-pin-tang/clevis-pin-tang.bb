SUMMARY = "Tang pin integration for Clevis"
DESCRIPTION = "Support for Tang, a server implementation which provides cryptographic binding services without the need for an escrow."
LICENSE = "GPL-3.0-or-later"

PV = "21"

RPM_NAME = "clevis-pin-tang-21-1.6.aarch64.rpm"
RPM_HASH = "d2418fda0b277f3ee5084b8f28942bb0596422c27b673b148d80f3621610816a969663c811bb90afba308d73a0c1dd80950eb8aa9cca2caaac0c230c6ccc5673"

RPROVIDES:${PN} += "clevis-pin-tang"

RDEPENDS:${PN} += "/usr/bin/bash \
curl"

inherit rpm
