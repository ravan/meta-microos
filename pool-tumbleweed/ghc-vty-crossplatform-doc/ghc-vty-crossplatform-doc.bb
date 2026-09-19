SUMMARY = "Haskell vty-crossplatform library documentation"
DESCRIPTION = "This package provides the Haskell vty-crossplatform library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.0"

RPM_NAME = "ghc-vty-crossplatform-doc-0.4.0.0-1.43.noarch.rpm"
RPM_HASH = "ebb84d4874af7dfcf8e94469e987d3d61b5918a0889c993b02c5d550bc852b622cb99ae50e9d2e7f7caa71c7675e0828b42cef951c76c8a27bc4335c70f83dfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vty-crossplatform-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
