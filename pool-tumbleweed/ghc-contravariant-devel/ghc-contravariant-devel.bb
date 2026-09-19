SUMMARY = "Haskell contravariant library development files"
DESCRIPTION = "This package provides the Haskell contravariant library development files."
LICENSE = "BSD-3-Clause"

PV = "1.5.6"

RPM_NAME = "ghc-contravariant-devel-1.5.6-1.3.aarch64.rpm"
RPM_HASH = "f1085a6fc844b2bcf48ffb1470583ef74ad90fd8e3c26cfcec9cb802dc1930e561c6be44040273d3849a6314d717076e6b567268676cf075fd01d203d4547059"

RPROVIDES:${PN} += "ghc-contravariant-devel \
ghc-devel-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-contravariant \
ghc-devel-StateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
