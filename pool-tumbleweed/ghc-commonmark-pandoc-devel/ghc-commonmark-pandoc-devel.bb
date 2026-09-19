SUMMARY = "Haskell commonmark-pandoc library development files"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "ghc-commonmark-pandoc-devel-0.3-1.2.aarch64.rpm"
RPM_HASH = "00fa4fd5891f836ffeca89be6fb26e9ee6c48192827c01d5320ffb57674b22f92c14eeb26b47fe35e4e945e665e06a0f8e7fb4b97cfaa1dd0680869aeffce8ed"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-devel \
ghc-devel-commonmark-pandoc-0.3-LD3VUAgig8i7h5XtC6wGuG"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-commonmark-pandoc \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-commonmark-0.3-Hb0ZVJyoQFw1ynqgbLue51 \
ghc-devel-commonmark-extensions-0.2.7-1mQ1nSXKMfxCcwI2Hy1vjF \
ghc-devel-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-devel-text-2.1.4-cf23"

inherit rpm
