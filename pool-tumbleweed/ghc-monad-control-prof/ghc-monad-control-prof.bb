SUMMARY = "Haskell monad-control profiling library"
DESCRIPTION = "This package provides the Haskell monad-control profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.3.1"

RPM_NAME = "ghc-monad-control-prof-1.0.3.1-2.24.aarch64.rpm"
RPM_HASH = "02df954285400963668afe2279b33600e9a8096e2558bfa4a8795f7b207a179551772836daeb2b49f41b4574eeef3ba88789ffc87a149f4710cbbf758c2c969c"

RPROVIDES:${PN} += "ghc-monad-control-prof \
ghc-prof-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt"

RDEPENDS:${PN} += "ghc-monad-control-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-prof-transformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW"

inherit rpm
