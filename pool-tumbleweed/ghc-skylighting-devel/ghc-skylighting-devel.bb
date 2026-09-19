SUMMARY = "Haskell skylighting library development files"
DESCRIPTION = "This package provides the Haskell skylighting library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.7"

RPM_NAME = "ghc-skylighting-devel-0.14.7-1.13.aarch64.rpm"
RPM_HASH = "dba1fde880ed4359bfc6c6b6403352b1d2ef15838955d212197e386aefb0f98317456a94c0c59d6e7b7d6e225d0565354749787b57cb6f9a6a53186f2c5aa9b9"

RPROVIDES:${PN} += "ghc-devel-skylighting-0.14.7-K7tduWH6oDI3SHlt3x5zoz \
ghc-skylighting-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-devel-skylighting-format-ansi-0.1-CknB8O3hJJk2idRwuOLFgG \
ghc-devel-skylighting-format-blaze-html-0.1.2-8KLHTNpYrUCBAqffmTPiOR \
ghc-devel-skylighting-format-context-0.1.0.2-EzEDygUtfEzGScwK06ebkH \
ghc-devel-skylighting-format-latex-0.1-1TNSCzX0YGK3X45liMm1xQ \
ghc-devel-skylighting-format-typst-0.1-EVTf55sbYfZHcIDokFEiNE \
ghc-skylighting"

inherit rpm
