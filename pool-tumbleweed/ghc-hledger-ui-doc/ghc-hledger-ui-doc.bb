SUMMARY = "Haskell hledger-ui library documentation"
DESCRIPTION = "This package provides the Haskell hledger-ui library documentation."
LICENSE = "GPL-3.0-or-later"

PV = "1.52.1"

RPM_NAME = "ghc-hledger-ui-doc-1.52.1-2.4.noarch.rpm"
RPM_HASH = "4d7510c8d75ecfef69a2d8643f927bf2bd6e48a3cebceff5010af95c62c18b6192725323b2aec70c7eea969b76f10865ec98d8f5241fca00c0b8be28578a540e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hledger-ui-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
