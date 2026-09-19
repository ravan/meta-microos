SUMMARY = "Haskell cryptonite-conduit library development files"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-devel-0.2.2-9.59.aarch64.rpm"
RPM_HASH = "c856995cc86a26db266e076a064a71368853f8e5b3b877e6d52c1382f9f82a985f81f5042f4d42d3ab2cb9715fa8c36c551dd7f9f9b8424ad52c05f975661900"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-devel \
ghc-devel-cryptonite-conduit-0.2.2-qDmBdvJgO634ZOM5Mwvw3"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-cryptonite-conduit \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-devel-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-devel-cryptonite-0.30-LDHPOjDfFNPE9tRl2y8VSO \
ghc-devel-exceptions-0.10.12-f655 \
ghc-devel-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu \
ghc-devel-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
