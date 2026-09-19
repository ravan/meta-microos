SUMMARY = "Haskell text-builder-linear library documentation"
DESCRIPTION = "This package provides the Haskell text-builder-linear library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-text-builder-linear-doc-0.1.3-1.20.noarch.rpm"
RPM_HASH = "ff8ca73ce0d71cae3db8b4ec3be13f5ffbfd355922cc9360ec1bd72f14bad203c50e5143cd3461f0a04200e455ebde7ec8cbca5658b083bd57993db7decd802a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-builder-linear-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
