SUMMARY = "Haskell commonmark-extensions library development files"
DESCRIPTION = "This package provides the Haskell commonmark-extensions library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.7"

RPM_NAME = "ghc-commonmark-extensions-devel-0.2.7-1.2.aarch64.rpm"
RPM_HASH = "7c63ceca89142e205f4eb66cafeb291de6079ff61c1962b5e1d4deb7d27ff63c1dc294bbd71c62121a46f06c47268cc53224b75bb6f5444bd79eef5ac7908300"

RPROVIDES:${PN} += "ghc-commonmark-extensions-devel \
ghc-devel-commonmark-extensions-0.2.7-1mQ1nSXKMfxCcwI2Hy1vjF"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commonmark-extensions \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-commonmark-0.3-Hb0ZVJyoQFw1ynqgbLue51 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-emojis-0.1.5-AZAxFgnk0gPLtmkqpmmj2s \
ghc-devel-filepath-1.5.5.0-b25b \
ghc-devel-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-transformers-0.6.3.0-4709"

inherit rpm
