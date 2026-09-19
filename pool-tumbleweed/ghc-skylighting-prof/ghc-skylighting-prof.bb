SUMMARY = "Haskell skylighting profiling library"
DESCRIPTION = "This package provides the Haskell skylighting profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.7"

RPM_NAME = "ghc-skylighting-prof-0.14.7-1.13.aarch64.rpm"
RPM_HASH = "9ea17a948873d2fffdd6cde3155dddb01a4b6ade2472559af95453b256bfee2a85d4c56781cee7233fa713dfab81e65f3c6a5de4c76ee1f541242b1b455edd0d"

RPROVIDES:${PN} += "ghc-prof-skylighting-0.14.7-K7tduWH6oDI3SHlt3x5zoz \
ghc-skylighting-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-binary-0.8.9.3-9861 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-prof-skylighting-format-ansi-0.1-CknB8O3hJJk2idRwuOLFgG \
ghc-prof-skylighting-format-blaze-html-0.1.2-8KLHTNpYrUCBAqffmTPiOR \
ghc-prof-skylighting-format-context-0.1.0.2-EzEDygUtfEzGScwK06ebkH \
ghc-prof-skylighting-format-latex-0.1-1TNSCzX0YGK3X45liMm1xQ \
ghc-prof-skylighting-format-typst-0.1-EVTf55sbYfZHcIDokFEiNE \
ghc-skylighting-devel"

inherit rpm
