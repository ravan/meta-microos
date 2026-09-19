SUMMARY = "Haskell uuid-types library documentation"
DESCRIPTION = "This package provides the Haskell uuid-types library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.6.1"

RPM_NAME = "ghc-uuid-types-doc-1.0.6.1-1.3.noarch.rpm"
RPM_HASH = "861c42b9aa106d53bf49abb36ce1f9fa9f993139f29e067dd8ecb3d0fddc05129f4a4e7493b3a32d8fdfede1807cc14565def0964fc65a59c1fe561a61c639ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uuid-types-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
