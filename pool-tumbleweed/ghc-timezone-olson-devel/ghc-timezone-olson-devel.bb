SUMMARY = "Haskell timezone-olson library development files"
DESCRIPTION = "This package provides the Haskell timezone-olson library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-devel-0.2.1-4.3.aarch64.rpm"
RPM_HASH = "711123a8e669e245a5d1301281e9c9916a47d9fef8900081d4d9b095619746cb66efc6040e1ba8cb61cc5beb57ff627a2eb6c39020adcaae443a2cead5966b98"

RPROVIDES:${PN} += "ghc-devel-timezone-olson-0.2.1-LErbWe3Sa3TnblddNHkIO \
ghc-timezone-olson-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-extensible-exceptions-0.1.1.4-1DqJiZkXnDRHRXNZtok1ZU \
ghc-devel-time-1.14-a7dc \
ghc-devel-timezone-series-0.1.13-B1H9AY16C4DSLWHEx9hhA \
ghc-timezone-olson"

inherit rpm
