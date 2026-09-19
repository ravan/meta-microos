SUMMARY = "Haskell resourcet profiling library"
DESCRIPTION = "This package provides the Haskell resourcet profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-resourcet-prof-1.3.0-2.28.aarch64.rpm"
RPM_HASH = "437c57e591039eeebd3295e144b2d7137384aced3a8dbc2cb7766a22aa3377ca726b8655a0e7992994a6c82c88e694bc1422a3a1f7721aa77fdf296840a5220c"

RPROVIDES:${PN} += "ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-resourcet-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-resourcet-devel"

inherit rpm
