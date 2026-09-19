SUMMARY = "Haskell cabal-install library documentation"
DESCRIPTION = "This package provides the Haskell cabal-install library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.14.1.1"

RPM_NAME = "ghc-cabal-install-doc-3.14.1.1-6.4.noarch.rpm"
RPM_HASH = "8e372cc46d76e04c4c97100b3a7dfae23ad3746e1a6e6edb543efd65c70bda7be819e771468ab57dc2cf75545424658a6647afe8a2cdf8b541a24c8e7d0165bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cabal-install-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
