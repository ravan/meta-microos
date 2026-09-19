SUMMARY = "Haskell half library documentation"
DESCRIPTION = "This package provides the Haskell half library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.3.3"

RPM_NAME = "ghc-half-doc-0.3.3-3.3.noarch.rpm"
RPM_HASH = "82c2943673012b58234e2b0b77189997df550cf924841f6f9ef34845dcd6f98bf9e2c3207acc93a3efac0954580c855ee3520a237fbd3facb323d6e6d2ab6f8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-half-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
