SUMMARY = "Haskell clock profiling library"
DESCRIPTION = "This package provides the Haskell clock profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "ghc-clock-prof-0.8.4-1.19.aarch64.rpm"
RPM_HASH = "6d3633251493f2d97f65b5b14497be0a6925ae08498ab8bba5441d8a6b0be2361453f53c5d01c2921c607b01043082d46fd8380a5504405b642be2208c6066c4"

RPROVIDES:${PN} += "ghc-clock-prof \
ghc-prof-clock-0.8.4-Jabd1gSnpD77RKirxFCoTK"

RDEPENDS:${PN} += "ghc-clock-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
