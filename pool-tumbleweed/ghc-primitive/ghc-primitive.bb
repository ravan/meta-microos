SUMMARY = "Primitive memory-related operations"
DESCRIPTION = "This package provides various primitive memory-related operations."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.0"

RPM_NAME = "ghc-primitive-0.9.1.0-2.3.aarch64.rpm"
RPM_HASH = "d66a36ffa6f2acf9161bca717530b555b80776afc75ae51da9f38be845c2fbac08fc8d3f026bec4426da6eca5a709a6baaf49934cffe62c44816ed3caa038afd"

RPROVIDES:${PN} += "ghc-primitive \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
