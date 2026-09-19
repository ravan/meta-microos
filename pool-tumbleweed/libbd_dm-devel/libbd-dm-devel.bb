SUMMARY = "Development files for the libbd_dm plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_dm plugin/library.."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_dm-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "7cdf1be6b05d7af6c3d0829d9a8cb58853bb0079b55e85ea396b17dca8061aea1598dafb86033a4de136e16a6f96aeddc9bc58ce93950128c786e0e726b57dde"

RPROVIDES:${PN} += "libbd-dm-devel \
libblockdev-dm-devel"

RDEPENDS:${PN} += "device-mapper-devel \
glib2-devel \
libbd-dm3 \
libbd-utils-devel \
systemd-devel"

inherit rpm
