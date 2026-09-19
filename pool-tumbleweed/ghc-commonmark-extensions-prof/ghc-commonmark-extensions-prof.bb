SUMMARY = "Haskell commonmark-extensions profiling library"
DESCRIPTION = "This package provides the Haskell commonmark-extensions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.7"

RPM_NAME = "ghc-commonmark-extensions-prof-0.2.7-1.2.aarch64.rpm"
RPM_HASH = "f0863c3b5324bc2d67eb2c3b3138e25cdfe9224293a7f29a365bef7a43d0b25a164d877703478cbc021bf40f72e729017dffbced87b1e938f2d6999de160b738"

RPROVIDES:${PN} += "ghc-commonmark-extensions-prof \
ghc-prof-commonmark-extensions-0.2.7-1mQ1nSXKMfxCcwI2Hy1vjF"

RDEPENDS:${PN} += "ghc-commonmark-extensions-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-commonmark-0.3-Hb0ZVJyoQFw1ynqgbLue51 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-emojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-text-2.1.4-cf23 \
ghc-prof-transformers-0.6.3.0-4709"

inherit rpm
