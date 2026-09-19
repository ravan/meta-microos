SUMMARY = "Haskell persistent library documentation"
DESCRIPTION = "This package provides the Haskell persistent library documentation."
LICENSE = "MIT"

PV = "2.17.1.0"

RPM_NAME = "ghc-persistent-doc-2.17.1.0-1.19.noarch.rpm"
RPM_HASH = "5ed1ce18c0b24f67e30b6bb7afbd17fbb0843eef2d12a358053af25a169e1b861edfc090bbe2dd269f3861a6d186e5311ca000c72373121e93268ed74d054f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
