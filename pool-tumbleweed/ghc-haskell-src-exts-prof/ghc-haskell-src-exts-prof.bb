SUMMARY = "Haskell haskell-src-exts profiling library"
DESCRIPTION = "This package provides the Haskell haskell-src-exts profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.23.1"

RPM_NAME = "ghc-haskell-src-exts-prof-1.23.1-1.14.aarch64.rpm"
RPM_HASH = "23d6f42898beb1f9a95ce08b1212df1ac391af4d6f0f5d3a01f7ab8b308f7f28ad5a03388c51d4640449de1931ba72e12aa219299e01e43864250f0c91140dde"

RPROVIDES:${PN} += "ghc-haskell-src-exts-prof \
ghc-prof-haskell-src-exts-1.23.1-2QXJ6YmpNBDADgPssiT27j"

RDEPENDS:${PN} += "ghc-haskell-src-exts-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-pretty-1.1.3.6-b7fd"

inherit rpm
