SUMMARY = "Haskell html library documentation"
DESCRIPTION = "This package provides the Haskell html library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.1.2"

RPM_NAME = "ghc-html-doc-1.0.1.2-4.19.noarch.rpm"
RPM_HASH = "efd73679cccb8e5a3cc2fbbe1a50977f51dd8d9a4c688dee09ec6666994a3ceacffc98c537271cd427813bc1cccf21d01295817e21c062c2f3a8a649067cc962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-html-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
