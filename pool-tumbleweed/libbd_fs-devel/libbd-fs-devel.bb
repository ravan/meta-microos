SUMMARY = "Development files for the libbd_fs plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_fs plugin/library.."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_fs-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "f2181c00d933fc53cb4c539f5c21fe4e535b9a426efedbedbec24c7d43f639ecf624e9ac27a094d9fa1b1ea1f497d06dc09316eddfdec01a63500def25d25247"

RPROVIDES:${PN} += "libbd-fs-devel \
libblockdev-fs-devel"

RDEPENDS:${PN} += "dosfstools \
glib2-devel \
libbd-fs3 \
libbd-utils-devel \
xfsprogs"

inherit rpm
