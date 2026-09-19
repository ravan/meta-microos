SUMMARY = "Haskell retry profiling library"
DESCRIPTION = "This package provides the Haskell retry profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.3.1"

RPM_NAME = "ghc-retry-prof-0.9.3.1-1.15.aarch64.rpm"
RPM_HASH = "9027aeb5c35beab644c1c21f32926ecac5dcb5f89ae339113d77466bed1603c9c4bbd4333cb2df9703920df3c148f8e79440a505b2d164d627e15bc955bb16d3"

RPROVIDES:${PN} += "ghc-prof-retry-0.9.3.1-Ul1oSc0PafBv9JJCTFdQa \
ghc-retry-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-retry-devel"

inherit rpm
