SUMMARY = "Haskell generically library documentation"
DESCRIPTION = "This package provides the Haskell generically library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-generically-doc-0.1.1-6.3.noarch.rpm"
RPM_HASH = "e2b6a66bc460cad143cd41526b769c144930fb5884421dd13c16feb05673fbc1bf597713025c12f574223d8883d18cd8d5ca8d60509633e0161cad5fc853d8c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-generically-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
