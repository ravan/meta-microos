SUMMARY = "Haskell isocline profiling library"
DESCRIPTION = "This package provides the Haskell isocline profiling library."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-prof-1.0.9-3.12.aarch64.rpm"
RPM_HASH = "ff0ecb6717de59361db24e41bc55775a7192b127b607a3701f6110c4a815a0fc39564ac277da08b2464ac0cf483214b56a4496a1f2d3ec44141065d54d4bd7ff"

RPROVIDES:${PN} += "ghc-isocline-prof \
ghc-prof-isocline-1.0.9-1LtJKbO57TxJAL2UMR5S4N"

RDEPENDS:${PN} += "ghc-isocline-devel \
ghc-prof-base-4.21.2.0-8844 \
ghc-prof-bytestring-0.12.2.0-65be \
ghc-prof-text-2.1.4-cf23"

inherit rpm
