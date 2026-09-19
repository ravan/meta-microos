SUMMARY = "Haskell tasty library documentation"
DESCRIPTION = "This package provides the Haskell tasty library documentation."
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "ghc-tasty-doc-1.5.4-1.3.noarch.rpm"
RPM_HASH = "564c38d65d37d8a3ada889c26952e93f8c94cb30b345e918c3212ff914d4df240dc6e535f8ff26ca0b1d47fab7ea21ff404059be60cd3ff5ee095a0655f06e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
