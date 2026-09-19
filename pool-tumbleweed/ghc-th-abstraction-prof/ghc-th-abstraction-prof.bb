SUMMARY = "Haskell th-abstraction profiling library"
DESCRIPTION = "This package provides the Haskell th-abstraction profiling library."
LICENSE = "ISC"

PV = "0.7.2.0"

RPM_NAME = "ghc-th-abstraction-prof-0.7.2.0-1.3.aarch64.rpm"
RPM_HASH = "0d3d2f2a35153ea58cbf589ebdf27de066da1359697c74b6d369c201744415356b938c3749e09ac1410b66952a772fd9a740dba77c0dc79f816c5a0cb1125aee"

RPROVIDES:${PN} += "ghc-prof-th-abstraction-0.7.2.0-LVMuWnluhDI5se4FHUInw7 \
ghc-th-abstraction-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.21.2.0-8844 \
ghc-prof-containers-0.7-d5e1 \
ghc-prof-template-haskell-2.23.0.0-358a \
ghc-th-abstraction-devel"

inherit rpm
