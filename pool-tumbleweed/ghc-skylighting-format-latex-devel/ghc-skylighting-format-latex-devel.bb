SUMMARY = "Haskell skylighting-format-latex library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-latex library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-latex-devel-0.1-2.79.aarch64.rpm"
RPM_HASH = "b6ef8ea0cf67d2d1a259bf1e38e6f139e02b6db8ab9300407a312e21702d60bee920845d092b3b915bfc400e35ff81fdcf0a6609420fc40f979498d0c82efe43"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-latex-0.1-1TNSCzX0YGK3X45liMm1xQ \
ghc-skylighting-format-latex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-devel-text-2.1.4-cf23 \
ghc-skylighting-format-latex"

inherit rpm
