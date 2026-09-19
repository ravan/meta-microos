SUMMARY = "Documentation for the OpenCSD API"
DESCRIPTION = "OpenCSD is an Arm CoreSight Trace Decode library."
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "OpenCSD-doc-1.8.3-1.2.noarch.rpm"
RPM_HASH = "1d63c846b0652d1ce7eb1cb7bb3289846f86cda71c8fcf102dd68867fe06cfcb4552e9f19c4d801052ed2b695987ea1a224da05495bb38206e8e4ecfb538045d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenCSD-doc"

RDEPENDS:${PN} += ""

inherit rpm
