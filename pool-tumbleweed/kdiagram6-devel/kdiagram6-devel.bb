SUMMARY = "Development package for the KDiagram libraries"
DESCRIPTION = "Development package for the KDiagram libraries"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "kdiagram6-devel-3.0.1-1.10.aarch64.rpm"
RPM_HASH = "7e84b22116e9e85a0357bdf2cd939a1a0b5b51e6351f1aaedf1d7cb2e17d732b78f3839326658128aad49fc51c1ddf223c77fa2a1062e57a77802ca8b1f71de1"

RPROVIDES:${PN} += "cmake-KChart6 \
cmake-KGantt6 \
kdiagram6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6PrintSupport \
cmake-Qt6Svg \
cmake-Qt6Widgets \
libKChart6-3 \
libKGantt6-3"

inherit rpm
