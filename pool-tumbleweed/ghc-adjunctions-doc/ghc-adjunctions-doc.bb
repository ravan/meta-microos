SUMMARY = "Haskell adjunctions library documentation"
DESCRIPTION = "This package provides the Haskell adjunctions library documentation."
LICENSE = "BSD-2-Clause"

PV = "4.4.4"

RPM_NAME = "ghc-adjunctions-doc-4.4.4-1.3.noarch.rpm"
RPM_HASH = "606b1cede63db10b62f507c2b3bf5ea725a2d7064e87275b9b22977ef3567163e8ed501c646c5bd1c1d1607d075743cb9f763c484770c6ba8fbe8f23fca9c78f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-adjunctions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
