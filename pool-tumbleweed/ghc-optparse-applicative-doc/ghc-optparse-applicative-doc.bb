SUMMARY = "Haskell optparse-applicative library documentation"
DESCRIPTION = "This package provides the Haskell optparse-applicative library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.19.0.0"

RPM_NAME = "ghc-optparse-applicative-doc-0.19.0.0-2.3.noarch.rpm"
RPM_HASH = "bd5d41773e0d9ba84315800e76e09436eca36f4e381d4d7b7f2235d9fc068789ab55ac11239193c12c098204ca89c56c58cb1c616177bf2601044aaa99dc9156"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-optparse-applicative-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
