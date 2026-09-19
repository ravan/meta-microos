SUMMARY = "Haskell xhtml library documentation"
DESCRIPTION = "This package provides the Haskell xhtml library documentation."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-doc-3000.2.2.1-1.3.noarch.rpm"
RPM_HASH = "0413decd3c6324b482f8c4c30a5402831d9b7b72b3f18df92ee30f0d772aad238beca57ae471eec7eb5a884369fb324398c59ad7c358c8a876e3c639ad0e151a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xhtml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
