SUMMARY = "Haskell blaze-markup library documentation"
DESCRIPTION = "This package provides the Haskell blaze-markup library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.3.0"

RPM_NAME = "ghc-blaze-markup-doc-0.8.3.0-3.21.noarch.rpm"
RPM_HASH = "f0e5582a07cbc64715d25544f59c5d89a9f0edca1a0fdda0bdf959aff1f6a4f26c072a411b1bf422fa1c7463c7561dd5897750230d8eee63e644242167108beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-blaze-markup-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
