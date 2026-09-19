SUMMARY = "Haskell xhtml library"
DESCRIPTION = "This package provides the Haskell xhtml library."
LICENSE = "BSD-3-Clause"

PV = "3000.2.2.1"

RPM_NAME = "ghc-xhtml-3000.2.2.1-1.3.aarch64.rpm"
RPM_HASH = "f5d7a59c18b0c80efc88bb67b75345be6320394ac00cf46dbc1b31bf4230738b29b9d7b7d6a96efa5540229925320e2f294a59ca6d10bb198db83e7916afe955"

RPROVIDES:${PN} += "ghc-xhtml \
libHSxhtml-3000.2.2.1-fadd-ghc9.12.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
