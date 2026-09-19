SUMMARY = "Development package for the KDiagram libraries"
DESCRIPTION = "Development package for the KDiagram libraries"
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "kdiagram-devel-2.8.0-2.5.aarch64.rpm"
RPM_HASH = "2f88189702ca5a5b9af4346726a678f40de6bf46b4a709098a670a37b5682a9bf709766f9622b6bb198519141a10876e8107c0d385310752caf71f44501686d9"

RPROVIDES:${PN} += "cmake-KChart \
cmake-KGantt \
kdiagram-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5PrintSupport \
cmake-Qt5Svg \
cmake-Qt5Widgets \
libKChart2 \
libKGantt2"

inherit rpm
