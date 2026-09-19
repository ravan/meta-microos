SUMMARY = "Development files for ewah-bool-utils"
DESCRIPTION = "This package contains files for developing applications using \
ewah-bool-utils."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python313-ewah-bool-utils-devel-1.1.0-1.15.aarch64.rpm"
RPM_HASH = "e2e5bb4eb8e97724b08c33c91638d296a2957af165c95430fa64d941628f89bb6851933743fc63e17e3e40d0ac895a1b816324505fc23fa52c4dcec131d66737"

RPROVIDES:${PN} += "python3-ewah-bool-utils-devel \
python313-ewah-bool-utils-devel"

RDEPENDS:${PN} += "python313-ewah-bool-utils"

inherit rpm
