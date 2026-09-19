SUMMARY = "Haskell indexed-traversable-instances library documentation"
DESCRIPTION = "This package provides the Haskell indexed-traversable-instances library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.2.1"

RPM_NAME = "ghc-indexed-traversable-instances-doc-0.1.2.1-1.3.noarch.rpm"
RPM_HASH = "488eff88491eaa25f6315d8454eee096cb4627e48e3727e6fe6bb94f791fbc7e62c916e0db14ae58dc7a8c669d5ae8a0e2e221286e0c9b165a53019119e7bf55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-indexed-traversable-instances-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
