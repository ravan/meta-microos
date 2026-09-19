SUMMARY = "Haskell mmorph profiling library"
DESCRIPTION = "This package provides the Haskell mmorph profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-mmorph-prof-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "70e3f0760d26bc0a49c77e5b3d1a3b401bf6af5dee979147c33ac4edfebcc1c345f5bd742aca581bc8aa93b3a4297251e2e27674dac8e88a6e028fe57bc3d2d1"

RPROVIDES:${PN} += "ghc-mmorph-prof \
ghc-prof-mmorph-1.2.2-8rdXPOqza0cFiQFk7Wz51h"

RDEPENDS:${PN} += "ghc-mmorph-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-mtl-2.3.2-37ef \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW"

inherit rpm
