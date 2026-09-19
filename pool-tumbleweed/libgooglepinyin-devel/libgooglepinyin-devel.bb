SUMMARY = "Development files for libgooglepinyin"
DESCRIPTION = "The libgooglepinyin-devel package includes the header files for the googlepinyin package."
LICENSE = "Apache-2.0"

PV = "0.1.2"

RPM_NAME = "libgooglepinyin-devel-0.1.2-14.5.aarch64.rpm"
RPM_HASH = "22185edfb17299f6c39ec0669012c9643c01e988eaa54cc2e17cff5d6162484f00de8be4ece9776e96f4403cd7bed8ca9305d03dfc293819b8dd1ac7395c2fd0"

RPROVIDES:${PN} += "libgooglepinyin-devel \
pkgconfig-googlepinyin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgooglepinyin0"

inherit rpm
