SUMMARY = "Headers and sources for developing against lapackpp"
DESCRIPTION = "This package provides the headers and sources needed for developing apps \
against lapackpp."
LICENSE = "BSD-3-Clause"

PV = "2025.05.28"

RPM_NAME = "lapackpp-devel-2025.05.28-1.5.aarch64.rpm"
RPM_HASH = "578e6c072e2b6327efddfbc794f31d16951ce9687b3dc79ecdf259075d729254ebce16474e29b936c4dfdcf1764b310d536325a5d09a3974eaa0629b205027ad"

RPROVIDES:${PN} += "cmake-lapackpp \
lapackpp-devel"

RDEPENDS:${PN} += "cmake-blaspp \
cmake-lapack \
liblapackpp2"

inherit rpm
