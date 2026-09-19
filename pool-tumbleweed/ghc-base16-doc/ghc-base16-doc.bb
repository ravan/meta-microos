SUMMARY = "Haskell base16 library documentation"
DESCRIPTION = "This package provides the Haskell base16 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-base16-doc-1.0-1.3.noarch.rpm"
RPM_HASH = "e8699f3eca622e1ea2f989a942120e4cec2a1af7c0ed10e2cf636ccfc78e6e57b1d89acb6feb7ee72762615724f99989f7d293801fee607e6452d0fc95a244fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-base16-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
