SUMMARY = "Optics as an abstract interface: core definitions"
DESCRIPTION = "This package makes it possible to define and use Lenses, Traversals, Prisms and \
other optics, using an abstract interface. . This variant provides core \
definitions with a minimal dependency footprint. See the \
'<https://hackage.haskell.org/package/optics optics>' package (and its \
dependencies) for documentation and the 'batteries-included' variant."
LICENSE = "BSD-3-Clause"

PV = "0.4.2"

RPM_NAME = "ghc-optics-core-0.4.2-1.3.aarch64.rpm"
RPM_HASH = "d3b1cd708f977b461d5a329f80f4ed53b9906a6556a0eeab05eb8ed7f4cf0e0af46955ded3bfef9c0c4567367ec8851e210ecc1c9fedf13eee03b98742e09dca"

RPROVIDES:${PN} += "ghc-optics-core \
libHSoptics-core-0.4.2-7BE8gBXEGOAKzvacYKREXy-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHScontainers-0.7-d5e1-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSindexed-profunctors-0.1.1.1-HSqEhDrwiQJ27Hm9NjzenO-ghc9.12.4.so \
libHSindexed-traversable-0.1.5-JylwuAInS9n4ImeZ4JChDW-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
