SUMMARY = "Development headers for libhangul"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libhangul."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "libhangul-devel-0.2.0-1.5.aarch64.rpm"
RPM_HASH = "29788efe81fed7365a5f11179aea931c2b6e95a886b515cfd35049fc3f456aa8c52c48c0ec46ece6a2526bed8561bf1d9141c7fb1fea1a398778847ffc09fcea"

RPROVIDES:${PN} += "libhangul-devel \
pkgconfig-libhangul"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhangul1"

inherit rpm
