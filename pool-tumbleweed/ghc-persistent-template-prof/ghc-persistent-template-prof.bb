SUMMARY = "Haskell persistent-template profiling library"
DESCRIPTION = "This package provides the Haskell persistent-template profiling library."
LICENSE = "MIT"

PV = "2.12.0.0"

RPM_NAME = "ghc-persistent-template-prof-2.12.0.0-1.18.aarch64.rpm"
RPM_HASH = "3b28cedb1a95c6bdb92f4ead05366a1dc26e52291c3976f6103d20d1fa086f9e3d61da0a6ac0d5203baee38a66ea8e37f0774888e7ff428c709a7670a84e83fc"

RPROVIDES:${PN} += "ghc-persistent-template-prof"

RDEPENDS:${PN} += "ghc-persistent-template-devel"

inherit rpm
