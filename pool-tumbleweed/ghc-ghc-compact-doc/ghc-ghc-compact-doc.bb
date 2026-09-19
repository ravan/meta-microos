SUMMARY = "Haskell ghc-compact library documentation"
DESCRIPTION = "This package provides the Haskell ghc-compact library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-doc-0.1.0.0-1.3.noarch.rpm"
RPM_HASH = "8f203fa0ccbce58ddeceecf71b6fe24b4876afc661f33502f3d037ede69e121f6bd7279a22895934491253600fc88f4304390b9fb9c73378dbf5ac163a2fb99f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-compact-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
