SUMMARY = "Haskell syb library documentation"
DESCRIPTION = "This package provides the Haskell syb library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.7.4"

RPM_NAME = "ghc-syb-doc-0.7.4-1.3.noarch.rpm"
RPM_HASH = "500442729e25da5d6ca61e0cf8f27382780ff210fecf075fc895cc7e3a3872ff0c35711b9638132df61730fa34f5156b5c88b3e4584314d6418dbf484969e392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-syb-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
