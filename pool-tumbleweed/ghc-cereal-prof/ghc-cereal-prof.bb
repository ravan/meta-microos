SUMMARY = "Haskell cereal profiling library"
DESCRIPTION = "This package provides the Haskell cereal profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.8.3"

RPM_NAME = "ghc-cereal-prof-0.5.8.3-2.35.aarch64.rpm"
RPM_HASH = "e44a2f0fe4ac4bef46fb71a54029e069694be9667a1427b5030a231ff112c683e9475c57a3a5b651c84b0925439b3155d1d9bb7eade94e11e54c1abe18ee9dc9"

RPROVIDES:${PN} += "ghc-cereal-prof \
ghc-prof-cereal-0.5.8.3-9RjPyVhfWFC69r1oCUPmww"

RDEPENDS:${PN} += "ghc-cereal-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-ghc-prim-0.13.0-f55c"

inherit rpm
