SUMMARY = "Haskell base library"
DESCRIPTION = "This package provides the Haskell base library."
LICENSE = "BSD-3-Clause"

PV = "4.21.2.0"

RPM_NAME = "ghc-base-4.21.2.0-1.3.aarch64.rpm"
RPM_HASH = "46b71063e0b2d13c67c546444a1c1ce4ff8f89b9ceb25aef9326ef93f99d605ef3caaf817ef81ab7ff72e532d1f1b59ee61a3e2d788b5b2d3acb1a0642b90a71"

RPROVIDES:${PN} += "ghc-base \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSinteger-gmp-1.1-09fd-ghc9.12.4.so \
libHSrts-1.0.3-debug-ghc9.12.4.so \
libHSrts-1.0.3-debug-p-ghc9.12.4.so \
libHSrts-1.0.3-ghc9.12.4.so \
libHSrts-1.0.3-p-ghc9.12.4.so \
libHSrts-1.0.3-thr-debug-ghc9.12.4.so \
libHSrts-1.0.3-thr-debug-p-ghc9.12.4.so \
libHSrts-1.0.3-thr-ghc9.12.4.so \
libHSrts-1.0.3-thr-p-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
