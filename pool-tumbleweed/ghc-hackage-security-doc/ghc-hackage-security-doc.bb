SUMMARY = "Haskell hackage-security library documentation"
DESCRIPTION = "This package provides the Haskell hackage-security library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.3.3"

RPM_NAME = "ghc-hackage-security-doc-0.6.3.3-1.3.noarch.rpm"
RPM_HASH = "bc4cb77884061429d3c4faf1774df0773582b669c5a54b0feb779878e72284f19834882cd9ba3780be08f81b4b899cc410d716cc8afcd16b9590374a44a86772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hackage-security-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
