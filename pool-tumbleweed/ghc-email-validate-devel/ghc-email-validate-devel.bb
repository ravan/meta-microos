SUMMARY = "Haskell email-validate library development files"
DESCRIPTION = "This package provides the Haskell email-validate library development files."
LICENSE = "BSD-3-Clause"

PV = "2.3.2.21"

RPM_NAME = "ghc-email-validate-devel-2.3.2.21-1.17.aarch64.rpm"
RPM_HASH = "033239175cfb8875d9dad91cd64da253115f946d01763579c6261f054dabd223c20c6b4bdf1a21c2c3c8c641534b9f43729955706e9bff88a775417af5081608"

RPROVIDES:${PN} += "ghc-devel-email-validate-2.3.2.21-Kzdyy7ay2BfLqW6NieUzU3 \
ghc-email-validate-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-IG7JFX7g1aObGVedAHYv7 \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-email-validate"

inherit rpm
