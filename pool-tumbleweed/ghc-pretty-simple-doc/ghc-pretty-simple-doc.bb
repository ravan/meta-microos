SUMMARY = "Haskell pretty-simple library documentation"
DESCRIPTION = "This package provides the Haskell pretty-simple library documentation."
LICENSE = "BSD-3-Clause"

PV = "4.1.4.0"

RPM_NAME = "ghc-pretty-simple-doc-4.1.4.0-1.9.noarch.rpm"
RPM_HASH = "80c09f64f7b0124f28469b7a945305b126b5cb3032b549cca41809d6fcbc8f01b038050c00328203ac1a97c6622f258d03d8bdf2a6ff3c9b0f5e0e5776184a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-simple-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
