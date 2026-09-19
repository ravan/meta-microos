SUMMARY = "Haskell integer-conversion library documentation"
DESCRIPTION = "This package provides the Haskell integer-conversion library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-integer-conversion-doc-0.1.1-3.2.noarch.rpm"
RPM_HASH = "c1c01719e0e2abb5c24af2e768581ed446efb709efc46fedca03c25cee088c49e6cecfd0cd9d79a6589e14fb95d9118230f1d70a82f3228b0891f5cce85d3be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-integer-conversion-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
