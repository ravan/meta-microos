SUMMARY = "Haskell cryptonite-conduit profiling library"
DESCRIPTION = "This package provides the Haskell cryptonite-conduit profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-cryptonite-conduit-prof-0.2.2-9.59.aarch64.rpm"
RPM_HASH = "e1e3081b2e2008d08360b9255323a839504d0ab97acde42c68317e5de5bef6ce169bc512c8415a840926502180d135fc865c9880cca471ea890d2934dcbcf7c1"

RPROVIDES:${PN} += "ghc-cryptonite-conduit-prof \
ghc-prof-cryptonite-conduit-0.2.2-qDmBdvJgO634ZOM5Mwvw3"

RDEPENDS:${PN} += "ghc-cryptonite-conduit-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-conduit-1.3.6.1-DuJaiNNDon54jV6QjcNayt \
ghc-prof-conduit-extra-1.3.8-7wpnn7nJp1SI8VsobZmenc \
ghc-prof-cryptonite-0.30-LDHPOjDfFNPE9tRl2y8VSO \
ghc-prof-exceptions-0.10.12-f655 \
ghc-prof-memory-0.18.0-4OCVGiXkS6t9StTfiwlZlu \
ghc-prof-resourcet-1.3.0-F8ZRgExkptBLIQxE9m0AZE \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
