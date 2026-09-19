SUMMARY = "Haskell monad-logger library documentation"
DESCRIPTION = "This package provides the Haskell monad-logger library documentation."
LICENSE = "MIT"

PV = "0.3.42"

RPM_NAME = "ghc-monad-logger-doc-0.3.42-1.22.noarch.rpm"
RPM_HASH = "9b57772b219bac837574e6a9f1735bdf8b2bd8ad9c27f7be62d7147824791e1fd2f255a4e2a3620d47d47e5ba68baed377669343ff3cadc900d9692494ef1221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-monad-logger-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
