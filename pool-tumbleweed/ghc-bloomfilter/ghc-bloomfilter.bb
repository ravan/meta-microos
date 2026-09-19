SUMMARY = "Pure and impure Bloom Filter implementations"
DESCRIPTION = "Pure and impure Bloom Filter implementations."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.3"

RPM_NAME = "ghc-bloomfilter-2.0.1.3-1.7.aarch64.rpm"
RPM_HASH = "22caac24b5d728cdc137b47b4359b462f2169dde570a14885f3485fe96d98821d32e47d8024816c2468d8f755d7328fae4c75b6ab5f5277cdc464bf4b8045688"

RPROVIDES:${PN} += "ghc-bloomfilter \
libHSbloomfilter-2.0.1.3-6WqEF5kyWs0ITGKrOkkdRL-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
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
