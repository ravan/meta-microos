SUMMARY = "Haskell skylighting-format-typst profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-typst profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-typst-prof-0.1-1.27.aarch64.rpm"
RPM_HASH = "88f48485fe84bb2d1e8da16aa4e9ece486ab90eea00a8f1993ce132005751f7dae953ae83bdfc08c49c2c9319dbf4a88d423f5ad3613857e7dc6c17aa60f96b3"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-typst-0.1-EVTf55sbYfZHcIDokFEiNE \
ghc-skylighting-format-typst-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-prof-text-2.1.4-cf23 \
ghc-skylighting-format-typst-devel"

inherit rpm
