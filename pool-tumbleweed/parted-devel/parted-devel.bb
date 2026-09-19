SUMMARY = "Parted Include Files and Libraries necessary for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-3.0-or-later"

PV = "3.7"

RPM_NAME = "parted-devel-3.7-1.3.aarch64.rpm"
RPM_HASH = "ba69b0414bbb6878766d06655df5cefeade894166cfa7539d55117886e343d0fbcecaf3f57e4846252f900364944836549033cbb0692a641c85bdd46397a66ef"

RPROVIDES:${PN} += "parted-devel \
pkgconfig-libparted \
pkgconfig-libparted-fs-resize"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
device-mapper-devel \
libparted-fs-resize0 \
libparted2"

inherit rpm
