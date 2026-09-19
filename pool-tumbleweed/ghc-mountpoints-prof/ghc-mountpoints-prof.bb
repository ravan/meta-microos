SUMMARY = "Haskell mountpoints profiling library"
DESCRIPTION = "This package provides the Haskell mountpoints profiling library."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-prof-1.0.2-4.24.aarch64.rpm"
RPM_HASH = "68ef42c0900fca8d9006cf95dad6849a9a2e9993edec5f146935d6512c46a5957ca47869b3391de59cee61c0cbb03ac0328d1381467a99e18234ecae73f05513"

RPROVIDES:${PN} += "ghc-mountpoints-prof \
ghc-prof-mountpoints-1.0.2-35WJHyDVhGJG15R347ykZV"

RDEPENDS:${PN} += "ghc-mountpoints-devel \
ghc-prof-base-4.21.2.0-8844"

inherit rpm
