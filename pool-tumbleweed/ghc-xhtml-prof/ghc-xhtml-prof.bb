SUMMARY = "Haskell xhtml profiling library"
DESCRIPTION = "This package provides the Haskell xhtml profiling library."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-prof-3000.2.2.1-1.3.aarch64.rpm"
RPM_HASH = "80d03b459aa405afda32d68ef3c83ef865ac74a5e98c759211d7dcb694f85f5e72ed4086b059123bead8da044314fbe5b43756c927b0ffa06b23abf5c543b545"

RPROVIDES:${PN} += "ghc-prof-xhtml-3000.2.2.1-fadd \
ghc-xhtml-prof \
libHSxhtml-3000.2.2.1-fadd-p-ghc9.12.4.so"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-xhtml-devel \
libHSbase-4.21.2.0-8844-p-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-p-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-p-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-p-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
