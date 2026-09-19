SUMMARY = "Haskell xmobar library documentation"
DESCRIPTION = "This package provides the Haskell xmobar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.51.1"

RPM_NAME = "ghc-xmobar-doc-0.51.1-1.2.noarch.rpm"
RPM_HASH = "6ff4045adf84d4dff5224bef54a257f6df0000b34fefec93fa8f1d46a72b4fc46f712a111c7a01470ac45dece86a3956ea71961f26b41e74ac12cb4dcb03c03b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-xmobar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
