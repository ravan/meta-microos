SUMMARY = "Haskell retry library development files"
DESCRIPTION = "This package provides the Haskell retry library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.3.1"

RPM_NAME = "ghc-retry-devel-0.9.3.1-1.15.aarch64.rpm"
RPM_HASH = "023eb15c368046057ebdafb680873912f668105969e170ea4cb42e461b48750cb9f4ca07cd702cd86a3fbff0d67c64b8c77ced4967add6eb9e602c655f180145"

RPROVIDES:${PN} += "ghc-devel-retry-0.9.3.1-Ul1oSc0PafBv9JJCTFdQa \
ghc-retry-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unliftio-core-0.2.1.0-HFUY5mS3bsg3RW1edumY92 \
ghc-retry"

inherit rpm
