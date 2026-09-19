SUMMARY = "Singleton Tuple"
DESCRIPTION = "This package is a compatibility package for a singleton data type \
 \
> data Solo a = MkSolo a \
 \
Note: it's not a 'newtype' \
 \
'Solo' is available in 'base-4.16' (GHC-9.2)."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-OneTuple-0.4.3-1.3.aarch64.rpm"
RPM_HASH = "cc489c6e05b2e68536dc3c7ecc71eb2a0bc71eaef5b7389251bba29ef857f0ac45e1826f3b3b1ed5e4bab5418f558bc5d40702d40d808fdec212c65fde22b74a"

RPROVIDES:${PN} += "ghc-OneTuple \
libHSOneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo-ghc9.12.4.so"

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
