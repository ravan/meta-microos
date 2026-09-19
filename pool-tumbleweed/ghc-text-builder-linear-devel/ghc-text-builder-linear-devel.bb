SUMMARY = "Haskell text-builder-linear library development files"
DESCRIPTION = "This package provides the Haskell text-builder-linear library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-text-builder-linear-devel-0.1.3-1.20.aarch64.rpm"
RPM_HASH = "9e5950c49be8828c804465999072544fc498da8a3ad80b469c132ca0b43d879f892c85706f9097ebba1c129990c0a149cdd24838bda36395638957484df599c3"

RPROVIDES:${PN} += "ghc-devel-text-builder-linear-0.1.3-2ecVyAm1DTtJbSvV9ASpSh \
ghc-text-builder-linear-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-ghc-bignum-1.3-03b0 \
ghc-devel-quote-quot-0.2.1.0-8ke8gm9O7CFLkwYR1NwZbK \
ghc-devel-text-2.1.4-cf23 \
ghc-text-builder-linear"

inherit rpm
