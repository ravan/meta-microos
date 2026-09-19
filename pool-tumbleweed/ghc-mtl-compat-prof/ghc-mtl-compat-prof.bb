SUMMARY = "Haskell mtl-compat profiling library"
DESCRIPTION = "This package provides the Haskell mtl-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "ghc-mtl-compat-prof-0.2.2-1.6.aarch64.rpm"
RPM_HASH = "93f285e5f1e8b10f1d20709d8897f856b1a206f4e454c2b069b0f4b7273f6abc3449bc1b742c30e31e39005fef6f37fee7b8899650606956472739bb76e318fe"

RPROVIDES:${PN} += "ghc-mtl-compat-prof"

RDEPENDS:${PN} += "ghc-mtl-compat-devel"

inherit rpm
