SUMMARY = "Haskell aeson-pretty library documentation"
DESCRIPTION = "This package provides the Haskell aeson-pretty library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.11"

RPM_NAME = "ghc-aeson-pretty-doc-0.8.11-1.3.noarch.rpm"
RPM_HASH = "d39a98b8699b131cf1c638edb8fbb4f5ffa98a918fbccbadc0faa33118148b0c2617ee2e4dfb8902115e3dc342ae29877e27d12aad8f9428abc8aa48c297f6d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-aeson-pretty-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
