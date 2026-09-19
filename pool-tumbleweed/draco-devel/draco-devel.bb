SUMMARY = "Development files for draco"
DESCRIPTION = "Draco is a library for compressing and decompressing 3D geometric meshes \
and point clouds. It is intended to improve the storage and transmission of \
3D graphics."
LICENSE = "Apache-2.0"

PV = "1.5.7"

RPM_NAME = "draco-devel-1.5.7-3.2.aarch64.rpm"
RPM_HASH = "d3066d27760c848d0f4dfee66f30b0c760c21a76af79f6f1011b2b38a9f8f2c24821bd487fca09afd92c85f428813ae98597bee897404b70d6159ef4313ab1c6"

RPROVIDES:${PN} += "cmake-draco \
draco-devel \
pkgconfig-draco"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdraco9"

inherit rpm
