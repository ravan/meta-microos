SUMMARY = "Development files for analitza, a mathematical feature library"
DESCRIPTION = "Development files for Analitza. The Analitza library lets developers \
add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "analitza-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9af11f561f501730e35e238c12e272873643632295590f619ae2249dab5f37a916eacfba8b56c884288c03ef5eb98a5d06f67e005e4ce5b1e4eaf21c6d1c93e9"

RPROVIDES:${PN} += "analitza-devel \
cmake-Analitza6"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6Xml \
libAnalitza9"

inherit rpm
