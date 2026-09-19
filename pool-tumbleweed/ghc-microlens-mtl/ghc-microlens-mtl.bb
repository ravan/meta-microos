SUMMARY = "Microlens support for Reader/Writer/State from mtl"
DESCRIPTION = "This package contains functions (like 'view' or '+=') which work on \
'MonadReader', 'MonadWriter', and 'MonadState' from the mtl package. \
 \
This package is a part of the <http://hackage.haskell.org/package/microlens \
microlens> family; see the readme \
<https://github.com/stevenfontanella/microlens#readme on Github>."
LICENSE = "BSD-3-Clause"

PV = "0.2.1.1"

RPM_NAME = "ghc-microlens-mtl-0.2.1.1-1.9.aarch64.rpm"
RPM_HASH = "9b6a1c0a3e694793eecb904aaf84a304ca16c61ec84adde1abbf6da2f07b2323795d7d3dba38b44714f45eb2a779c5a5776c08db54957bb6f11249f4d2d90cd1"

RPROVIDES:${PN} += "ghc-microlens-mtl \
libHSmicrolens-mtl-0.2.1.1-8JUCbV1SpIrJP4FZoU0oV5-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmicrolens-0.5.0.0-K1fQqqDyjwS5maOWIXQxx3-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHStransformers-compat-0.7.2-Je4epVh1rXP8zT22dFNkMW-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
