SUMMARY = "Haskell pretty-show profiling library"
DESCRIPTION = "This package provides the Haskell pretty-show profiling library."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-prof-1.10-4.37.aarch64.rpm"
RPM_HASH = "c0dd7efbcb4e344339c82cd584166599d1403e60b4e5b9b3de89961ddf13e944b08b495299b8d800824f9eb8ea678eadae25ce3157efaaa4f177c7759cfb33d3"

RPROVIDES:${PN} += "ghc-pretty-show-prof \
ghc-prof-pretty-show-1.10-9HKVlh92Ga177833HqSrwq"

RDEPENDS:${PN} += "ghc-pretty-show-devel \
ghc-prof-array-0.5.8.0-2a42 \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-ghc-prim-0.13.0-f55c \
ghc-prof-haskell-lexer-1.2.1-4PpJ3cUTICwEJqFuz43JwQ \
ghc-prof-pretty-1.1.3.6-b7fd \
ghc-prof-text-2.1.4-cf23"

inherit rpm
