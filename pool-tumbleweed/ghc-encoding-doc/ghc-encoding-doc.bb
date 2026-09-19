SUMMARY = "Haskell encoding library documentation"
DESCRIPTION = "This package provides the Haskell encoding library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.10.3"

RPM_NAME = "ghc-encoding-doc-0.10.3-1.3.noarch.rpm"
RPM_HASH = "e0aa7cfa63c081d8ac64cf9d1ac3528938c2d614c6bc1ef66b602af7d05ad766f4cb2ac08e04eff0ac2c5617b4b5060987315729cb8fd6385a7e353b3cecb1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-encoding-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
