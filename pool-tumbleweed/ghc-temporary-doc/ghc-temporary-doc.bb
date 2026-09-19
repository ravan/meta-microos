SUMMARY = "Haskell temporary library documentation"
DESCRIPTION = "This package provides the Haskell temporary library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-temporary-doc-1.3-6.30.noarch.rpm"
RPM_HASH = "379b6c17e7d69919d4890c8239c0a9277ef5441015150a554c438ef7daeb0598d1a0b057f74c7e6933a3195980297906bc1b2d8727dee84957293c08d1287a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-temporary-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
