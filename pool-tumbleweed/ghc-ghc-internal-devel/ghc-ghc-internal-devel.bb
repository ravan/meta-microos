SUMMARY = "Haskell ghc-internal library development files"
DESCRIPTION = "This package provides the Haskell ghc-internal library development files."
LICENSE = "BSD-3-Clause"

PV = "9.1204.0"

RPM_NAME = "ghc-ghc-internal-devel-9.1204.0-1.3.aarch64.rpm"
RPM_HASH = "61356e0241900f07636ab276739bf249f593d31dcc5bef63e62aa4e36ba6ba0c8fa381afc8af6af98234d4bb9b220a9a65a314522093f3fbfc16de602fd33856"

RPROVIDES:${PN} += "ghc-devel-ghc-internal-9.1204.0-f1e1 \
ghc-ghc-internal-devel \
ghc-ghc-internal-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-ghc-bignum-1.3-03b0 \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-devel-rts-1.0.3 \
ghc-ghc-internal"

inherit rpm
