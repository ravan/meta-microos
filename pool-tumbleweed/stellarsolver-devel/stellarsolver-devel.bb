SUMMARY = "Development files for stellarsolver"
DESCRIPTION = "Development headers and libraries for stellarsolver."
LICENSE = "GPL-3.0-or-later"

PV = "2.8"

RPM_NAME = "stellarsolver-devel-2.8-1.3.aarch64.rpm"
RPM_HASH = "03f29625b547b7d28a1bea3d158d6991f8d56b402aae73bbb0ee2b7095db721a6628adee04b7a953b15f83d4fa3346699c61c846407a9416d103645a68bb6808"

RPROVIDES:${PN} += "cmake-StellarSolver \
pkgconfig-stellarsolver \
stellarsolver-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstellarsolver6-2"

inherit rpm
