SUMMARY = "Haskell network-info library documentation"
DESCRIPTION = "This package provides the Haskell network-info library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-doc-0.2.1-2.21.noarch.rpm"
RPM_HASH = "6b0fc08e1421cdc53f4ec7669872903d6ec736b32a82437a16227150c2c1c326be0c4a4b47caa405a3ec66b6ef49ce9cf2f968d860da9052ebfed7eff2ebfc49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-info-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
