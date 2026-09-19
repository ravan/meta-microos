SUMMARY = "Haskell hashtables library documentation"
DESCRIPTION = "This package provides the Haskell hashtables library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "ghc-hashtables-doc-1.4.2-1.20.noarch.rpm"
RPM_HASH = "01cfb564fe48cb17da92547da1f0e41c6920c5ca146d55e05d27700f8b9f31dbd23e858d7f7322c63d02ad101614a4f2148aec83b1a0b68647e22b2f141d2cf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hashtables-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
