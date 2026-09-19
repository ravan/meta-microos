SUMMARY = "Haskell monad-control library documentation"
DESCRIPTION = "This package provides the Haskell monad-control library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.3.1"

RPM_NAME = "ghc-monad-control-doc-1.0.3.1-2.24.noarch.rpm"
RPM_HASH = "5fe99784c6951957ab9cfd29e3035960e9c2d9edbfbef8beadc5a3ee2f566b21468e62e73f9cbb07e129300863da8521e306ba316b5df966298d97637f85be23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monad-control-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
