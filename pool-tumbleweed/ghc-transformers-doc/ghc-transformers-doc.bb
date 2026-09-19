SUMMARY = "Haskell transformers library documentation"
DESCRIPTION = "This package provides the Haskell transformers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.3.0"

RPM_NAME = "ghc-transformers-doc-0.6.3.0-1.3.noarch.rpm"
RPM_HASH = "fcb94e86c267b6653c846451a43a54c7fd32859ea5284ce514c4fe2e2c8a04e50f776c1d32504925a1ac8650e539621a992fbd76e3fc8993234f654f6872a0cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
