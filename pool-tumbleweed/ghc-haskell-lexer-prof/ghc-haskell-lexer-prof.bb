SUMMARY = "Haskell haskell-lexer profiling library"
DESCRIPTION = "This package provides the Haskell haskell-lexer profiling library."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ghc-haskell-lexer-prof-1.2.1-1.6.aarch64.rpm"
RPM_HASH = "7dbab35a66eb5677bde28f67b24fa02ae228511a0cf310d84992224adeb2e41707e84d89e7843ce5bbb8a7a410489c42ad14675939fb05211a040464e2456cd6"

RPROVIDES:${PN} += "ghc-haskell-lexer-prof \
ghc-prof-haskell-lexer-1.2.1-4PpJ3cUTICwEJqFuz43JwQ"

RDEPENDS:${PN} += "ghc-haskell-lexer-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
