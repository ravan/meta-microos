SUMMARY = "Haskell random profiling library"
DESCRIPTION = "This package provides the Haskell random profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-random-prof-1.3.1-1.10.aarch64.rpm"
RPM_HASH = "fa5e4f5f45cd6cc103165cabf36938dae210aea1c70fe08b339d22ff161ea716c620382eee11764ea60f380694db1e16c8148730abeef4f2b7b99f7e967c2f33"

RPROVIDES:${PN} += "ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-random-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-splitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-random-devel"

inherit rpm
