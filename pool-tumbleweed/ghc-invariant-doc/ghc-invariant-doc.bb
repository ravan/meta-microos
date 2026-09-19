SUMMARY = "Haskell invariant library documentation"
DESCRIPTION = "This package provides the Haskell invariant library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.5"

RPM_NAME = "ghc-invariant-doc-0.6.5-1.3.noarch.rpm"
RPM_HASH = "9c123bd7bc1aa2ad7b0934ab89eb321dbc0561c0633a9e1fa29a8dcd0bec89b6f051e23e54d985987bd2cfa476e91214ed8b4e137410b0e6a216a1ee6d50dfdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-invariant-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
