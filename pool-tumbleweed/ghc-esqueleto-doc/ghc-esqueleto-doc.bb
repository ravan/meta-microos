SUMMARY = "Haskell esqueleto library documentation"
DESCRIPTION = "This package provides the Haskell esqueleto library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.6.0.0"

RPM_NAME = "ghc-esqueleto-doc-3.6.0.0-1.17.noarch.rpm"
RPM_HASH = "bd8ff694d8c778f4b7a8c2703f26652b9024a84a0951272b7ba5b0e28121e1023c3679e33ae34411f60d070be30fe001df14d267db8a86342b4917eebf855c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-esqueleto-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
