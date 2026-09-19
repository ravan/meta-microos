SUMMARY = "Haskell cabal-doctest library documentation"
DESCRIPTION = "This package provides the Haskell cabal-doctest library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.12"

RPM_NAME = "ghc-cabal-doctest-doc-1.0.12-2.3.noarch.rpm"
RPM_HASH = "604909cb4c7d55a55638615b946e0ab8c2634a4fa1fe03eabc1830c49897a014f55c816c7b186c3c28468598e11125733dc134a2258a78e472784fbc9fe3f45b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-doctest-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
