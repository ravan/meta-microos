SUMMARY = "VDE plug header files"
DESCRIPTION = "This package contains VDE plug header files"
LICENSE = "GPL-2.0-only"

PV = "2.3.2+svn587"

RPM_NAME = "libvdeplug-devel-2.3.2+svn587-6.6.aarch64.rpm"
RPM_HASH = "65a117bff44587300d1f3c2db2e258b7c071590651f148df5f29aa66d477a2ba709ad997d51c13bbef348e5711601837c5a466077ff7cdb44b4d418009bfe52e"

RPROVIDES:${PN} += "libvdeplug-devel \
libvdeplug3-devel \
pkgconfig-vdeplug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdeplug3 \
vde2"

inherit rpm
