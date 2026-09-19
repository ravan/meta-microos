SUMMARY = "Haskell OneTuple profiling library"
DESCRIPTION = "This package provides the Haskell OneTuple profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3"

RPM_NAME = "ghc-OneTuple-prof-0.4.3-1.3.aarch64.rpm"
RPM_HASH = "5434b26eafe8164a0cff35fd5f9528cac5a0df5843c9c81e802492600e606007aecdc80e38c1ea46e0a9f3b2a51464999fd7d09eb98d70c6e38dcbf8f11e70cd"

RPROVIDES:${PN} += "ghc-OneTuple-prof \
ghc-prof-OneTuple-0.4.3-6DcV56rVPgKHcnOuxvKUVo"

RDEPENDS:${PN} += "ghc-OneTuple-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-template-haskell-2.23.0.0-358a"

inherit rpm
