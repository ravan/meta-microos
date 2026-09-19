SUMMARY = "Haskell stm-chans library documentation"
DESCRIPTION = "This package provides the Haskell stm-chans library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.11"

RPM_NAME = "ghc-stm-chans-doc-3.0.0.11-1.3.noarch.rpm"
RPM_HASH = "3c190acf22003fa1f4a22cfa5a69f1119750c482b4eb9c48dda0cc11ed89e0f34e946579ce982b170ee83587bdd49a94ca8d85bddff7a54ffb56e8a59c0dabdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-stm-chans-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
