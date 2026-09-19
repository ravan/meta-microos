SUMMARY = "Development files for ewah-bool-utils"
DESCRIPTION = "This package contains files for developing applications using \
ewah-bool-utils."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python314-ewah-bool-utils-devel-1.1.0-1.15.aarch64.rpm"
RPM_HASH = "458a9b5c71d3c2e98bcbf109f4ba1a918eb685ee1adf50c7beab8e1e4e25459b66a359892c8d0453d183799632ae326eca31837038cac4a7692130f01ea18324"

RPROVIDES:${PN} += "python314-ewah-bool-utils-devel"

RDEPENDS:${PN} += "python314-ewah-bool-utils"

inherit rpm
