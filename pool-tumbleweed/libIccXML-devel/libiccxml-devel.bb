SUMMARY = "Headers, Configuration and static Libs + Documentation"
DESCRIPTION = "Header files, libraries and documentation for development of Color Management \
applications."
LICENSE = "BSD-3-Clause"

PV = "0.9.8"

RPM_NAME = "libIccXML-devel-0.9.8-2.38.aarch64.rpm"
RPM_HASH = "a7cd796d729e1353fa05f461f693c4c603601ce02fb50df2b4d83071f833ac17447be3716b4c1aaf9b962c3854c92c6f6ebb49e2baff02c5c106e7187d726444"

RPROVIDES:${PN} += "libIccXML-devel \
pkgconfig-iccxml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libIccXML2"

inherit rpm
