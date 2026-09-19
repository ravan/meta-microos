SUMMARY = "Haskell serialise profiling library"
DESCRIPTION = "This package provides the Haskell serialise profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.1"

RPM_NAME = "ghc-serialise-prof-0.2.6.1-5.15.aarch64.rpm"
RPM_HASH = "eb7be4f0331c87a1d4f809f829034a37cf86823b7350d1133114d78704a97dd5634cef83fc855ce41410e4b73eaaf26eaf3329474ac2453ccda000fa66376af2"

RPROVIDES:${PN} += "ghc-prof-serialise-0.2.6.1-IhsMlR98JASD6tuC7PEMx7 \
ghc-serialise-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-cborg-0.2.10.0-64S0XwCJRqFCXzW08346EZ \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-half-0.3.3-7uW8H7RguCn8iNkagLajaD \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-strict-0.5.1-9s5NAvHzvkrI18NRIQgFhz \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-these-1.2.1-IItOvRyyn8cFsXxaqiOQHG \
ghc-prof-time-1.14-a7dc \
ghc-prof-unordered-containers-0.2.21-BkBQHKMtdH7EKz6YnT01Lu \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-serialise-devel"

inherit rpm
