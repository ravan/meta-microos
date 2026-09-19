SUMMARY = "Haskell microlens-th library documentation"
DESCRIPTION = "This package provides the Haskell microlens-th library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.18"

RPM_NAME = "ghc-microlens-th-doc-0.4.3.18-2.3.noarch.rpm"
RPM_HASH = "5274426c6b6dfeba28840b3d473e9a590a60804d3fa23949e1a29f7368f57720247624192bfe086ab9b9bd16ff95a8ddfcc92d86e24e65c2ee9b6276b26d400d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-microlens-th-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
