SUMMARY = "Haskell network-uri profiling library"
DESCRIPTION = "This package provides the Haskell network-uri profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.6.4.2"

RPM_NAME = "ghc-network-uri-prof-2.6.4.2-3.29.aarch64.rpm"
RPM_HASH = "03b70f8ad1e7ee63e281dd23b2f503fe36dc348eb742edf5802ea3bdc3992caa46f3fa841f7e5116c828eab580eeb47a3c88122f9310d625578034bac3becea0"

RPROVIDES:${PN} += "ghc-network-uri-prof \
ghc-prof-network-uri-2.6.4.2-BA29PoG9pX1EAcGKolsVh8"

RDEPENDS:${PN} += "ghc-network-uri-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-deepseq-1.5.1.0-1350 \
ghc-prof-parsec-3.1.18.0-be05 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-prof-th-compat-0.1.7-A4ZdivYymzPCDISaa5LNtp"

inherit rpm
