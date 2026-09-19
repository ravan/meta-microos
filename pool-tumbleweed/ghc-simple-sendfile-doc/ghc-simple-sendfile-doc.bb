SUMMARY = "Haskell simple-sendfile library documentation"
DESCRIPTION = "This package provides the Haskell simple-sendfile library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.32"

RPM_NAME = "ghc-simple-sendfile-doc-0.2.32-1.27.noarch.rpm"
RPM_HASH = "1dfc067d7cff992aa38700439e613bb57703b27001926cd0651e961d3a930c95d122ed9176db30877c94507975099d37897656a876c824e26519d7ca10fe34a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-simple-sendfile-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
