SUMMARY = "Haskell uuid library documentation"
DESCRIPTION = "This package provides the Haskell uuid library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.16.1"

RPM_NAME = "ghc-uuid-doc-1.3.16.1-1.2.noarch.rpm"
RPM_HASH = "d9373234979065816c13489ec431deb79eb36f5a7576fa19c04a42a86bf30b802ee5174863aa9711aa30985d1684ed9395f831fb97ad55a86bd593f47668aecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uuid-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
