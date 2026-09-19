SUMMARY = "Haskell text-zipper library documentation"
DESCRIPTION = "This package provides the Haskell text-zipper library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.13"

RPM_NAME = "ghc-text-zipper-doc-0.13-1.28.noarch.rpm"
RPM_HASH = "c2517721dc79a2d869a0fbfe3521e4cc2de61d2298edab35a2d121e5106a83ff69fa4144f78d0c3bf52832238be7458f5f2f3e4cbe6d00e928c63ddc9de9939e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-zipper-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
