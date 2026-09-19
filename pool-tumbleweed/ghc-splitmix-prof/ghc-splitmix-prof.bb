SUMMARY = "Haskell splitmix profiling library"
DESCRIPTION = "This package provides the Haskell splitmix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3.2"

RPM_NAME = "ghc-splitmix-prof-0.1.3.2-1.3.aarch64.rpm"
RPM_HASH = "6d475f6e045bd61ff70d9c00d3cc943c166c1cd0eb70b3cb8e6d05dfb3204afa81d05e8ca70c9d08d0d445ca84621e165fcd85fd820c79c6e9dfead1a75114bb"

RPROVIDES:${PN} += "ghc-prof-splitmix-0.1.3.2-4FIxgclJzmILwETMtGxhg4 \
ghc-splitmix-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-splitmix-devel"

inherit rpm
