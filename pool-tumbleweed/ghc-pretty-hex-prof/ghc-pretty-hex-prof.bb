SUMMARY = "Haskell pretty-hex profiling library"
DESCRIPTION = "This package provides the Haskell pretty-hex profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-prof-1.1-4.19.aarch64.rpm"
RPM_HASH = "04ca6f3740d1a1c5a355807b2914df79b78f34aeb5399b512465dde2024e0e7909cc510f8dc626cbfc4140cb0d423c438837e397659feec15a06b0e39ea1e18b"

RPROVIDES:${PN} += "ghc-pretty-hex-prof \
ghc-prof-pretty-hex-1.1-9KkuISSwhPFByR4xDG3StA"

RDEPENDS:${PN} += "ghc-pretty-hex-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be"

inherit rpm
