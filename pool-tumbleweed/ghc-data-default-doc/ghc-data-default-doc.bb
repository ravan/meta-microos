SUMMARY = "Haskell data-default library documentation"
DESCRIPTION = "This package provides the Haskell data-default library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.0.2"

RPM_NAME = "ghc-data-default-doc-0.8.0.2-1.3.noarch.rpm"
RPM_HASH = "4f4adba58660fc9ecbfbcaeed0370a62471c90a202a463caf2acad5d4b648b51936f560f51f4951fef69d5a0ce11c065fbcb08e0db1f0c424a98a00e3a828c40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
