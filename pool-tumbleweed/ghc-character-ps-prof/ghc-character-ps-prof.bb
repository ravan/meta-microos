SUMMARY = "Haskell character-ps profiling library"
DESCRIPTION = "This package provides the Haskell character-ps profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-character-ps-prof-0.1-1.17.aarch64.rpm"
RPM_HASH = "4a7caca60e26831521e2cbf33a107a9344b35331da1beee13d682988c9978f7297df52373a4975d112e69469033bd2979e1a314690d3d36a43e01f9d71395568"

RPROVIDES:${PN} += "ghc-character-ps-prof \
ghc-prof-character-ps-0.1-GfoAEUDpxFcFC0QreRJRaJ"

RDEPENDS:${PN} += "ghc-character-ps-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
