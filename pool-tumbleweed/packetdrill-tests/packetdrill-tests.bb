SUMMARY = "Sample test scripts for packetdrill"
DESCRIPTION = "Collection of sample test scripts from Google for packetdrill utility."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "2.0+git.20260514"

RPM_NAME = "packetdrill-tests-2.0+git.20260514-2.2.noarch.rpm"
RPM_HASH = "69bd043b96baaffd9862cd2c4a7b88f8939c6e722e93465f505c11d0dc5c2ab6cce1acc599230b3c43c83692dcd48f391a4d79889c9d7010a08a990f1a35885e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "packetdrill-tests"

RDEPENDS:${PN} += ""

inherit rpm
