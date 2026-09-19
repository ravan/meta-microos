SUMMARY = "Haskell appar library documentation"
DESCRIPTION = "This package provides the Haskell appar library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-doc-0.1.8-4.23.noarch.rpm"
RPM_HASH = "c139a604ffe6f30b652b171a3039c21f31cea679599d55389e868de0faf0410ca13f54611cec6895c67f574f38f0eb748612553fe7f61809872800430244d525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-appar-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
