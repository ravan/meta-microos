SUMMARY = "A pure Haskell parser and renderer for binary Olson timezone files"
DESCRIPTION = "A parser and renderer for binary Olson timezone files whose format is specified \
by the tzfile(5) man page on Unix-like systems. For more information about this \
format, see <http://www.iana.org/time-zones/repository/tz-link.html>. \
Functions are provided for converting the parsed data into 'TimeZoneSeries' \
objects from the timezone-series package. On many platforms, binary Olson \
timezone files suitable for use with this package are available in the \
directory /usr/share/zoneinfo and its subdirectories on your computer. \
For a way to read binary Olson timezone files at compile time, see the \
timezone-olson-th package \
(<http://hackage.haskell.org/package/timezone-olson-th>)."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-0.2.1-4.3.aarch64.rpm"
RPM_HASH = "6827fdae969f9641bd75a4416c2e0444f9e27dee9c9e9244e6606426b368c33ddf2198077625e8a60b3a18afa600656628de0c2084b349b9192975d44ac59e92"

RPROVIDES:${PN} += "ghc-timezone-olson \
libHStimezone-olson-0.2.1-LErbWe3Sa3TnblddNHkIO-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSextensible-exceptions-0.1.1.4-1DqJiZkXnDRHRXNZtok1ZU-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStimezone-series-0.1.13-B1H9AY16C4DSLWHEx9hhA-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
