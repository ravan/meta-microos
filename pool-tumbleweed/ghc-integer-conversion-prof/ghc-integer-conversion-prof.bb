SUMMARY = "Haskell integer-conversion profiling library"
DESCRIPTION = "This package provides the Haskell integer-conversion profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "ghc-integer-conversion-prof-0.1.1-3.2.aarch64.rpm"
RPM_HASH = "574b2a24c9df1f60f7de442abd42300f65e377a8a2b7cdab59870be9cd143a923951d831e28d03028ec1bfd68a28c7a5773e4ff2b9c5616d56d72e0e4c90d5be"

RPROVIDES:${PN} += "ghc-integer-conversion-prof \
ghc-prof-integer-conversion-0.1.1-HaWNFfmKaxu3271U3IJ8uO"

RDEPENDS:${PN} += "ghc-integer-conversion-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-text-2.1.4-cf23"

inherit rpm
