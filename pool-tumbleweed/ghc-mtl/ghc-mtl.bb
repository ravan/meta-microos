SUMMARY = "Haskell mtl library"
DESCRIPTION = "This package provides the Haskell mtl library."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "ghc-mtl-2.3.2-1.3.aarch64.rpm"
RPM_HASH = "058ed18422dba43b98a573b807a762d9db3f97f69835372aa65c65c0a418f7f658f99dcdf2914a42e62c029c18672ca358abf8bdb19d6e58fd8eaa7f6e6c0fc9"

RPROVIDES:${PN} += "ghc-mtl \
libHSmtl-2.3.2-37ef-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
