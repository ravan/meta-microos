SUMMARY = "Haskell deepseq library documentation"
DESCRIPTION = "This package provides the Haskell deepseq library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.5.1.0"

RPM_NAME = "ghc-deepseq-doc-1.5.1.0-1.3.noarch.rpm"
RPM_HASH = "dcdd1e6bf71975decac7c5888b73e8c715f712d75e0051ae48cb64377a7ad87d90236dceb03ce2584b89cdab2131d7e8640bc31d6075e8b9aec32d3d08dddcae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-deepseq-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
