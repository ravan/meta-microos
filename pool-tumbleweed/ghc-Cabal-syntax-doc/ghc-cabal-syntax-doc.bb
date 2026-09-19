SUMMARY = "Haskell Cabal-syntax library documentation"
DESCRIPTION = "This package provides the Haskell Cabal-syntax library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.14.2.0"

RPM_NAME = "ghc-Cabal-syntax-doc-3.14.2.0-1.3.noarch.rpm"
RPM_HASH = "88fe11a21bbef2778bfca788ee5d6ef94adb2a403aceb605bec6a930a6ebce7415c21f91a214b4a3dece814f61a5a292864cc12f9471a8775aa82c7328503de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Cabal-syntax-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
