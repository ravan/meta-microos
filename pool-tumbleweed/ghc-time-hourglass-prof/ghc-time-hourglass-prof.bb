SUMMARY = "Haskell time-hourglass profiling library"
DESCRIPTION = "This package provides the Haskell time-hourglass profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-time-hourglass-prof-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "9cdb204d3f5231574d5b3645fcb68fb8ab1ef61da7fc6f393cc3841d2fd2ca4887fdf25b78d8e300b138db2f56d06d6ecf91d0cdfb2899a7f0e443f1544c700b"

RPROVIDES:${PN} += "ghc-prof-time-hourglass-0.3.0-3eH7mx2lN21L13Pl8jWv6l \
ghc-time-hourglass-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-time-hourglass-devel"

inherit rpm
