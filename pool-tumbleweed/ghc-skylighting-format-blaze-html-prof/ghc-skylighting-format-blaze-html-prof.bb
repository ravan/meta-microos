SUMMARY = "Haskell skylighting-format-blaze-html profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-blaze-html profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-skylighting-format-blaze-html-prof-0.1.2-1.3.aarch64.rpm"
RPM_HASH = "f070d1da9ee37de8fcb305c4d4cafbbae51e280f266cb8673602ec283cbdd6332e20511627b46da1b34fac4e3c6c6a580e31903e84d45351db521975ee716604"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-blaze-html-0.1.2-8KLHTNpYrUCBAqffmTPiOR \
ghc-skylighting-format-blaze-html-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-blaze-html-0.9.2.0-93B80xR5emg3yG3V6J7j6o \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-prof-text-2.1.4-cf23 \
ghc-skylighting-format-blaze-html-devel"

inherit rpm
