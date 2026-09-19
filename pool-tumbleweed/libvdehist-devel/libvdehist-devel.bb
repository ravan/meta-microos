SUMMARY = "VDE hist header files"
DESCRIPTION = "This package contains VDE hist header files"
LICENSE = "GPL-2.0-only"

PV = "2.3.2+svn587"

RPM_NAME = "libvdehist-devel-2.3.2+svn587-6.6.aarch64.rpm"
RPM_HASH = "a2b54b53efeafd8228ae6b72e7ae3ae5afa5190d4b6623465c3ff4ae0f4736cddc06a651494c217113363273518166d139cfb194b51669c233c14a3eeb225534"

RPROVIDES:${PN} += "libvdehist-devel \
libvdehist0-devel \
pkgconfig-vdehist"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdehist0 \
vde2"

inherit rpm
