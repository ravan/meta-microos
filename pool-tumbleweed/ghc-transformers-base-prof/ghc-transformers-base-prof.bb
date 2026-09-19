SUMMARY = "Haskell transformers-base profiling library"
DESCRIPTION = "This package provides the Haskell transformers-base profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.6.1"

RPM_NAME = "ghc-transformers-base-prof-0.4.6.1-1.3.aarch64.rpm"
RPM_HASH = "45793b585b62e21ecd86e90f1fc93fe3ee7a97d68b3ba99377c4672e0237ae8f3c9378471d348361839276d56d992a5a5c677c2b41d07c6c8d16d5b07f8c5e5b"

RPROVIDES:${PN} += "ghc-prof-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-transformers-base-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-transformers-base-devel"

inherit rpm
