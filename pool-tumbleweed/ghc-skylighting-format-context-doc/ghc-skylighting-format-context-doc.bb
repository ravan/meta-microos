SUMMARY = "Haskell skylighting-format-context library documentation"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-doc-0.1.0.2-1.79.noarch.rpm"
RPM_HASH = "17bfe3d9caaffaba9d5762b948d5051985c015fa1215649519a8e37bfd9bcd2ed5e06d69046b095e2afdc5a5a690032801c47968f01946b479a672c4b5e1980e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-format-context-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
