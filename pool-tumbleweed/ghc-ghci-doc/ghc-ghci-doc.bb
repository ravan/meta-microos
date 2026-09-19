SUMMARY = "Haskell ghci library documentation"
DESCRIPTION = "This package provides the Haskell ghci library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.12.4"

RPM_NAME = "ghc-ghci-doc-9.12.4-1.3.noarch.rpm"
RPM_HASH = "2312388c7fe07aec35e49fb34106926e598a3d0e93881b6cfcc655111b3edd2e95442d99e90959560afb69e4fb17dc1582a7294559b32f11608d05d636c30f3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghci-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
