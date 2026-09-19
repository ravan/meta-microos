SUMMARY = "Haskell skylighting-format-typst library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-typst library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-skylighting-format-typst-devel-0.1-1.27.aarch64.rpm"
RPM_HASH = "7aa48a39fc4ab3ede2005703a86be4c064903f0c083823edcd96d5e69cf97646d7c6576472cd34fe23302e545eee6ff3845fe4ed7567c11c0c2a7360dcd21fb4"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-typst-0.1-EVTf55sbYfZHcIDokFEiNE \
ghc-skylighting-format-typst-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-devel-text-2.1.4-cf23 \
ghc-skylighting-format-typst"

inherit rpm
