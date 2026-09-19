SUMMARY = "Go runtime race detector"
DESCRIPTION = "Go runtime race detector libraries. Install this package if you wish to use the \
-race option, in order to detect race conditions present in your Go programs."
LICENSE = "BSD-3-Clause"

PV = "1.27.1"

RPM_NAME = "go1.27-race-1.27.1-1.1.aarch64.rpm"
RPM_HASH = "fc2f72651b782873c1037146591511ea8156ee4b30730baf76cc8ff0c1c9b012b6d3f0e0614c6894b4bbc865cc0675cb930d3059ce4031faae918f5a89ac3b78"

RPROVIDES:${PN} += "go1.27-race"

RDEPENDS:${PN} += "go1.27"

inherit rpm
