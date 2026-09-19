SUMMARY = "Haskell refact profiling library"
DESCRIPTION = "This package provides the Haskell refact profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-prof-0.3.0.2-4.19.aarch64.rpm"
RPM_HASH = "a2fff47a95fd86f29bbeb5d23cd21d598fd7d8f3c9afecc1acdd2f91bb620f5c78a2c4da061c2ceadfe19558655100ced840e1aee6365e2f4a1a5024e9dcb5de"

RPROVIDES:${PN} += "ghc-prof-refact-0.3.0.2-BbwdNckJT1UJcRbLtga6Lt \
ghc-refact-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-refact-devel"

inherit rpm
