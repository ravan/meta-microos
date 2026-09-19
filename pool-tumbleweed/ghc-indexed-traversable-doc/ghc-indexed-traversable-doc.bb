SUMMARY = "Haskell indexed-traversable library documentation"
DESCRIPTION = "This package provides the Haskell indexed-traversable library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-indexed-traversable-doc-0.1.5-1.3.noarch.rpm"
RPM_HASH = "6104896514601a1b9ad52ad17590652e7d97aef2f43696cba67bbbd6e7a947e460ab1a81995a02078f77c1d4766202930998e37ee977c7be8c2812b4f0ea04e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-indexed-traversable-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
