SUMMARY = "Development headers and libraries for libapparmor"
DESCRIPTION = "These libraries are needed for developing software that makes use of the \
AppArmor API."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "libapparmor-devel-5.0.2-2.1.aarch64.rpm"
RPM_HASH = "315f48f5babe69313acf150194195095964c01973ecf928a7319f2cd67c22b6a9fd29f950630c00e84b57a87f5d13fc0d4dbe6798a6d322b82f0f19fd08777f1"

RPROVIDES:${PN} += "libapparmor-/usr/include/sys/apparmor.h \
libapparmor-devel \
pkgconfig-libapparmor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libapparmor1"

inherit rpm
