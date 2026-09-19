SUMMARY = "Haskell mono-traversable library documentation"
DESCRIPTION = "This package provides the Haskell mono-traversable library documentation."
LICENSE = "MIT"

PV = "1.0.21.0"

RPM_NAME = "ghc-mono-traversable-doc-1.0.21.0-1.25.noarch.rpm"
RPM_HASH = "8dccaf306bc9688a7ee6e96ad7a34291392fa1d03e03373c1e54b3f01cf9d22149e3dad7eb92aa205603b62ab08ef548ff2e6bb03000d288dd9b7c3555fc69db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mono-traversable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
