SUMMARY = "Directed acyclic graphs"
DESCRIPTION = "Directed acyclic graphs can be sorted topographically. Existence of topographic \
ordering allows writing many graph algorithms efficiently. And many graphs, \
e.g. most dependency graphs are acyclic! \
 \
There are some algorithms built-in: dfs, transpose, transitive closure, \
transitive reduction... Some algorithms even become not-so-hard to implement, \
like a longest path!."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ghc-topograph-1.0.1-2.21.aarch64.rpm"
RPM_HASH = "bb9acd3e1e43930aa4def4f6e1bd1f22cc886fe13aad39463b59a2465ae7bcb5026003eff34ccd66ba4d372a5da00e2e2caaa18b36e32ced4e8d2104b2bd8c7b"

RPROVIDES:${PN} += "ghc-topograph \
libHStopograph-1.0.1-BHST0XcqM4j6FrILQ4Vv3y-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbase-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSprimitive-0.9.1.0-Ez30Vu7tivmF28X1123Css-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSvector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE-ghc9.12.4.so \
libHSvector-stream-0.1.0.1-FXRnPnZDT7tJ4JCMEuh1XF-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
