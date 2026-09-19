SUMMARY = "Haskell haskell-lexer library development files"
DESCRIPTION = "This package provides the Haskell haskell-lexer library development files."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ghc-haskell-lexer-devel-1.2.1-1.6.aarch64.rpm"
RPM_HASH = "5c129904ec0cd593b73ba22c63f4e46cf1b89327ff3c57f928e80101497c72b8c86da30b2d736676d52fbddf7d1abe6a34a703688e878cf52b55c53d309a44bc"

RPROVIDES:${PN} += "ghc-devel-haskell-lexer-1.2.1-4PpJ3cUTICwEJqFuz43JwQ \
ghc-haskell-lexer-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-haskell-lexer"

inherit rpm
