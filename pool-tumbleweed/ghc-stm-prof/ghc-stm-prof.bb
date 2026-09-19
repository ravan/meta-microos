SUMMARY = "Haskell stm profiling library"
DESCRIPTION = "This package provides the Haskell stm profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.5.3.1"

RPM_NAME = "ghc-stm-prof-2.5.3.1-1.3.aarch64.rpm"
RPM_HASH = "5f7c7e1baa3451f3d078a13324cc0d8e5f1ffa51c2fe16973aae581006aff0b48ca957842402e6853a84258d9526609d0e7d056f99432d3fdae71905bc294adf"

RPROVIDES:${PN} += "ghc-prof-stm-2.5.3.1-6d74 \
ghc-stm-prof \
libHSstm-2.5.3.1-6d74-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-stm-devel \
libHSarray-0.5.8.0-2a42-p-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
