SUMMARY = "Haskell template-haskell library documentation"
DESCRIPTION = "This package provides the Haskell template-haskell library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.23.0.0"

RPM_NAME = "ghc-template-haskell-doc-2.23.0.0-1.3.noarch.rpm"
RPM_HASH = "7feb7bf91cf12f52558a6018f78783fbfabe85cc434dea96a5e303fe420fa5f967d96c94bd60a7a37de1bc0abb967cf860dbacf1dbbe2ed8e9aae584250b8d77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-template-haskell-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
