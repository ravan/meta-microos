SUMMARY = "Haskell commonmark library development files"
DESCRIPTION = "This package provides the Haskell commonmark library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "ghc-commonmark-devel-0.3-1.3.aarch64.rpm"
RPM_HASH = "20b4264532f6c60d57f3eaee2d41549fd89772898a52a9a6effbc94c46e025502857dbb6fd001c48d64ced29aadce51cfe268eb69e05be8b4e37e2c806831f54"

RPROVIDES:${PN} += "ghc-commonmark-devel \
ghc-devel-commonmark-0.3-Hb0ZVJyoQFw1ynqgbLue51"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commonmark \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709 \
ghc-devel-unicode-data-0.6.0-L8MzYkzbuQvKbpFsnfTHmj \
ghc-devel-unicode-transforms-0.4.0.1-KtQjAe86DCEJDcpSXQHRSI"

inherit rpm
