SUMMARY = "Haskell vector-algorithms library development files"
DESCRIPTION = "This package provides the Haskell vector-algorithms library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.0"

RPM_NAME = "ghc-vector-algorithms-devel-0.9.1.0-2.3.aarch64.rpm"
RPM_HASH = "1b00e8b90259b4aeb2b8bfbc018890e52e3c7856c439658ed4cc97a7806093bd9b6faf512d21f84278b787f09b621e3d035434abf944f7c1f254cc53b2e6b519"

RPROVIDES:${PN} += "ghc-devel-vector-algorithms-0.9.1.0-KRcdYzVzgLOFSifxDHEL6p \
ghc-vector-algorithms-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bitvec-1.1.6.0-AtnZIEu4pqlECh34uLjm5P \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE \
ghc-vector-algorithms"

inherit rpm
