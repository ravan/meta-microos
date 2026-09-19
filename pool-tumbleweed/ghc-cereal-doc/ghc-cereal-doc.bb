SUMMARY = "Haskell cereal library documentation"
DESCRIPTION = "This package provides the Haskell cereal library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-doc-0.5.8.3-2.35.noarch.rpm"
RPM_HASH = "1fcace96af3d2a482b96d05fcbce02f903f314d5194198bf637422ac6c9e2ef5fa65fbf01b43d88c7d8e06a61c3ad0dccff5a114a3a105d0f208bea4a1f59f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cereal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
