SUMMARY = "Haskell unix library documentation"
DESCRIPTION = "This package provides the Haskell unix library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.8.8.0"

RPM_NAME = "ghc-unix-doc-2.8.8.0-1.3.noarch.rpm"
RPM_HASH = "470ff265afbd9d7051af09d34e222823ec62e3a10d597bfa3b5cf921b82abee2d8fbec7b454bf40c57285df7bb089b536d52bbaf763e0495279d9c4d8f1cc823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
