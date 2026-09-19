SUMMARY = "Development files for gtk2-engines"
DESCRIPTION = "This package contains development files for gtk2-engines."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-engines-devel-2.20.2-23.6.aarch64.rpm"
RPM_HASH = "2c4e5ac9f053c81f3cdafba1436ec89cdfb047dea73952f449e3807e1048c71becb41509de4dc13f4d0965a93b1115636820f7c52ae94f4a5fcc89cde6352a83"

RPROVIDES:${PN} += "gtk2-engines-devel \
pkgconfig-gtk-engines-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-engines \
pkgconfig-gtk+-2.0"

inherit rpm
