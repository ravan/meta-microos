SUMMARY = "Haskell regex-compat library documentation"
DESCRIPTION = "This package provides the Haskell regex-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.95.2.2"

RPM_NAME = "ghc-regex-compat-doc-0.95.2.2-1.8.noarch.rpm"
RPM_HASH = "a29d0d1852a2ae6f74677c754682e8c7d208624e1148a8277853e4cea9a9abc085eb82c1e24c23e41a14a62e4e751cf2e157b94afdc9cdc5623e88a33f50df12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
