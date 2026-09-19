SUMMARY = "Haskell gridtables library documentation"
DESCRIPTION = "This package provides the Haskell gridtables library documentation."
LICENSE = "MIT"

PV = "0.1.1.0"

RPM_NAME = "ghc-gridtables-doc-0.1.1.0-1.5.noarch.rpm"
RPM_HASH = "d7b09073be50b6da8f267b296b5697d6c64fe86050eb119d60e87460539cb3c5603b90d548324367526b91c369c02dd89d4ef360888a3fe9d8a92bb2854eede4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-gridtables-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
