SUMMARY = "Haskell free library documentation"
DESCRIPTION = "This package provides the Haskell free library documentation."
LICENSE = "BSD-3-Clause"

PV = "5.2"

RPM_NAME = "ghc-free-doc-5.2-6.3.noarch.rpm"
RPM_HASH = "9db95874daaabdae336396cb10882ac30c8c14356bd6df9d515e346134fb1ecf2244cf17494002f9fb31713aa936d8db2baede28f3c870124d9b5f86e24bbd69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-free-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
