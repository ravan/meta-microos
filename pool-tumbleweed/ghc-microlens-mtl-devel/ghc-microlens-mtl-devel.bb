SUMMARY = "Haskell microlens-mtl library development files"
DESCRIPTION = "This package provides the Haskell microlens-mtl library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.1"

RPM_NAME = "ghc-microlens-mtl-devel-0.2.1.1-1.9.aarch64.rpm"
RPM_HASH = "ca082abc9a0bd3f09b0a9cd7915deda0eb3b4f5a8570857499400b14f279ad4bcafaa8d4f3311d0f57b3a047a11f42f6ca83c32faeedc944f0c777c26db2e900"

RPROVIDES:${PN} += "ghc-devel-microlens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5 \
ghc-microlens-mtl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-devel-mtl-2.3.2-37ef \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-microlens-mtl"

inherit rpm
