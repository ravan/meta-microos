SUMMARY = "Haskell magic profiling library"
DESCRIPTION = "This package provides the Haskell magic profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "ghc-magic-prof-1.1.2-1.2.aarch64.rpm"
RPM_HASH = "2657e92e2c8f7c7db2ecd273cc28d48a09a0ce04eccf4ca498b321a98395c442b0863d424d44c10fd3a9a75637cd5704f9358d6767b4f96e52d01331445bd10d"

RPROVIDES:${PN} += "ghc-magic-prof \
ghc-prof-magic-1.1.2-FUYWSwmPGvH2Sd1F0sVlnx"

RDEPENDS:${PN} += "ghc-magic-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
