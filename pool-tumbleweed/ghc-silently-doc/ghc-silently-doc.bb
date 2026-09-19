SUMMARY = "Haskell silently library documentation"
DESCRIPTION = "This package provides the Haskell silently library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.4"

RPM_NAME = "ghc-silently-doc-1.2.5.4-1.15.noarch.rpm"
RPM_HASH = "a4fb0e102dcb822203a9ca161a7803d6542885dc66ab514691d038e6da9c7e3a30765f1e85fee06f731d6091333c18f141a91750b54c55bd56f885fa67073175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-silently-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
