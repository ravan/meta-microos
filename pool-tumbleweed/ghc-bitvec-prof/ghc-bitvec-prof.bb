SUMMARY = "Haskell bitvec profiling library"
DESCRIPTION = "This package provides the Haskell bitvec profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.1.6.0"

RPM_NAME = "ghc-bitvec-prof-1.1.6.0-1.3.aarch64.rpm"
RPM_HASH = "73126b4dddb3e35f18ca7269959c49b00107bebef5a2e5b8d028196fd6ac1f384fae17fbf590f09eddcc2aea6bc4e4211119141d170f84d4c363067d466a9818"

RPROVIDES:${PN} += "ghc-bitvec-prof \
ghc-prof-bitvec-1.1.6.0-AtnZIEu4pqlECh34uLjm5P"

RDEPENDS:${PN} += "ghc-bitvec-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-ghc-bignum-1.3-03b0 \
ghc-prof-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-prof-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
