SUMMARY = "Haskell StateVar profiling library"
DESCRIPTION = "This package provides the Haskell StateVar profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-prof-1.2.2-2.23.aarch64.rpm"
RPM_HASH = "eef519adebe037ff7485db1ca00c0c59f00c80058467bfdcd94e9edec7886c436f5f73f487ca127459b9b098a5b8ab065affbddf372dc4d930707e21f1da3356"

RPROVIDES:${PN} += "ghc-StateVar-prof \
ghc-prof-StateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA"

RDEPENDS:${PN} += "ghc-StateVar-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-stm-2.5.3.1-6d74 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
