SUMMARY = "Haskell timezone-olson profiling library"
DESCRIPTION = "This package provides the Haskell timezone-olson profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-prof-0.2.1-4.3.aarch64.rpm"
RPM_HASH = "3aae1067c6c8c04c3d71a54345806d05ab32b716612134826a646723f9e6e2e895375471a13e25f6669cf6591063a582166cc8255dd3863fd8a075304dba87dd"

RPROVIDES:${PN} += "ghc-prof-timezone-olson-0.2.1-LErbWe3Sa3TnblddNHkIO \
ghc-timezone-olson-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-extensible-exceptions-0.1.1.4-1DqJiZkXnDRHRXNZtok1ZU \
ghc-prof-time-1.14-a7dc \
ghc-prof-timezone-series-0.1.13-B1H9AY16C4DSLWHEx9hhA \
ghc-timezone-olson-devel"

inherit rpm
