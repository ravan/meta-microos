SUMMARY = "Haskell crypto-token profiling library"
DESCRIPTION = "This package provides the Haskell crypto-token profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "ghc-crypto-token-prof-0.2.0-1.2.aarch64.rpm"
RPM_HASH = "2c7fca57c1d504d16d6627e0b2dd17089d38783338639fce0ee233bc7f4d13c9d6391db9eda467b1f897a4d2f486473f502facbacdde08fe6169347614f3c8bc"

RPROVIDES:${PN} += "ghc-crypto-token-prof \
ghc-prof-crypto-token-0.2.0-DtnqWEKcimRLBs2fTpfiGj"

RDEPENDS:${PN} += "ghc-crypto-token-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-crypton-1.1.4-CRp9zIWu5CJCaPWpwBhIPB \
ghc-prof-network-byte-order-0.1.8-2e5INl5ljJtIwuBIoNgv18 \
ghc-prof-ram-0.22.0-4Io46KcWliV5ncwh4lemlr"

inherit rpm
