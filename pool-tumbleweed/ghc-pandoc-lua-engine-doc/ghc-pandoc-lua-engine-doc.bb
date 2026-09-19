SUMMARY = "Haskell pandoc-lua-engine library documentation"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.3"

RPM_NAME = "ghc-pandoc-lua-engine-doc-0.5.3-1.5.noarch.rpm"
RPM_HASH = "1fa00159d42fb45676104f5e648245b18b35d8ee84f69822dfbcd5d423536141c55ff6792d66babd844be9084bc4d8d923c116a3d9528a261fee137c7bb0945f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
