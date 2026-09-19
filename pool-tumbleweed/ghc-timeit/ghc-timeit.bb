SUMMARY = "Time monadic computations with an IO base"
DESCRIPTION = "A simple wrapper to show the used CPU time of monadic computation with an IO \
base."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "ghc-timeit-2.0-6.19.aarch64.rpm"
RPM_HASH = "56878602e086f12acb003240accba49291af039e4c5f19a832ffdb2e7b95e9d02d852f251456e1139a292a7c6253d205ee51d2a5f39d332aae51720249c72ab8"

RPROVIDES:${PN} += "ghc-timeit \
libHStimeit-2.0-3tAgGDzIoCu1cNsnFuFQeC-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
