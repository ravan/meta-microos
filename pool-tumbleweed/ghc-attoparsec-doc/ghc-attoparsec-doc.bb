SUMMARY = "Haskell attoparsec library documentation"
DESCRIPTION = "This package provides the Haskell attoparsec library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "ghc-attoparsec-doc-0.14.4-6.19.noarch.rpm"
RPM_HASH = "7bd207241ae00ede00adf371eb7f95bb74b1f29fb9638afd453454e152512f494cdd316957c8fcded8bea4cd068bac766dd8b1a6446afc7178344fc9fabfffe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-attoparsec-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
