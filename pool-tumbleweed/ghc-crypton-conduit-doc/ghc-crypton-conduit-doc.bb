SUMMARY = "Haskell crypton-conduit library documentation"
DESCRIPTION = "This package provides the Haskell crypton-conduit library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-crypton-conduit-doc-0.3.0-1.3.noarch.rpm"
RPM_HASH = "2e17bde8dcd6965e0387c957ce09e4a5247be49ce7a3cf91f3b932035405cd46e338490591022c6a67d1e33fe6c325583ac03cb1b175fd13c63508f3837720d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-conduit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
