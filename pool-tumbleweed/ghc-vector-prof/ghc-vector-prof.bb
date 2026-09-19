SUMMARY = "Haskell vector profiling library"
DESCRIPTION = "This package provides the Haskell vector profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.13.2.0"

RPM_NAME = "ghc-vector-prof-0.13.2.0-5.3.aarch64.rpm"
RPM_HASH = "f80ad5c1531d5e9e9a8f4d66ab980810405ef1f7698e6251f2896a5ed203d723c9178613307232070efe1aeda0a787a7afc259055706795422f56a888a713c58"

RPROVIDES:${PN} += "ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-prof-vector-0.13.2.0-JkxMTa2gLKkJke17YJOtM5-benchmarks-O2 \
ghc-vector-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-random-1.3.1-JfaDd4Q5FuLKGb9yRr3GDh \
ghc-prof-tasty-1.5.4-1HxvBgEXkE5Beb2ChlE06d \
ghc-prof-vector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF \
ghc-vector-devel"

inherit rpm
