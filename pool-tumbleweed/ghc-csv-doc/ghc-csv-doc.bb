SUMMARY = "Haskell csv library documentation"
DESCRIPTION = "This package provides the Haskell csv library documentation."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "ghc-csv-doc-0.1.2-4.19.noarch.rpm"
RPM_HASH = "056a84f9ce75d36a8052d992e73e908dc7e9aed91ffb06117fa9af90fb35342db95b821f27f4bc0d37bf5ce32e8e54ee7e1b67e91f25bc46eefb870950461dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-csv-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
