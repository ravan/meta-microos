SUMMARY = "Haskell tagged library documentation"
DESCRIPTION = "This package provides the Haskell tagged library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.10"

RPM_NAME = "ghc-tagged-doc-0.8.10-2.3.noarch.rpm"
RPM_HASH = "afb655aba0e631a6648e76def6e83695f3ab4c6c754e7a440279964616e1b2c571f95ae3f686f0b3b7b29a3ffb25b2d4113df5b3084d6c06bfad9036f1c56b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tagged-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
