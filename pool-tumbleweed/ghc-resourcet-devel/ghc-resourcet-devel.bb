SUMMARY = "Haskell resourcet library development files"
DESCRIPTION = "This package provides the Haskell resourcet library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-resourcet-devel-1.3.0-2.28.aarch64.rpm"
RPM_HASH = "6fe4847648481ae16b4c4e7b0e22b561b505525686d85de584eb97fd667af42e8c88eae4d4de06c77a22f23df124dcc7f80e5f7b2b4652d66580b1b1af7879a0"

RPROVIDES:${PN} += "ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-resourcet-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-resourcet"

inherit rpm
