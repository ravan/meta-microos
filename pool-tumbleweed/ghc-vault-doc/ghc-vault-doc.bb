SUMMARY = "Haskell vault library documentation"
DESCRIPTION = "This package provides the Haskell vault library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.2.0"

RPM_NAME = "ghc-vault-doc-0.3.2.0-1.2.noarch.rpm"
RPM_HASH = "bb7363536d9846c80caffba7aaec5089bef56c91414c2e2aac2331388a1306c77b4f870541dead13f63d373e38fc8dc42992a27b43cbbe7a1586ccdbb6d6f283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-vault-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
