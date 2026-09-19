SUMMARY = "Existential type: Some"
DESCRIPTION = "This library defines an existential type 'Some'. \
 \
' data Some f where Some :: f a -> Some f ' \
 \
in few variants, and utilities to work with it. \
 \
If you are unsure which variant to use, use the one in 'Data.Some' module."
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "ghc-some-1.0.6-6.3.aarch64.rpm"
RPM_HASH = "84bb714ffce51d47220c03607b408d76d2b520f6d65489b7505c5a82245348660889a0af78404b87a44bce8c9861a06beb545ff15538c42fe7da6b29b06afc2a"

RPROVIDES:${PN} += "ghc-some \
libHSsome-1.0.6-8u6QsVxyLEPKKVYkZL0j6j-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
