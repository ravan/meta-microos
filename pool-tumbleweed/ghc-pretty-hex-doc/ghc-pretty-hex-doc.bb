SUMMARY = "Haskell pretty-hex library documentation"
DESCRIPTION = "This package provides the Haskell pretty-hex library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-doc-1.1-4.19.noarch.rpm"
RPM_HASH = "ad2b7e5afc96487266dba78a75e90a0a0a0785c1a124b16ce919c1e93043175a6c9e0a079f358746161b99f420e05201d76d84c016ce90aaebbe9dc8bc0567e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-pretty-hex-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
