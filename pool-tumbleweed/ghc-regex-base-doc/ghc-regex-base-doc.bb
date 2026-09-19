SUMMARY = "Haskell regex-base library documentation"
DESCRIPTION = "This package provides the Haskell regex-base library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.3"

RPM_NAME = "ghc-regex-base-doc-0.94.0.3-1.12.noarch.rpm"
RPM_HASH = "ab34f4a2a229373f1fa925ea3acf36b479dc035e216a53d3e277b27bdf5d0fbc8ff49cc525c454543b734df415dc275f385fb466e2895aa5609e8879d8c141c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-base-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
