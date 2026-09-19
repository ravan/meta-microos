SUMMARY = "Haskell githash library documentation"
DESCRIPTION = "This package provides the Haskell githash library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.0"

RPM_NAME = "ghc-githash-doc-0.1.7.0-1.34.noarch.rpm"
RPM_HASH = "ff4c50a9a9a61cf6e724a193d35e637a4527714dcafb7f714c7dad27567a94906b836c60a31e2143e9a331e5072cad578bda650b71b5e5ebb7b26ec3f3f293a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-githash-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
