SUMMARY = "Haskell microlens-mtl profiling library"
DESCRIPTION = "This package provides the Haskell microlens-mtl profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.1"

RPM_NAME = "ghc-microlens-mtl-prof-0.2.1.1-1.9.aarch64.rpm"
RPM_HASH = "7477e35bfa0b43ef8a303308b512203599b31751afdeb7af4ab98cc4142c976a936b9db51b714e8843516d9c0d63efd8fcd9da5e443e76b54837dda576c86894"

RPROVIDES:${PN} += "ghc-microlens-mtl-prof \
ghc-prof-microlens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5"

RDEPENDS:${PN} += "ghc-microlens-mtl-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-microlens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW"

inherit rpm
