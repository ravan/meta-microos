SUMMARY = "Haskell hourglass profiling library"
DESCRIPTION = "This package provides the Haskell hourglass profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-prof-0.2.12-8.23.aarch64.rpm"
RPM_HASH = "ae24ce34e579b1ecef4aed4c15a574481cdbec13258eee080c6d76f9b3955846afe777441c32079ff0577c3b88c8f8c0df7a881a7293b0698cf93d46ea6e2b01"

RPROVIDES:${PN} += "ghc-hourglass-prof \
ghc-prof-hourglass-0.2.12-AVWrQ59TfGxLOqFeNnaO7o"

RDEPENDS:${PN} += "ghc-hourglass-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350"

inherit rpm
