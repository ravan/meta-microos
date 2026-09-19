SUMMARY = "Haskell tasty-quickcheck library documentation"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck library documentation."
LICENSE = "MIT"

PV = "0.11.1"

RPM_NAME = "ghc-tasty-quickcheck-doc-0.11.1-5.3.noarch.rpm"
RPM_HASH = "d283b970818a4fbe3a0972085fce9f39d34c8cea70c2efd6f462235b82204382336088be4c5e58b5b5c48f5384bdf5fa344a59002f487c63a9feb9b6bbc5c6a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-quickcheck-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
