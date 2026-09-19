SUMMARY = "Development files for FAudio"
DESCRIPTION = "Header files, pkg-config and CMake package files needed to build \
applications against FAudio."
LICENSE = "Zlib"

PV = "26.08"

RPM_NAME = "FAudio-devel-26.08-1.1.aarch64.rpm"
RPM_HASH = "a2cff76631a35e2b18d7de966ecc6e18071c69b124e779e5efd14b73ee095eccdd1d744be0e04128b6e1f606d773b9701965f74d2a18a4a4a7935fe3ba1ebfd9"

RPROVIDES:${PN} += "FAudio-devel \
cmake-FAudio \
pkgconfig-FAudio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libFAudio0 \
pkgconfig-sdl3"

inherit rpm
