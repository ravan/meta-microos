SUMMARY = "Development files for libbladeRF"
DESCRIPTION = "Libraries and header files for developing applications that want to make \
use of libbladerf."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "bladeRF-devel-2.6.0-22.3.aarch64.rpm"
RPM_HASH = "dd2ee24315e127b4528afb591b5da8cad12dbc337dee205bd2b630c887f630334831de275cd445b6ab2627874432722ddb80a83cd2a133e6cef26fd2324cad6a"

RPROVIDES:${PN} += "bladeRF-devel \
cmake-bladeRF \
pkgconfig-libbladeRF"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbladeRF2"

inherit rpm
