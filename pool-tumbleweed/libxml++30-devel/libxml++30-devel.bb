SUMMARY = "C++ Interface for XML Files -- Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.5"

RPM_NAME = "libxml++30-devel-3.2.5-2.6.aarch64.rpm"
RPM_HASH = "3d38978f9eeac9bd4f66d594aaf835717ec246f4ccb31ded3b25920acc7b5b56397de31e4aeb3df217905fff27ed22d32b7423e1d3cfa8e79d5beb77ab6a7103"

RPROVIDES:${PN} += "libxml++30-devel \
pkgconfig-libxml++-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibmm2-devel \
libxml++-3-0-1 \
pkgconfig-glibmm-2.4 \
pkgconfig-libxml-2.0"

inherit rpm
