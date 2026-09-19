SUMMARY = "Headers for the ZMusic library"
DESCRIPTION = "This subpackage contains the headers for the zmusic library, which is ZDoom's \
music component library."
LICENSE = "GPL-3.0-only"

PV = "1.3.0"

RPM_NAME = "zmusic-devel-1.3.0-1.5.aarch64.rpm"
RPM_HASH = "bd6e7597241cb941f9e46a3ceef7a7600a737147650755642d44782dacacf51d662bead0541f27fad6da34eaa2b12670a4859db4417737887cac6f837f94ff7d"

RPROVIDES:${PN} += "cmake-ZMusic \
zmusic-devel"

RDEPENDS:${PN} += "libzmusic1"

inherit rpm
