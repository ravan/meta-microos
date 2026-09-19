SUMMARY = "Haskell splitmix library documentation"
DESCRIPTION = "This package provides the Haskell splitmix library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3.2"

RPM_NAME = "ghc-splitmix-doc-0.1.3.2-1.3.noarch.rpm"
RPM_HASH = "7757b8f628120f0d63ccdbc2c575f882569e8f82c17d93f97893a7792ab668f4c38e18313cf062b490e5428b2226635272f785008ee567cfa643d30fb2ba42a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-splitmix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
