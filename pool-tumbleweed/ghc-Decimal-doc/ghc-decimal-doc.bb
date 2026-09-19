SUMMARY = "Haskell Decimal library documentation"
DESCRIPTION = "This package provides the Haskell Decimal library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-doc-0.5.2-2.19.noarch.rpm"
RPM_HASH = "1f695230845acbce139909a04990c5d7ab0c1e33b35444b7e44f3f6832f3ca533481a3d904497d62669cabd6f4fb88709ef6c5f5122083c3742294241aad564c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Decimal-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
