SUMMARY = "Haskell crypto-token library documentation"
DESCRIPTION = "This package provides the Haskell crypto-token library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "ghc-crypto-token-doc-0.2.0-1.2.noarch.rpm"
RPM_HASH = "1de9d7230e581922bebc5fdabceada236de7de1600f549c1de83fba7a570310f170c96f90435a79d89f0dfb15e6293e3c8fe32ba185df0bab5452d6e4d91f746"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypto-token-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
