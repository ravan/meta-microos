SUMMARY = "Haskell securemem library documentation"
DESCRIPTION = "This package provides the Haskell securemem library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.10"

RPM_NAME = "ghc-securemem-doc-0.1.10-4.25.noarch.rpm"
RPM_HASH = "10f14ad20289b13c3ebb4f205de584c1bb1aa71082b7d24cc90cc088d2ae06e4221c04fd46a722ae60989b5a9c04faf90551ccfb257e2019d4c4e7b3af25f7f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-securemem-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
