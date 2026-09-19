SUMMARY = "Haskell cookie library development files"
DESCRIPTION = "This package provides the Haskell cookie library development files."
LICENSE = "MIT"

PV = "0.5.1"

RPM_NAME = "ghc-cookie-devel-0.5.1-1.12.aarch64.rpm"
RPM_HASH = "9f862e7f54510b7f0f53b7632d60c6a9a252878c861b56c582105ef479e08703f6e1df74ef28657762cb7a7aca1b7bd8b2fec6af5fcdf6ad031e0d0691afafc5"

RPROVIDES:${PN} += "ghc-cookie-devel \
ghc-devel-cookie-0.5.1-ICQl8upm830Ct2nb3AM1Ft"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cookie \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-data-default-class-0.2.0.0-3moOzwNUrN6FLgYZMunU62 \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-time-1.14-a7dc"

inherit rpm
