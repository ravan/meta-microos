SUMMARY = "Conversion between emoji characters and their names"
DESCRIPTION = "This package provides functions for converting emoji names to emoji characters \
and vice versa. \
 \
How does it differ from the 'emoji' package? \
 \
- It supports a fuller range of emojis, including all those supported by GitHub \
- It supports lookup of emoji aliases from emoji - It uses Text rather than \
String - It has a lighter dependency footprint: in particular, it does not \
require aeson - It does not require TemplateHaskell."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-emojis-0.1.5-1.3.aarch64.rpm"
RPM_HASH = "66fb0e4ece69615ffa4dc7f0b9352c2d9d50033fd3a7d4e325dddd64bfc9bab47a08c197d291abefe9170ff482b6177916d190377135af18c8921bf10161ff48"

RPROVIDES:${PN} += "ghc-emojis \
libHSemojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbinary-0.8.9.3-9861-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStext-2.1.4-cf23-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
