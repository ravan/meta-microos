SUMMARY = "Lift a type from a Typeable constraint to a Template Haskell type"
DESCRIPTION = "Lift your types from a Typeable constraint to a Template Haskell type."
LICENSE = "BSD-3-Clause"

PV = "0.1.2.0"

RPM_NAME = "ghc-lift-type-0.1.2.0-1.12.aarch64.rpm"
RPM_HASH = "314eb6b08b3cb40dda09cdd47c2b42cf028c6daa71726c4b4a49a292ea6a02004925bb0c23a2c1f1fb8176ff0eebd71838b46a65caa78792fb686a6db49181f9"

RPROVIDES:${PN} += "ghc-lift-type \
libHSlift-type-0.1.2.0-5Wrf181y1CRJpVkgxBFKkO-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
