SUMMARY = "Haskell commonmark-pandoc profiling library"
DESCRIPTION = "This package provides the Haskell commonmark-pandoc profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "ghc-commonmark-pandoc-prof-0.3-1.2.aarch64.rpm"
RPM_HASH = "3817fd36c95b6183daaa3ba380d49a024432d5aaf2280508f9a92d64139e1dfda99b465f343e24f4f4dd6f1a50c9d86ac55f4fe9c0d155f5d0f1285543b7d015"

RPROVIDES:${PN} += "ghc-commonmark-pandoc-prof \
ghc-prof-commonmark-pandoc-0.3-LD3VUAgig8i7h5XtC6wGuG"

RDEPENDS:${PN} += "ghc-commonmark-pandoc-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-commonmark-0.3-Hb0ZVJyoQFw1ynqgbLue51 \
ghc-prof-commonmark-extensions-0.2.7-1mQ1nSXKMfxCcwI2Hy1vjF \
ghc-prof-pandoc-types-1.23.1.2-ChVVUkZ84FqF7WWwilaI65 \
ghc-prof-text-2.1.4-cf23"

inherit rpm
