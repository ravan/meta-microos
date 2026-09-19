SUMMARY = "Haskell postgresql-libpq-configure profiling library"
DESCRIPTION = "This package provides the Haskell postgresql-libpq-configure profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11"

RPM_NAME = "ghc-postgresql-libpq-configure-prof-0.11-2.6.aarch64.rpm"
RPM_HASH = "6a7431a13a8ace29db6c33a40ef3446f4a7458e889fa2eb59415e5fc4d3a7ee0f2b297e18812a2006b2565d812a6cafd27c9beef78e6931d57c5f0b288e32213"

RPROVIDES:${PN} += "ghc-postgresql-libpq-configure-prof"

RDEPENDS:${PN} += "ghc-postgresql-libpq-configure-devel"

inherit rpm
