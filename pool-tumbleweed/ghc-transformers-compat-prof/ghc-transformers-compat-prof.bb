SUMMARY = "Haskell transformers-compat profiling library"
DESCRIPTION = "This package provides the Haskell transformers-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-prof-0.7.2-2.35.aarch64.rpm"
RPM_HASH = "ff99a473c341444cc79cebd6d6e1862eaf9134375d9ee86c60296e995826767ef3220537281db073c867212f0a5dc8afaf7cdd5af714a32db2b4f8ceab829e6f"

RPROVIDES:${PN} += "ghc-prof-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW \
ghc-transformers-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-transformers-compat-devel"

inherit rpm
