SUMMARY = "Manual for hsqldb"
DESCRIPTION = "Manual for hsqldb."
LICENSE = "BSD-3-Clause"

PV = "2.7.4"

RPM_NAME = "hsqldb-manual-2.7.4-1.7.noarch.rpm"
RPM_HASH = "8faf32a27dca65eca9c6bae7cdb39de1537466aeb7102193e2ae2a158b26aa6e34c731fcd999fb219b0099759b56434c1c6532e9f76f8c98db2e576f5c5fe5e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hsqldb-manual"

RDEPENDS:${PN} += ""

inherit rpm
