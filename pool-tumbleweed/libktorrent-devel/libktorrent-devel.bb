SUMMARY = "Development files for libktorrent"
DESCRIPTION = "This package includes the necessary files for development using libktorrent."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libktorrent-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "e3c43bd3aae37b5763c2ce35d77403eded319767c0658fde6106683dd1f1566f5ac7f85517184dd45341a176ad92362a8c1f1a896ae6b135821a5034fd98d22f"

RPROVIDES:${PN} += "cmake-KTorrent6 \
libktorrent-devel"

RDEPENDS:${PN} += "cmake-KF6Archive \
cmake-KF6Config \
cmake-KF6KIO \
cmake-Qt6Core \
cmake-Qt6Network \
gmp-devel \
libKTorrent6 \
libboost-headers-devel \
pkgconfig-libgcrypt"

inherit rpm
