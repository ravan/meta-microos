SUMMARY = "Haskell base profiling library"
DESCRIPTION = "This package provides the Haskell base profiling library."
LICENSE = "BSD-3-Clause"

PV = "4.21.2.0"

RPM_NAME = "ghc-base-prof-4.21.2.0-1.3.aarch64.rpm"
RPM_HASH = "77fc4b1cf6930bfd7b41ff1942ab2d1acd8109267d2e2b38eb6a93a21f73907d949874b6743ea9b493f6442d3e6919204388dd31371c70f3dc79c89f979ac9d0"

RPROVIDES:${PN} += "ghc-base-prof \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-integer-gmp-1.1-09fd \
ghc-prof-rts-1.0.3 \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libHSinteger-gmp-1.1-09fd-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-base-devel \
ghc-prof-ghc-bignum-1.3-03b0 \
ghc-prof-ghc-internal-9.1204.0-f1e1 \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
