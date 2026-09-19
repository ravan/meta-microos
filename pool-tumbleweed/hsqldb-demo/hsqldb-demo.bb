SUMMARY = "Demo for hsqldb"
DESCRIPTION = "Demonstrations and samples for hsqldb."
LICENSE = "BSD-3-Clause"

PV = "2.7.4"

RPM_NAME = "hsqldb-demo-2.7.4-1.7.noarch.rpm"
RPM_HASH = "c7f2a183f38da87e2c67f7a5c9964da51be763b29c4ca3ac4e69e335d218b86556ed5039e19fea96a729bae44fd0008a6182bb2903bf193adea3e9cb530d18c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hsqldb-demo"

RDEPENDS:${PN} += "hsqldb"

inherit rpm
