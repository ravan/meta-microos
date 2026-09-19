SUMMARY = "Haskell commonmark profiling library"
DESCRIPTION = "This package provides the Haskell commonmark profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "ghc-commonmark-prof-0.3-1.3.aarch64.rpm"
RPM_HASH = "5bdb3738735a807ad7f279bbabd4dd680024d8332606967d2568d8f4cb91927f70091599ef2f7d4188afc4f00d7e0bff9de915ab0e833dad599586dc8758f2c6"

RPROVIDES:${PN} += "ghc-commonmark-prof \
ghc-prof-commonmark-0.3-Hb0ZVJyoQFw1ynqgbLue51"

RDEPENDS:${PN} += "ghc-commonmark-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709 \
ghc-prof-unicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj \
ghc-prof-unicode-transforms-0.4.0.1-KtQjAe86DCEJDcpSXQHRSI"

inherit rpm
