SUMMARY = "Haskell iproute library documentation"
DESCRIPTION = "This package provides the Haskell iproute library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.7.15"

RPM_NAME = "ghc-iproute-doc-1.7.15-1.19.noarch.rpm"
RPM_HASH = "3b8727e4a09c85b7dd666e0c7fc924afe425197b16fc979201df7bd975acefe188d95c2b2ef878983f82486e3d589a1efe92e962c7ec3a9bbcf75d9af5346eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-iproute-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
