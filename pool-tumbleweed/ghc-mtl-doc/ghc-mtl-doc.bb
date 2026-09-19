SUMMARY = "Haskell mtl library documentation"
DESCRIPTION = "This package provides the Haskell mtl library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "ghc-mtl-doc-2.3.2-1.3.noarch.rpm"
RPM_HASH = "590011766cd3e611ef5c55a913ce1c2faf97b2f6a551cdb76385239cd9f8babc3a58d0356309d7c739e934e5a324da1d62d8cbcc7f95b40fa32a13ea76979a95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mtl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
