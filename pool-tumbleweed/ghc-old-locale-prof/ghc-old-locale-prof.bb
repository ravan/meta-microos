SUMMARY = "Haskell old-locale profiling library"
DESCRIPTION = "This package provides the Haskell old-locale profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-prof-1.0.0.7-13.23.aarch64.rpm"
RPM_HASH = "bd816c2ff629e569a56c4027fc74722019b09f419e4ab312beb97650be86193a4fef21dcba96fab35c9f2d12bca9fea235ceadec844974a2e38058193a079370"

RPROVIDES:${PN} += "ghc-old-locale-prof \
ghc-prof-old-locale-1.0.0.7-DplRrAcnBM96ijBftoXSc5"

RDEPENDS:${PN} += "ghc-old-locale-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
