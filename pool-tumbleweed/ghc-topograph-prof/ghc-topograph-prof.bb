SUMMARY = "Haskell topograph profiling library"
DESCRIPTION = "This package provides the Haskell topograph profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ghc-topograph-prof-1.0.1-2.21.aarch64.rpm"
RPM_HASH = "cea522a12a150668886b64615816ae7d5d4ffe7aeb1bbc79409b21f847c74cd03f86f9e6897b3eb41dea78afc16eb74c10a65058dc6a2ffb457321202f4cc743"

RPROVIDES:${PN} += "ghc-prof-topograph-1.0.1-BHST0XcqM4j6FrILQ4Vv3y \
ghc-topograph-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-base-orphans-0.9.4-2vMgOxDXOniBrPCxqNGyGO \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-topograph-devel"

inherit rpm
