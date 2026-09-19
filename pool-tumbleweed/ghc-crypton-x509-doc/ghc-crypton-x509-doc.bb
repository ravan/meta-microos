SUMMARY = "Haskell crypton-x509 library documentation"
DESCRIPTION = "This package provides the Haskell crypton-x509 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "ghc-crypton-x509-doc-1.9.1-1.3.noarch.rpm"
RPM_HASH = "6eb4fcabeaf167cab40b9bb7180b7105f9d141006b17e988a9993e31d30095d998dd9ed7b2f6f3c6fac910e5bc55faf108f8bd3cd612f10ff53e4707a83cf1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-crypton-x509-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
