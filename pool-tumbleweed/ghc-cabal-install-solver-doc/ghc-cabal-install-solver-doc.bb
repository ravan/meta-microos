SUMMARY = "Haskell cabal-install-solver library documentation"
DESCRIPTION = "This package provides the Haskell cabal-install-solver library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.14.1.0"

RPM_NAME = "ghc-cabal-install-solver-doc-3.14.1.0-2.3.noarch.rpm"
RPM_HASH = "c9c57e63e064af20f2f4e068953dabd6b78039c7dde21b9be1e51d493ca6db6d7e9df8b7bec53b99b72e4daa9f22afdd7133a6d4903a14864f6d27e589770561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-install-solver-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
