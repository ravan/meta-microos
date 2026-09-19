SUMMARY = "Haskell pandoc-server library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-server library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.3"

RPM_NAME = "ghc-pandoc-server-doc-0.1.3-1.5.noarch.rpm"
RPM_HASH = "07fccb9b09ffd3a27b71809f12647528fa480637106a1fceedaca1d901b597bf6ba3df29583465ba5d86b53761066905ae00bec7a7965eba589fc406299e2341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-server-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
