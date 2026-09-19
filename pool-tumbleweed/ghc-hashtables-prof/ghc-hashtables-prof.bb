SUMMARY = "Haskell hashtables profiling library"
DESCRIPTION = "This package provides the Haskell hashtables profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "ghc-hashtables-prof-1.4.2-1.20.aarch64.rpm"
RPM_HASH = "f07f72ec533605ec6c4a4815d30ba4281090e684adb5f80fa8f66940b8f6b19ea653f0498cd3c7ac61a4d66c8c02a93cff6ce9400e524a8fd127e1ac74c592d8"

RPROVIDES:${PN} += "ghc-hashtables-prof \
ghc-prof-hashtables-1.4.2-FXtFcQfURO18P8ZBa2ZYOT"

RDEPENDS:${PN} += "ghc-hashtables-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-hashable-1.5.1.0-csiQUH7RkN8TUlZyJbFpr \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
