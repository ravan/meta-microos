SUMMARY = "Haskell bitvec library development files"
DESCRIPTION = "This package provides the Haskell bitvec library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.6.0"

RPM_NAME = "ghc-bitvec-devel-1.1.6.0-1.3.aarch64.rpm"
RPM_HASH = "6f3bed405c5262d6b8aed246f8f941f5f1fc5adc1f6697c8d3c7df5f49a8d69fc2af41884081eac9a4a7b647d2b8ab2efe7a3b3f94e9ae57366febdfe98ae058"

RPROVIDES:${PN} += "ghc-bitvec-devel \
ghc-devel-bitvec-1.1.6.0-AtnZIEu4pqlECh34uLjm5P"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bitvec \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-deepseq-1.5.1.0-1350 \
ghc-devel-ghc-bignum-1.3-03b0 \
ghc-devel-primitive-0.9.1.0-Ez30Vu7tivmF28X1123Css \
ghc-devel-vector-0.13.2.0-F8givqpU8HnLN0O3dVdeWE"

inherit rpm
