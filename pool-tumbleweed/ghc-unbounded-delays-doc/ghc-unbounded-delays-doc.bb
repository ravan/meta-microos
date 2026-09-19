SUMMARY = "Haskell unbounded-delays library documentation"
DESCRIPTION = "This package provides the Haskell unbounded-delays library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-unbounded-delays-doc-0.1.1.1-1.34.noarch.rpm"
RPM_HASH = "f12922b627b80ef9c6fb86b018cda93e40930d29bc55ddfd204b44861e4a0db95753f5fa34ff32834130e0d0fbfcc65aaaa9e4a465012fc81ac49feeab5d2313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unbounded-delays-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
