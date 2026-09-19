SUMMARY = "Development files for the libblockdev-smart plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libblockdev-smart plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_smart-devel-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "a7555975dc1beff7592594aee0032994a1e77d8cb173f0ec604699937bc1f19f4db62c66eb05988819a5054371a43fbb60fff6e167cf1427f9ae52173f58b192"

RPROVIDES:${PN} += "libbd-smart-devel \
libblockdev-smart-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-smart3 \
libbd-utils-devel"

inherit rpm
