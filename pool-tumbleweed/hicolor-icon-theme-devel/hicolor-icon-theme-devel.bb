SUMMARY = "Development files for hicolor-icon-theme"
DESCRIPTION = "A package containing the development files for hicolor-icon-theme \
Currently, there is only a pkgconfig file"
LICENSE = "GPL-2.0-or-later"

PV = "0.18"

RPM_NAME = "hicolor-icon-theme-devel-0.18-1.6.noarch.rpm"
RPM_HASH = "0517138e6f19b773a0e3c6bfc1374812647e092ca7c54186e6362d01cfc74d4bb400da34665b611d5bcd1f5f6c811f90ce55fb53c0219e0603c4bc53a671c777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hicolor-icon-theme-devel \
pkgconfig-default-icon-theme"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hicolor-icon-theme"

inherit rpm
