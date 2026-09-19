SUMMARY = "Haskell text-zipper library development files"
DESCRIPTION = "This package provides the Haskell text-zipper library development files."
LICENSE = "BSD-3-Clause"

PV = "0.13"

RPM_NAME = "ghc-text-zipper-devel-0.13-1.28.aarch64.rpm"
RPM_HASH = "4a19644ca918705887de54d627f77517af5a34772f30b84695b7278265d4b192dfd08c4bea3a0359dbca2902a744417116c66ba16734d4dd17e9250103378793"

RPROVIDES:${PN} += "ghc-devel-text-zipper-0.13-HJrIfnTzHLAGK5wSCeeQus \
ghc-text-zipper-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-text-zipper"

inherit rpm
