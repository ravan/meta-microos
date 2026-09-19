SUMMARY = "Haskell vector-algorithms profiling library"
DESCRIPTION = "This package provides the Haskell vector-algorithms profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.0"

RPM_NAME = "ghc-vector-algorithms-prof-0.9.1.0-2.3.aarch64.rpm"
RPM_HASH = "36fdcb5cb71a76b24b87ba687e6c5b671b671ad4e74677b10099b1bf230fdb945971fb2537fda98fc8d815e7bda4362f9415bb327ffbf928f20b537f4550f24b"

RPROVIDES:${PN} += "ghc-prof-vector-algorithms-0.9.1.0-KRcdYzVzgLOFSifxDHEL6p \
ghc-vector-algorithms-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bitvec-1.1.6.0-AtnZIEu4pqlECh34uLjm5P \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-vector-algorithms-devel"

inherit rpm
