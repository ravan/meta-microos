SUMMARY = "Swap and assoc: Symmetric and Semigroupy Bifunctors"
DESCRIPTION = "Provides generalisations of 'swap :: (a,b) -> (b,a)' and 'assoc :: ((a,b),c) -> \
(a,(b,c))' to 'Bifunctor's supporting similar operations (e.g. \
'Either', 'These')."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "ghc-assoc-1.1.1-3.3.aarch64.rpm"
RPM_HASH = "567a0b234d4cc573fbe9903348210fa9f68a7656e4870000a71a368d04ac7c795a0c617c07afaae7c0d063a81a411e8180182e6666c61e113f69f5dd0aaa4000"

RPROVIDES:${PN} += "ghc-assoc \
libHSassoc-1.1.1-7ZKlIzFkmc1FQCJcpfYrTi-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
