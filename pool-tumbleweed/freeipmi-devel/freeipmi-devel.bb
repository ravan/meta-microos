SUMMARY = "Development package for FreeIPMI"
DESCRIPTION = "Development package for FreeIPMI.  This package includes the FreeIPMI \
header files and static libraries."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.18"

RPM_NAME = "freeipmi-devel-1.6.18-1.3.aarch64.rpm"
RPM_HASH = "213f576c7c4af75ffdd275fcdd58aff711f88cf04bf9caaca5e8a561d081f16ec8144264ff753a68b8ee9b508763c144f13b8a93d4cf3d9f61ced3cd15cd139d"

RPROVIDES:${PN} += "freeipmi-devel \
pkgconfig-libfreeipmi \
pkgconfig-libipmiconsole \
pkgconfig-libipmidetect \
pkgconfig-libipmimonitoring"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
freeipmi \
libfreeipmi17 \
libipmiconsole2 \
libipmidetect0 \
libipmimonitoring6"

inherit rpm
