SUMMARY = "Haskell base-orphans profiling library"
DESCRIPTION = "This package provides the Haskell base-orphans profiling library."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "ghc-base-orphans-prof-0.9.4-1.3.aarch64.rpm"
RPM_HASH = "f1ddbe6e7d939f7f28683f3d1f0b2204394ccef7ad23af5fe210eacb344b5c9b6f2bbc7812c346981553e27a2c9cbb958f0ed4224fee8c91b4eeb56279a4d645"

RPROVIDES:${PN} += "ghc-base-orphans-prof \
ghc-prof-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO"

RDEPENDS:${PN} += "ghc-base-orphans-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
