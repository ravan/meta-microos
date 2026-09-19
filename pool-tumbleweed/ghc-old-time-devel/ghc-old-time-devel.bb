SUMMARY = "Haskell old-time library development files"
DESCRIPTION = "This package provides the Haskell old-time library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.1.0"

RPM_NAME = "ghc-old-time-devel-1.1.1.0-1.3.aarch64.rpm"
RPM_HASH = "54ac2b6c2f9b18b3e35e8b0960f68ffdbfd1a9c83acfaec3c3ebeacea7fb0f37d0340ab2a8f2ff8f87230c86f8f4b300f0c5b5bde75bc6c9458f0c5c024c1028"

RPROVIDES:${PN} += "ghc-devel-old-time-1.1.1.0-LOMYAgPdxtNFCxdl8604aX \
ghc-old-time-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5 \
ghc-old-time"

inherit rpm
