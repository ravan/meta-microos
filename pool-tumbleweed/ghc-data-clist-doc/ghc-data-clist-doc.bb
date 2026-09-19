SUMMARY = "Haskell data-clist library documentation"
DESCRIPTION = "This package provides the Haskell data-clist library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-doc-0.2-3.17.noarch.rpm"
RPM_HASH = "0f535927d9dcdef15f57286e8abf8170e73b63dcc453d3cda040b5791c852e83973b109f12ada0a62c51053f3e0310831e84e26e6d7a025dac7d7c6fcb41ef43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-clist-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
