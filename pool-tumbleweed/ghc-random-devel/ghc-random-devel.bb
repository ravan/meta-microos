SUMMARY = "Haskell random library development files"
DESCRIPTION = "This package provides the Haskell random library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-random-devel-1.3.1-1.10.aarch64.rpm"
RPM_HASH = "fe54638280612b68147e18136b81684366debbdbdf9e15a7d914b58c48ea9774dd01a1d14d7d31785719a87aec8a846679f6ac018c8c25f01ef35fc30d9db590"

RPROVIDES:${PN} += "ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-random-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-splitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-random"

inherit rpm
