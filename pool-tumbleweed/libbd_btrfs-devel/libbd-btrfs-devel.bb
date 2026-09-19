SUMMARY = "Development files for the libbd_btrfs plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_btrfs plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_btrfs-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "d687c749ee9e1682b44fcdfd47cdafb14f843f223db06b8d1f1b36c935dd77eaa4c07f0e4bbfc501289922a5a0dc290ebf9ed98873237ade654e325d6eb20d5b"

RPROVIDES:${PN} += "libbd-btrfs-devel \
libblockdev-btrfs-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-btrfs3 \
libbd-utils-devel"

inherit rpm
