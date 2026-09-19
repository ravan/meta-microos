SUMMARY = "Haskell regex-tdfa library documentation"
DESCRIPTION = "This package provides the Haskell regex-tdfa library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.5"

RPM_NAME = "ghc-regex-tdfa-doc-1.3.2.5-1.9.noarch.rpm"
RPM_HASH = "44e9730f19f36b390344cfc5d95a304278901448f9b4c61f6d3167ce48d17ff1931a737caf2a3b3890a98eb7459b6667a954ccc72db289424136f9e419bbabf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-regex-tdfa-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
