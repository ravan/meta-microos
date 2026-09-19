SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.22.12"

RPM_NAME = "go1.22-race-1.22.12-7.2.aarch64.rpm"
RPM_HASH = "3aed9812e1ade03ead1456f5a2ba1c061156bbb4b003794deadf9820732568eac6fb17e701f946d6974062d5efc7435c03598b1954a402833ab61b2951aa07bb"

RPROVIDES:${PN} += "go1.22-race"

RDEPENDS:${PN} += "go1.22"

inherit rpm
