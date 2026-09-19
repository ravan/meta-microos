SUMMARY = "Haskell th-orphans library documentation"
DESCRIPTION = "This package provides the Haskell th-orphans library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13.17"

RPM_NAME = "ghc-th-orphans-doc-0.13.17-1.3.noarch.rpm"
RPM_HASH = "899d295ba630f0bc2c3eb82c167a3f2dc6e6689fd90253f5a17a1b39f10b93852742e91dc7ee37e6dce792791eb6b16a630e3bb32779f9111c7617b2d91f04a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-th-orphans-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
