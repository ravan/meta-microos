SUMMARY = "Haskell skylighting-format-context profiling library"
DESCRIPTION = "This package provides the Haskell skylighting-format-context profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-prof-0.1.0.2-1.79.aarch64.rpm"
RPM_HASH = "e0180e0f9643a9e2dd3636d21a885d49241265b8daf4013294f306acd279e1428f8e53ecc3ef2886ca03f3533427e6d8bdec422e651f5018d802467e84727647"

RPROVIDES:${PN} += "ghc-prof-skylighting-format-context-0.1.0.2-EzEDygUtfEzGScwK06ebkH \
ghc-skylighting-format-context-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-skylighting-core-0.14.7-HkvmMdabOkA2nMBfVgE9uo \
ghc-prof-text-2.1.4-cf23 \
ghc-skylighting-format-context-devel"

inherit rpm
