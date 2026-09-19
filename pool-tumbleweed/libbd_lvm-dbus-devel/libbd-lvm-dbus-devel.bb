SUMMARY = "Development files for the libblockdev-lvm-dbus plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_lvm-dbus plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_lvm-dbus-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "195eda1af01f51ee76cc3cbb367022e7d4a91e078e5b04c03f452cf6cc9ddeb0194d3d83cba72384512c38348a9b0da4590077f58dff2bf2fcd875d542ee11c1"

RPROVIDES:${PN} += "libbd-lvm-dbus-devel \
libblockdev-lvm-dbus-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-lvm-dbus3 \
libbd-lvm-devel \
libbd-utils-devel"

inherit rpm
