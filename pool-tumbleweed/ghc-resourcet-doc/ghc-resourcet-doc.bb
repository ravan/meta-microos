SUMMARY = "Haskell resourcet library documentation"
DESCRIPTION = "This package provides the Haskell resourcet library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-resourcet-doc-1.3.0-2.28.noarch.rpm"
RPM_HASH = "837ebfb3798630aa109ecbcb1787395fe01069308ad004f1fe499f1044ffbaefabfefb6e9fc00a5c329c39b1ecb08f73b7a93789fbc9259625b6f10be9a75996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-resourcet-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
