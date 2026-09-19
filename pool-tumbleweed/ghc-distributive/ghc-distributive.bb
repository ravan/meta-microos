SUMMARY = "Distributive functors -- Dual to Traversable"
DESCRIPTION = "Distributive functors -- Dual to 'Traversable'."
LICENSE = "BSD-2-Clause"

PV = "0.6.3"

RPM_NAME = "ghc-distributive-0.6.3-1.3.aarch64.rpm"
RPM_HASH = "3df9e9d1bcd1a459fe58c170ee98d200e8ffd1a448f9f9c6f003c824e96945f617e7514e7d2174f5398d190d9321dac737fa01624e2b55108f9708bfb3251345"

RPROVIDES:${PN} += "ghc-distributive \
libHSdistributive-0.6.3-9lg1Hxwh2KlJVxh3zQCgyL-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStagged-0.8.10-H6Ef5dd4ktu4CIJjtjtwM7-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
