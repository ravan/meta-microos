SUMMARY = "Haskell zip-archive library documentation"
DESCRIPTION = "This package provides the Haskell zip-archive library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.2"

RPM_NAME = "ghc-zip-archive-doc-0.4.3.2-2.17.noarch.rpm"
RPM_HASH = "dd8a97729ca1ded885a65eba5ecdd58cb8d000d9be8065da92db23b6f441dd5b9e419a19d36b4e609348c91aa4d989ddaa605b2fea944588183446d2a91443a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-zip-archive-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
