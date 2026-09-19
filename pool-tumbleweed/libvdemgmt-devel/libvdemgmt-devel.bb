SUMMARY = "VDE management files"
DESCRIPTION = "This package contains VDE management files"
LICENSE = "GPL-2.0-only"

PV = "2.3.2+svn587"

RPM_NAME = "libvdemgmt-devel-2.3.2+svn587-6.6.aarch64.rpm"
RPM_HASH = "13992fa30131db85365eb8dc64ea8b2bc2eab9ac6acc7af117745ff67a8c4f85139fac1ea94edf36f56059427dcd013b29255195551fd56fa221e5ca9e4c3054"

RPROVIDES:${PN} += "libvdemgmt-devel \
libvdemgmt0-devel \
pkgconfig-vdemgmt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdemgmt0 \
vde2"

inherit rpm
