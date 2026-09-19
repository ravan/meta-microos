SUMMARY = "Haskell tasty-rerun library documentation"
DESCRIPTION = "This package provides the Haskell tasty-rerun library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1.20"

RPM_NAME = "ghc-tasty-rerun-doc-1.1.20-3.7.noarch.rpm"
RPM_HASH = "feebe742a8e78d9e2e72f7228f1fdd4fa2ec44549a971101956346a4ed1efca888f52d3469d9e9171fe782ec567e73c0bd880217425749a7b4565fe238404532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-rerun-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
