SUMMARY = "C++ Interface for XML Files -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.3"

RPM_NAME = "libxml++26-devel-2.42.3-2.6.aarch64.rpm"
RPM_HASH = "695a6fd79a79b4e7fab00ae7421ddc6ceb54f72963b8e5943ee628eac89fef4a0af3a901d888257fc98bbb5873126cbfa37bdbd269f802e3985beda043140c5b"

RPROVIDES:${PN} += "libxml++26-devel \
pkgconfig-libxml++-2.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxml++-2-6-2 \
pkgconfig-glibmm-2.4 \
pkgconfig-libxml-2.0"

inherit rpm
