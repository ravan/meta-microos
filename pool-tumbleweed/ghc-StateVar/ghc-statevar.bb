SUMMARY = "State variables"
DESCRIPTION = "This package contains state variables, which are references in the IO monad, \
like IORefs or parts of the OpenGL state."
LICENSE = "BSD-3-Clause"

PV = "1.2.2"

RPM_NAME = "ghc-StateVar-1.2.2-2.23.aarch64.rpm"
RPM_HASH = "6a1b426c7c0f9f4aef14a09788e158525fb82afb8976f1d07eef6b27091baf1e57fe0ed3b7253d375d42fa776474162beff365e2bf2398760096d608e6daa222"

RPROVIDES:${PN} += "ghc-StateVar \
libHSStateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
