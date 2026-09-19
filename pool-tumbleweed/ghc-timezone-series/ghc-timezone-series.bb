SUMMARY = "Enhanced timezone handling for Data.Time"
DESCRIPTION = "This package endows Data.Time, from the time package, with several data types \
and functions for enhanced processing of timezones. For one way to create \
timezone series, see the timezone-olson \
(<http://hackage.haskell.org/package/timezone-olson>) and timezone-olson-th \
(<http://hackage.haskell.org/package/timezone-olson-th>) packages."
LICENSE = "BSD-3-Clause"

PV = "0.1.13"

RPM_NAME = "ghc-timezone-series-0.1.13-4.3.aarch64.rpm"
RPM_HASH = "2d2f2cdad70edcee1f3c1b3632733ccb15f6ce2e21d388df8b29ae849cb689fd8c5a0802deeee4773dad77a064ce93251766b5e306edb69389fc8795155ab5d8"

RPROVIDES:${PN} += "ghc-timezone-series \
libHStimezone-series-0.1.13-B1H9AY16C4DSLWHEx9hhA-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
