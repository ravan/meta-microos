SUMMARY = "Haskell ghc-bignum library development files"
DESCRIPTION = "This package provides the Haskell ghc-bignum library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-ghc-bignum-devel-1.3-1.3.aarch64.rpm"
RPM_HASH = "6568c1ccb34ce50717e92f7b4c2ae69aa6bcdae0179e60f57f58f727eb939ec76257dcc16cfbef3fda4b1a533630ea9f07c761ea9ebb9c9a7e1b04d5e614667c"

RPROVIDES:${PN} += "ghc-devel-ghc-bignum-1.3-03b0 \
ghc-ghc-bignum-devel \
ghc-ghc-bignum-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-ghc-prim-0.13.0-f55c \
ghc-ghc-bignum"

inherit rpm
