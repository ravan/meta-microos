SUMMARY = "Haskell contravariant profiling library"
DESCRIPTION = "This package provides the Haskell contravariant profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.5.6"

RPM_NAME = "ghc-contravariant-prof-1.5.6-1.3.aarch64.rpm"
RPM_HASH = "bdfe589be64282b4564770c0c61671390ac0b75699990e87618a01c139ef707b884a10388a762d0e9d49554482951fd57835b37d0ace6bf1d44707e5fc568417"

RPROVIDES:${PN} += "ghc-contravariant-prof \
ghc-prof-contravariant-1.5.6-7FVTzec2jegEwzkeRkQOi4"

RDEPENDS:${PN} += "ghc-contravariant-devel \
ghc-prof-StateVar-1.2.2-Fp8KJyjTxyjFvIxRBzfDbA \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
