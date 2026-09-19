SUMMARY = "Haskell servant-client library documentation"
DESCRIPTION = "This package provides the Haskell servant-client library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.20.3.0"

RPM_NAME = "ghc-servant-client-doc-0.20.3.0-3.17.noarch.rpm"
RPM_HASH = "04496c8eb3c1ef57fc996a056ecc2e7cdbc0416d9a0de2a0c3b030696afc10d3f1e48130c08a51103bd161f5ec0f4f3e88ef4274567f8ab31a0e511dd1a84eff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-servant-client-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
