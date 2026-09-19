SUMMARY = "Haskell unicode-collation library development files"
DESCRIPTION = "This package provides the Haskell unicode-collation library development \
files."
LICENSE = "BSD-2-Clause"

PV = "0.1.3.7"

RPM_NAME = "ghc-unicode-collation-devel-0.1.3.7-1.3.aarch64.rpm"
RPM_HASH = "5032041d76af3d2b450462df7a960b61ee7d86cc983089a2bdfc4c8ab6351f48e20237b09cbae3009d97fdbcd52385f28465472a7b863644975c392cc92f8fcc"

RPROVIDES:${PN} += "ghc-devel-unicode-collation-0.1.3.7-15abqneWG6p19BxNVdLS7C \
ghc-unicode-collation-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.21.2.0-8844 \
ghc-devel-binary-0.8.9.3-9861 \
ghc-devel-bytestring-0.12.2.0-65be \
ghc-devel-containers-0.7-d5e1 \
ghc-devel-parsec-3.1.18.0-be05 \
ghc-devel-template-haskell-2.23.0.0-358a \
ghc-devel-text-2.1.4-cf23 \
ghc-devel-th-lift-instances-0.1.20-A0nCC2bmuVRHGZj0nSUeyw \
ghc-unicode-collation"

inherit rpm
