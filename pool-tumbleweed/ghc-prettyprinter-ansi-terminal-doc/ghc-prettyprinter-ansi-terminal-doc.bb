SUMMARY = "Haskell prettyprinter-ansi-terminal library documentation"
DESCRIPTION = "This package provides the Haskell prettyprinter-ansi-terminal library documentation."
LICENSE = "BSD-2-Clause"

PV = "1.1.4"

RPM_NAME = "ghc-prettyprinter-ansi-terminal-doc-1.1.4-1.3.noarch.rpm"
RPM_HASH = "9239326450aefe0b7b03600ef2a1f4e07bf2e7d52a6e65b4d0d3c2f9364735b25e182ce64dd6819997a946786bf1071ca69ea7b0e16bc0b71cc652f1e8a94329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-prettyprinter-ansi-terminal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
