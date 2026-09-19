SUMMARY = "Haskell ghc-platform library documentation"
DESCRIPTION = "This package provides the Haskell ghc-platform library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-platform-doc-0.1.0.0-1.3.noarch.rpm"
RPM_HASH = "6afebd2f9b7f5bd04869eddc613fc3fd9922b6460965e5bd3d6f4f0a9dd99c50dc206e271b88b26a58ede961b3522586d7e6644dcb27526593c5c5011305cf88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-platform-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
