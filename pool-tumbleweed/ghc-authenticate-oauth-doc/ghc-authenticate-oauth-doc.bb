SUMMARY = "Haskell authenticate-oauth library documentation"
DESCRIPTION = "This package provides the Haskell authenticate-oauth library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.7"

RPM_NAME = "ghc-authenticate-oauth-doc-1.7-1.16.noarch.rpm"
RPM_HASH = "372d9e8bb5260179ea68daf89c0e0ec413f5c91aff012b759fd279c7f5e8144aa2c2a2c0a797fd2f012181f4432287eeae5042abfa50f26f7fa228528b9f931a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-authenticate-oauth-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
