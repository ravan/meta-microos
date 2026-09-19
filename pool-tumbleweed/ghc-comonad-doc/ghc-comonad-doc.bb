SUMMARY = "Haskell comonad library documentation"
DESCRIPTION = "This package provides the Haskell comonad library documentation."
LICENSE = "BSD-2-Clause"

PV = "5.0.10"

RPM_NAME = "ghc-comonad-doc-5.0.10-1.3.noarch.rpm"
RPM_HASH = "f8d1fe954f6e41e6048123057652f7df004372309b6dc75aa7ca5187de58aa8cf972bcf4ac47da8a3d2c897711fbede446b90709104e5582c527bc1792d8f5ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-comonad-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
