SUMMARY = "Haskell cassava library documentation"
DESCRIPTION = "This package provides the Haskell cassava library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.1"

RPM_NAME = "ghc-cassava-doc-0.5.4.1-1.11.noarch.rpm"
RPM_HASH = "043bc9961efaea4c4a581a24206e43a8bf14e435fbe70e2a0b53c329d51dbd6604e42481ce0fe41fbe5c93797270613549c02f51f5a33f540e187c85fa8e68c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cassava-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
