SUMMARY = "Haskell githash profiling library"
DESCRIPTION = "This package provides the Haskell githash profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.0"

RPM_NAME = "ghc-githash-prof-0.1.7.0-1.34.aarch64.rpm"
RPM_HASH = "b3639dedb75d5eb7e41cd04de682d51d1b00e7b2689d21ab905f970c5dc55f50c72a2bf5e8faac888e663342da8a55a5c379732cd190575cccdf36d696d0611c"

RPROVIDES:${PN} += "ghc-githash-prof \
ghc-prof-githash-0.1.7.0-CZogn6tBFSRH7zyPP5YHJu"

RDEPENDS:${PN} += "ghc-githash-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-directory-1.3.10.1-b1d7 \
ghc-prof-filepath-1.5.5.0-b25b \
ghc-prof-process-1.6.26.1-905d \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp"

inherit rpm
