SUMMARY = "Haskell lua library documentation"
DESCRIPTION = "This package provides the Haskell lua library documentation."
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "ghc-lua-doc-2.3.4-1.8.noarch.rpm"
RPM_HASH = "b61ea7d1f42df0651b7bd2555e521d95b91a9a2e432b7734843de6bd1f0c391df649bca33bf0dd0894da5a717caa460bae699b6e2a49e1a07e02c61128d905a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-lua-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
