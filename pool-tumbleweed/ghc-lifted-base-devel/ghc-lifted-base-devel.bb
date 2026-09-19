SUMMARY = "Haskell lifted-base library development files"
DESCRIPTION = "This package provides the Haskell lifted-base library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3.12"

RPM_NAME = "ghc-lifted-base-devel-0.2.3.12-8.36.aarch64.rpm"
RPM_HASH = "1621225234a30fa87224967b06398bf15c9e52ca368e9965c593c4a2ee117132b7a10299ed1144843b1dfc081dbf8dee052a4bc4ae2ec34af93a8d56905c0e0d"

RPROVIDES:${PN} += "ghc-devel-lifted-base-0.2.3.12-BonMj4p70Ef8zpL3zVJvsV \
ghc-lifted-base-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-monad-control-1.0.3.1-EAQeykrh4iCEl5x3Heycqt \
ghc-devel-transformers-base-0.4.6.1-AexBYmHB9CZDEWAojzlCzB \
ghc-lifted-base"

inherit rpm
