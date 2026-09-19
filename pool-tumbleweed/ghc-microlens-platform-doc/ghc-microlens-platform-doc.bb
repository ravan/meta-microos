SUMMARY = "Haskell microlens-platform library documentation"
DESCRIPTION = "This package provides the Haskell microlens-platform library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.4.2"

RPM_NAME = "ghc-microlens-platform-doc-0.4.4.2-1.11.noarch.rpm"
RPM_HASH = "dfffb5ec983fe3a91c3c6fb638b6147848873137e2210a4a73ea75767fd248e64d94b49f60f763e1dbc5db00e95aafa37d1eb193c25a4ad57c5cd442b73a7217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-platform-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
